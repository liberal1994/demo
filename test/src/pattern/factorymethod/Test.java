package pattern.factorymethod;

public class Test {
    public static void main(String[] args) {
        CarFactory audiFactory=new AudiFactory();

        Audi myAudi = (Audi) audiFactory.createCar();
        myAudi.run();
        myAudi.addOil();
    }
}
