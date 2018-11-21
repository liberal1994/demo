package demo.table_adt;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class MyList<T> implements Iterable<T> {
    private int size;
    private T[] arr;
    private static final int DEFAULT_CAPACITY = 20;
    private int modCount;

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public MyList() {
        clear();
    }

    public void clear() {
        size = 0;
        ensureCapacity(DEFAULT_CAPACITY);
    }

    public void trimToSize() {
        ensureCapacity(size);
    }

    private void ensureCapacity(int newCapacity) {
        if (newCapacity < size) {
            return;
        }
        T oldArr[] = arr;
        arr = (T[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            arr[i] = oldArr[i];
        }
    }

    public T set(int idx, T x) {
        rangeCheck(idx);
        T oldVal = arr[idx];
        arr[idx] = x;
        return oldVal;
    }

    public T get(int idx) {
        rangeCheck(idx);
        return arr[idx];
    }

    private void rangeCheck(int idx) {
        if (idx < 0 || idx >= size()) {
            throw new IndexOutOfBoundsException();
        }
    }

    public void remove(int idx) {
        rangeCheck(idx);
        for (int i = idx; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        modCount++;
    }


    public void add(int idx, T x) {
        if (arr.length == size) {
            ensureCapacity(2 * size + 1);
        }
        for (int i = size; i > idx; i--) {
            arr[i] = arr[i - 1];
        }
        arr[idx] = x;
        size++;
        modCount++;
    }

    public void add(T x) {
        add(size, x);
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<T>();
    }

    private class MyIterator<T> implements Iterator {

        private int cursor = 0;
        private int lastret = -1;
        private int concurrentMod = modCount;

        public MyIterator() {

        }

        @Override
        public boolean hasNext() {
            concurrentModCheck();
            return cursor != size();
        }

        @Override
        public T next() {
            concurrentModCheck();
            T element = (T) arr[cursor];
            lastret = cursor;
            cursor++;
            return element;
        }

        @Override
        public void remove() {
            concurrentModCheck();
            if (lastret < 0) {
                throw new UnsupportedOperationException();
            }
            MyList.this.remove(--cursor);
            lastret = -1;
            concurrentMod = modCount;
        }

        private void concurrentModCheck() {
            if (concurrentMod != modCount) {
                throw new ConcurrentModificationException();
            }
        }
    }
}
