package pattern.factorymethod;

public class BenZi implements Car {
    @Override
    public void run(){
        System.out.println("BENZI is running");
    }
    @Override
    public void addOil(){
        System.out.println("BENZI is adding Oil");
    }
}
