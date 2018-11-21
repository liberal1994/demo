package pattern.proxy.staticproxy;

public class Test {

    public static void main(String[] args) {

        Manager manager=new Manager(new Star());
        manager.perform();
    }

}
