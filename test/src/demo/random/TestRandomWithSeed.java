package demo.random;

import java.util.Random;

public class TestRandomWithSeed {
    private final static int SEED = 100;

    public static void main(String[] args) {
        //由相同seed产生的随机数生成器生成的对应个数上的随机数时相同的
        Random r1 = new Random(SEED);
        Random r2 = new Random(SEED);

        r1.nextInt(100);
        for (int i = 0; i < 10; i++) {
            System.out.print(r1.nextInt(100) + "\t");
        }
        //r1先生成了一个随机数，所以r2生成的随机数与r1错开了一个
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(r2.nextInt(100) + "\t");
        }
    }
}
