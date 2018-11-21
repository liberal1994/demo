package pattern.decorate;

public class FlyCar implements Car{
    private Car car;
    public FlyCar(Car car){
        this.car=car;
    }
    public FlyCar(){}
    @Override
    public void move() {
        System.out.println("I can fly");
        if(null!=car){
            car.move();
        }
    }
}
