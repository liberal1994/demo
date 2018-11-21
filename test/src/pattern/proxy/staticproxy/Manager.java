package pattern.proxy.staticproxy;

public class Manager implements People {
    private Star myStar;

    public Manager(Star star) {
        this.myStar = star;
    }

    public Manager() {

    }

    public void perform() {
        prepare1();
        prepare2();
        myStar.sing();
        clean1();
        clean2();
    }

    public void prepare1() {
        System.out.println("preparing step 1......");
    }

    public void prepare2() {
        System.out.println("preparing step 2......");
    }

    public void clean1() {
        System.out.println("cleaning step 1.......");
    }

    public void clean2() {
        System.out.println("cleaning step 2.......");
    }

    @Override
    public void sing() {
        System.out.println("Sorry, I cannot sing..");
    }
}
