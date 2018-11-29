package pattern.singleton.test;

public class Test {
    public static void main(String[] args) {
        City shanghai1=CityFactory.getCity("shanghai");
        City shanghai2=CityFactory.getCity("shanghai");
        System.out.println(shanghai1);
        System.out.println(shanghai2);


    }
}
