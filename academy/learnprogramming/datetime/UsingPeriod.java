package academy.learnprogramming.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class UsingPeriod {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2017, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2017, Month.APRIL,30);

        Period period = Period.ofWeeks(1);

        cleanAnimalCage(start, end, period);

        // start.toEpochDay(); // number of days since january 1 1970

        System.out.println(start.plus(period));
        System.out.println(LocalDateTime.now().plus(period));
        // System.out.println(LocalTime.now().plus(period)); // unsupported unit days. cant add days to localtime

        // Period yearsAndMonth = Period.ofYears(1).ofMonths(1); /// cannot chain methods on period class. this will only show the month if you sout


        Period yearAndMonth = Period.of(1,1,1); // we can change this if we want a different period of time
        System.out.println(yearAndMonth);
        
    }

    public static void cleanAnimalCage(LocalDate start, LocalDate end, Period period){
        while(start.isBefore(end)){
            System.out.println("need to clean cage on date = " + start);
            start = start.plus(period);
        }
    }
    public static void cleanAnimalCage(LocalDate start, LocalDate end){
        while(start.isBefore(end)){
            System.out.println("Need to clean the cage on the date = " + start);
            start = start.plusMonths(1); // adding 1 month
        }
    }
}