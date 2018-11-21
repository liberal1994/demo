package pattern.bridge;

public class Dell implements Brand{

    @Override
    public void show() {
        System.out.println("Hello ,this is dell");
    }
}
