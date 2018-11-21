package pattern.factorymethod;

import javax.smartcardio.Card;

public class AudiFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new Audi();
    }
}
