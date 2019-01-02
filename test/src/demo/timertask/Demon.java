package demo.timertask;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Demon {

    public static void main(String[] args) {

        File file=new File("E://setting.properties");
        BufferedReader reader= null;
        Properties props=new Properties();
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd-hh:mm");
        Date date=null;
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
            props.load(reader);
            String dateStr=props.getProperty("onTimeDate");
            date=format.parse(dateStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        },date);

    }


}
