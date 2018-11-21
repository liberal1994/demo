package demo.math;

import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        Random ra=new Random(4);
        int a=ra.nextInt(20);
        System.out.println(a);
    }
}
