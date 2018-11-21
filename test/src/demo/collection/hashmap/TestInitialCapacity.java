package demo.collection.hashmap;

public class TestInitialCapacity {
    public static void main(String[] args) {
        Integer a=-12;
        Integer b=a>>>2;
        Integer c=a>>2;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toString(b));
        System.out.println(Integer.toBinaryString(c));
        System.out.println(Integer.toString(c));
    }
}
