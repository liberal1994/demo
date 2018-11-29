package pattern.singleton.lazyload;

/**
 * 懒汉式：可以实现懒加载：但是线程不安全，使用synchronized效率下降
 */
public class City {
    private static City city;

    private City() {
    }

    public synchronized static City getCity() {
        if (city == null) {
            city = new City();
        }
        return city;
    }
}
