package pattern.singleton.hungerStyle;

/**
 * 饿汉式：天然线程安全；无法实现懒加载：加载这个类的时候就会调用构造方法
 */
public class City {
    private static City city = new City();

    private City() {
    }

    public static City getCity() {
        return city;
    }
}
