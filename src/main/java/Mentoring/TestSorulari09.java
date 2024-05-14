package Mentoring;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class TestSorulari09 {
    public static void main(String[] args) {
        //Japonya saat dilimi ile Almanya saat dilimi arasındaki saat farkını bulmak için kodu yazınız.

        LocalTime timeJapan = LocalTime.now(ZoneId.of("Japan"));
        LocalTime timeGermany = LocalTime.now(ZoneId.of("Europe/Berlin"));

        System.out.println("timeJapan = " + timeJapan);
        System.out.println("timeGermany = " + timeGermany);

        long fark = ChronoUnit.HOURS.between(timeJapan,timeGermany);
        System.out.println("fark = " + fark);


    }
}
