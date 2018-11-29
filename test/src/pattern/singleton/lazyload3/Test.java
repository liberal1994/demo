package pattern.singleton.lazyload3;

public class Test {
    public static void main(String[] args) {
        City c1=City.getCity();
        City c2=City.getCity();
        System.out.println(c1);
        System.out.println(c2);
    }

}
