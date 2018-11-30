package pattern.templatemethod;

public class Test {
    public static void main(String[] args) {
        new Singer().perform();
        new Dancer().perform();
        new Company(){

            @Override
            public void showing() {
                System.out.println("Movie is showing...");
            }
        }.perform();


    }
}
