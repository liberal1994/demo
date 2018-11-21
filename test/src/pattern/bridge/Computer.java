package pattern.bridge;

public class Computer implements EProduct {
    @Override
    public void operate(Brand brand) {
        brand.show();
        System.out.println("I hava largest size");
    }
}
