package pattern.bridge;

public class Pad implements EProduct{
    @Override
    public void operate(Brand brand) {
        brand.show();
        System.out.println("I hava middle size");
    }
}
