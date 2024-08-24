package academy.learnprogramming.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class CreatingDateTime {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        LocalDate localdate = LocalDate.of(2017, Month.JANUARY, 1);
        LocalTime localtime = LocalTime.of(10,30);
        System.out.println("================================================");
        System.out.println(localtime);
        System.out.println(localdate);
        System.out.println(LocalDateTime.of(localdate, localtime));
        System.out.println(new Date());
        System.out.println("================================================");
        Calendar calendar = Calendar.getInstance();

        calendar.set(2015, Calendar.JANUARY, 1);
        Date january = calendar.getTime();
        System.out.println(january);
    }
}
