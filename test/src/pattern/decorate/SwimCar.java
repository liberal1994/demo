package pattern.decorate;

public class SwimCar implements Car {
    private Car car;
    public SwimCar(Car car){
        this.car=car;
    }
    public SwimCar(){}
    @Override
    public void move() {
        System.out.println("I can swim");
        if(null!=car){
            car.move();
        }
    }
}
