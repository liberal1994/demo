package demo.collection;

import java.util.Arrays;
import java.util.List;

public class TestAsList {
    public static void main(String[] args) {
        Integer[] arr=null;
        arr=new Integer[]{1,2,3,4,5};
        List<Integer> list1= Arrays.asList(arr);
        System.out.println(list1.size());

        list1.set(2,5);
        System.out.println(list1.size());
    }
}
