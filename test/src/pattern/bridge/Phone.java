package pattern.bridge;

public class Phone implements EProduct{

    @Override
    public void operate(Brand brand) {
        brand.show();
        System.out.println("I hava least size");
    }
}


