package demo.exception;

public class ThrowTest {

    public static void main(String[] args) throws Exception {
        test(2);
        test(-1);
    }

    public static void test(int num) throws Exception{
        if(num<0){
            throw new Exception();
        }
        System.out.println("Normal");
        return;
    }

}
