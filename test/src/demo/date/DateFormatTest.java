package demo.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatTest {

    public static void main(String[] args) throws ParseException {
        String dateStr = "2018-12-01 12:00:00";
        Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(dateStr);
        System.out.println(date.toString());
//        Calendar c = Calendar.getInstance();
//        c.setTime(new Date());
//        c.set(Calendar.HOUR_OF_DAY, 12);
//        System.out.println(c.getTime());

    }


}
