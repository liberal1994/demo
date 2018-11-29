package pattern.templatemethod;

public abstract class Company {
    private void signCompact(){
        System.out.println("compacting...");
    }
    private void preparing(){
        System.out.println("setting stage...");
    }
    public abstract void showing();

    public void perform(){
        signCompact();
        preparing();
        showing();
        clean();
        paying();

    }
    private void clean(){
        System.out.println("cleaning...");
    }
    private void paying(){
        System.out.println("paying...");
    }

}
