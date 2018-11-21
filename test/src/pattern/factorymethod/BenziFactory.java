package pattern.factorymethod;

public class BenziFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new BenZi();
    }
}
