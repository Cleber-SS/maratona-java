package academy.devcsilva.maratonajava.javacore.Rdatas.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime zonedDateTime1 = now.atZone(tokyoZone);
        System.out.println(zonedDateTime1);

        Instant nowInstat = Instant.now();
        System.out.println(nowInstat);
        ZonedDateTime zonedDateTime2 = nowInstat.atZone(tokyoZone);
        System.out.println(zonedDateTime2);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime1 = now.atOffset(offsetManaus);
        System.out.println(offsetDateTime1);
        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, offsetManaus);
        System.out.println(offsetDateTime2);

        OffsetDateTime offsetDateTime3 = nowInstat.atOffset(offsetManaus);
        System.out.println(offsetDateTime3);

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
        LocalDate meijiEraLocalDate = LocalDate.of(1900, 2, 1);
        JapaneseDate meijiEra = JapaneseDate.from(meijiEraLocalDate);
        System.out.println(meijiEra);
    }
}
