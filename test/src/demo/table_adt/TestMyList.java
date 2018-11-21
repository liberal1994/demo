package demo.table_adt;

import java.util.Iterator;

public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> list=new MyList<>();
        list.add(5);
        list.add(3);
        list.add(6);
        list.add(9);
        list.add(1);
        list.add(4);
        list.add(8);
        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
            if(it.next()%2==0){
                it.remove();
            }
        }
        for(Integer i:list){
            System.out.println(i);
        }
    }
}
