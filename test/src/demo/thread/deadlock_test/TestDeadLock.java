package demo.thread.deadlock_test;


public class TestDeadLock {
    private static A a = new A();
    private static B b = new B();

    public static void m1() {
        synchronized (a) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (b){
                System.out.println("a->b");
            }
        }
    }

    public static void m2() {
        synchronized (b) {
            synchronized (a){
                System.out.println("b->a");
            }
        }
    }


    public static void main(String[] args) {
        new Thread() {
            public void run() {
                m1();
            }
        }.start();
        new Thread() {
            public void run() {
                m2();
            }
        }.start();
    }
}

class A {

    void a() {
        System.out.println("a...");
    }


}

class B {

    void b() {
        System.out.println("b...");
    }


}