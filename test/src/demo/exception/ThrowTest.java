package demo.exception;

public class ThrowTest {

    public static void main(String[] args) throws Exception {
        test(2);
        test(-1);
    }

    public static void test(int num){
        if(num<0){
//            throw new RuntimeException();//运行时异常抛出时不用进行处理
            try {
                throw new Exception();//受检异常抛出时必须进行处理。抛出或者try...catch
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Normal");
        return;
    }

}
