package pattern.singleton.lazyload2;

/**
 * 懒汉式：可以实现懒加载：但是线程不安全，使用synchronized效率下降
 * double check:但是某些编译器在优化性能时可能会导致意外的错误产生
 */
public class City {
    private static City city;

    private City() {
    }

    public static City getCity() {
        if (city == null) {
            synchronized (City.class) {
                if (city == null) {
                    city = new City();
                }
            }
        }
        return city;
    }
}
