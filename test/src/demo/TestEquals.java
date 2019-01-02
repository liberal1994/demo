package demo;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class TestEquals {
    public static void main(String[] args) {
        int a[]=new int[]{1,3,4};
        int b[]=a;
        b[2]=12;
        System.out.println(a==b);
    }


}
