package pattern.singleton.lazyload3;

/**
 * 利用静态内部类的方式实现懒加载的单例模式
 */
public class City {
    private static class InnerClass {
        private static City city = new City();
    }

    private City() {
    }

    public static City getCity() {
        return InnerClass.city;
    }
}
