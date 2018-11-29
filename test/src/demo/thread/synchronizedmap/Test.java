package demo.thread.synchronizedmap;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class Test {
    private static Map<Integer, String> map;

    public static void main(String[] args) {
//        map = new Hashtable<>();
//        map = Collections.synchronizedMap(new HashMap<>());
//        map=new ConcurrentHashMap<>();
//        map=new TreeMap<>();
        map=new ConcurrentSkipListMap<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            map.put(i, "" + i);
        }
        long end = System.currentTimeMillis();
        long time = (end - start) ;
        System.out.println("花费了" + time + "毫秒");


    }


}
