package pattern.decorate;

public class Test {
    public static void main(String[] args) {
        Car multiFunctionCar =new AICar(new FlyCar(new SwimCar()));
        multiFunctionCar.move();
    }
}
