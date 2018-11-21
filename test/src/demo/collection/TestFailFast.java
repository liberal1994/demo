package demo.collection;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestFailFast {
    public static void main(String[] args) {
        List<Integer> list=new CopyOnWriteArrayList<>();

        for(int i=0;i<10;i++){
            list.add(i);
        }
        Iterator<Integer> it=list.iterator();
        while (it.hasNext()){
            Integer temp=it.next();
            System.out.println(temp);
        }
        new Thread(){
            @Override
            public void run() {
                for(Integer temp:list){
                    if(temp==4){
                        list.remove(temp);
                    }
                }
            }
        }.start();
        System.out.println(list.size());
    }
}
