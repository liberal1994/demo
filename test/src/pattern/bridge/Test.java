package pattern.bridge;

public class Test {
    public static void main(String[] args) {
        EProduct iphone=new Phone();
        iphone.operate(new Apple());
    }
}
