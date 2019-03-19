package pl.szymonkuhn.dateTime;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.TimeZone;

public class DateTimeTasks {

    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("Current date: " + now);

        Date epoch = new Date(1);
        System.out.println("Epoch date: " + epoch);
        System.out.println("Now i older then epoch: " + now.before(epoch));
        System.out.println("compare: " + now.compareTo(epoch));
        System.out.println(epoch.toString());
        System.out.println(now.toString());
        System.out.println(now.hashCode());
        System.out.println();
        Calendar calendar = Calendar.getInstance();
//        System.out.println("Current calendar: " + calendar);
//        Calendar beginOf21century = Calendar.getInstance();
//        beginOf21century.set(Calendar.YEAR, 2000);


        Calendar birth = Calendar.getInstance();
        birth.set(Calendar.YEAR, 1984);
        birth.set(Calendar.MONTH, 8);
        birth.set(Calendar.DAY_OF_MONTH, 3);


        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MMMM-dd HH:mm:ss");
        String dateAsString = dateFormat.format(now);
        System.out.println("Today is: " + dateAsString);
        dateAsString = dateFormat.format(epoch);
        System.out.println("Epoch is: " + dateAsString);
        System.out.println("Birthday: " + birth.getTime());

        dateFormat.setTimeZone(TimeZone.getTimeZone("Tokio"));
        System.out.println("Birthday: " + birth.getTime());




    }
}
