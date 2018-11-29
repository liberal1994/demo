package pattern.singleton.lazyload2;

public class Test implements Runnable {
    public static void main(String[] args) {
        new Thread(new Test()).start();
    }

    @Override
    public void run() {
        int count=0;
        while(true){
            if(count<100) {
                City c = City.getCity();
                System.out.println(c);
                count++;
            }
        }
    }
}
