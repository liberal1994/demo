package demo.collection;

import java.util.*;

public class TestCalendar {

    public Date getTime(){
        Calendar calendar=Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY,15);
        calendar.set(Calendar.MINUTE,55);
        calendar.set(Calendar.SECOND,0);
        Date time=calendar.getTime();
        return time;
    }
    public TestCalendar(int time){
        Date date=new Date(System.currentTimeMillis()+1000*time);
        System.out.println(time);
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("程序正在执行");
            }
        },time,2000);
    }

    public static void main(String[] args) {
        new TestCalendar(5);
    }

}
