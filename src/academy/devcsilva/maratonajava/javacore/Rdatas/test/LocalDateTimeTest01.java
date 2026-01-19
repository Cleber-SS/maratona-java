package academy.devcsilva.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date1 = LocalDate.of(2027, Month.AUGUST, 6);
        LocalDate date2 = LocalDate.parse("2027-08-06"); //mesma coisa que a linha de cima.
        LocalTime time1 = LocalTime.of(9, 45, 21);
        LocalTime time2 = LocalTime.parse("09:45:21");//mesma coisa que a linha de cima.
        System.out.println(localDateTime);
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(time1);
        System.out.println(time2);

        //Dar para juntar as duas classe (localDate e LocalTime).
        LocalDateTime ldt1 = date2.atTime(time2);
        LocalDateTime ldt2 = time2.atDate(date2);
        System.out.println(ldt1);
        System.out.println(ldt2);
    }
}
