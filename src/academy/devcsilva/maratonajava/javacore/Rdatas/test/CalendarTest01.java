package academy.devcsilva.maratonajava.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingo é o primeiro dia da semana");
        }

        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        c.add(Calendar.DAY_OF_WEEK, 2); //adiciona + 2 dias referente ao horário do sistema.
        c.add(Calendar.HOUR, 4); //adiciona + 4 horas referente ao horário do sistema.
//        c.roll(Calendar.HOUR, 10); //adiciona o horário sem mexer mo dia.
        Date date = c.getTime();
        System.out.println(date);
    }
}
