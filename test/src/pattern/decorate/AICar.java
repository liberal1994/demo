package pattern.decorate;

public class AICar implements Car {
    private Car car;
    public AICar(Car car){
        this.car=car;
    }
    public AICar(){}
    @Override
    public void move() {
        System.out.println("I am smart");
        if(null!=car){
            car.move();
        }
    }
}
