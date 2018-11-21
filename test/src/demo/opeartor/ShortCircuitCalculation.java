package demo.opeartor;

public class ShortCircuitCalculation {
    public static void main(String[] args) {
        int i=30;
        int j=20;
        if(i<20||(i=i+1)>20){//短路运算
            System.out.println(i);
        }
        if(j<30&&j++>20){//j++和++j结果不同
            System.out.println(j);
        }
    }

}
