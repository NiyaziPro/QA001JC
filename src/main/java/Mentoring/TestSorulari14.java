package Mentoring;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestSorulari14 {
    public static void main(String[] args) {
        //Ali'nin kaç gün yasadıgını bulan kodu yazınız.
        //Ali'nin dogum tarihi 12 Mayıs 2002'd!r.

        LocalDate birthday = LocalDate.of(2002,5,12);
        LocalDate today = LocalDate.now();
        long l = ChronoUnit.DAYS.between(birthday,today);
        System.out.println("Days : "+ l);
        long l1 = ChronoUnit.MONTHS.between(birthday,today);
        System.out.println("Month : "+l1);
    }
}
