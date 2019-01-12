package demo.enumTest;

public class EnumTest {

    public static void main(String[] args) {

        String status = Status.selectByStatus(1).toString();
        System.out.println(Status.valueOf("READ_COMMITTED").toString());
        System.out.println(status);


    }


}
