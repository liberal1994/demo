package demo.generic;

import java.util.ArrayList;
import java.util.List;

public class TestOverloadWithGenericParam {


    /**
     * 编译后，泛型擦除，两个test方法都具有相同的方法签名（方法名相同，参数相同List<E> list）
     * @param list
     */
//    public static void test(List<String> list) {
//        System.out.println("test1 with String List");
//    }

    public static void test(List<Integer> list) {
        System.out.println("test2 with Integer List");
    }

//    public static String test(List<String> list){
//        return "";
//    }

    public static void main(String[] args) {
        test(new ArrayList<>());
    }

}
