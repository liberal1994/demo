package pattern.bridge;

public class Lenovo implements Brand {

    @Override
    public void show() {
        System.out.println("Hello, this is lenovo");
    }
}
