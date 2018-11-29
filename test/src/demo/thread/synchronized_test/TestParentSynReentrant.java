package demo.thread.synchronized_test;

/**
 * 父类方法也可重入
 */
public class TestParentSynReentrant {
    public static void main(String[] args) {
        new Thread(new Son()).start();
    }
}

class Son extends Parent implements Runnable{
    synchronized void son() {
        System.out.println("son...");
    }

    @Override
    public void run() {
        parent();
        son();
    }
}

class Parent {
    synchronized void parent() {
        System.out.println("parent...");
    }

}