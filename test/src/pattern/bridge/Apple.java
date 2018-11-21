package pattern.bridge;

public class Apple implements Brand {

    @Override
    public void show() {
        System.out.println("Hello, this is Apple");
    }
}
