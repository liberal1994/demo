package demo.thread.synchronized_test;

public class TestReentrantSynchronized {

    public static void main(String[] args) {
        new Thread(){
            public void run(){
                m1();
            }
        }.start();
    }

    static synchronized void m1() {
        m2();
        System.out.println("m1...");

    }

    static synchronized void m2() {
        System.out.println("m2...");
    }

}
