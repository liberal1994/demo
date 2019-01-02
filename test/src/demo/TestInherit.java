package demo;

public class TestInherit {
    public static void main(String[] args) {
        System.out.println(Child.pa);
        Parent parent=new Child();
        System.out.println(parent.pa);
    }

}
class Parent{
    static {
        System.out.println("parent is loaded");
        pa=2;
    }
    public static int pa=1;
    {
        pa=3;
    }
    public Parent(){
        System.out.println("parent is created");
        this.pa=4;
    }
    public void test(){
        this.pa=5;
    }
}
class Child extends Parent{
    public static int ch=1;
    static {
        System.out.println("child is loaded");
        ch=2;
    }
    {
        ch=3;
    }
    public Child(){
        System.out.println("child is created");
        this.ch=4;
    }
    public void test(){
        this.ch=5;
    }
}