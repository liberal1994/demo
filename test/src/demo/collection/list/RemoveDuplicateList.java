package demo.collection.list;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicateList {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(7);
        list.add(3);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(2);

        List<Integer> newList=new ArrayList<>(new LinkedHashSet<>(list));
        System.out.println(newList);

    }


}
