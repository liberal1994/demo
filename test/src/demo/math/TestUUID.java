package demo.math;

import java.math.BigInteger;
import java.util.UUID;

public class TestUUID {
    public static void main(String[] args) {
        String str = UUID.randomUUID().toString().replaceAll("-", "").trim();
        BigInteger big = new BigInteger(str, 16);

        System.out.println(str);
        System.out.println(big);

    }
}
