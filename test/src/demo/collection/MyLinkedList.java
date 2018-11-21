package demo.collection;

public class MyLinkedList<T> {
    private class Node<T>{
        private Node previous;
        private Node next;
        private T obj;

        public Node getPrevious() {
            return previous;
        }

        public void setPrevious(Node previous) {
            this.previous = previous;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public T getObj() {
            return obj;
        }

        public void setObj(T obj) {
            this.obj = obj;
        }

        public Node(Node previous, Node next, T obj) {
            this.previous = previous;
            this.next = next;
            this.obj = obj;
        }

        public Node() {
        }

    }
    private Node first;
    private Node last;
    private static int size;
    public int size(){
        return size;
    }
    public void add(T obj){
        if(null==first){
            first=new Node();
            first.setObj(obj);
            last=first;
        }else{
            Node temp=new Node();
            temp.setObj(obj);
            last.setNext(temp);
            temp.setPrevious(last);
            last=temp;
        }
        size++;
    }
    public void rangeCheck(int index){
        try {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException();
            }
        }catch(IndexOutOfBoundsException e){
                e.printStackTrace();
        }
    }
    private Node getNode(int index){
        rangeCheck(index);
        Node temp=first;
        for(int i=0;i<index;i++){
            temp.getNext();
        }
        return temp;
    }
    public T get(int index){
        rangeCheck(index);
        return (T)getNode(index).getObj();
    }
    public void remove(T obj){
        Node temp=first;
        if(temp.getObj()==obj){
            first=temp.getNext();
        }
        do{
            temp=temp.getNext();
            T curr=(T)temp.getObj();
            if(obj==curr){
                if(temp!=last){
                    Node pre=temp.getPrevious();
                    Node next=temp.getNext();
                    pre.setNext(next);
                    next.setPrevious(pre);
                }
                last=temp.getPrevious();
                size--;
            }
        }while(temp!=last);
    }
    public void remove(int index){
        rangeCheck(index);
        Node temp=getNode(index);
        if(index==0){
            first=temp.getNext();
        }
        else if(index==size){
            last=last.getPrevious();
        }else{
            Node pre=temp.getPrevious();
            Node next=temp.getNext();
            pre.setNext(next);
            next.setPrevious(pre);
        }
        size--;
    }
    public void insert(int index,T obj){
        rangeCheck(index);
        Node temp=new Node();
        temp.setObj(obj);
        Node curr=getNode(index);
        if(index!=size-1){
            Node next=curr.getNext();
            next.setPrevious(temp);
            temp.setNext(next);
            curr.setNext(temp);
            temp.setPrevious(curr);
        }else{
            last.setNext(temp);
            temp.setPrevious(last);
            last=temp;
        }
        size++;
    }

    public static void main(String[] args) {
        MyLinkedList<String > list=new MyLinkedList<String>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        list.add("wuxi");
        for(int i=0;i<size;i++){
            System.out.println(list.get(i));
        }
    }
}
