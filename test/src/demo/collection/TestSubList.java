package demo.collection;

import java.util.ArrayList;
import java.util.List;

public class TestSubList {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>(20);
        for(int i=1;i<=20;i++){
            list1.add(i);
        }
        list1.subList(5,10).clear();
        System.out.println(list1.size());
        System.out.println(list1);
    }


}
