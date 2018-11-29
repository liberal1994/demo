package pattern.singleton.test;

public class City {
    private String name;
    private int age;
    private String capital;
    private long GDP;

    public City(){}
    public City(String name,int age,long GDP){
        this.name=name;
        this.age=age;
        this.GDP=GDP;
    }
    public City(String name,int age){
        this.name=name;
        this.age=age;
    }
    public City(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public long getGDP() {
        return GDP;
    }

    public void setGDP(long GDP) {
        this.GDP = GDP;
    }
}
