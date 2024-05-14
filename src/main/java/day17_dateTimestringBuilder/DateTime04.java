package day17_dateTimestringBuilder;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime04 {
    public static void main(String[] args) {
        //ornek 2: Kullanicindan dogum tarihini alan ve girdigi tarihin gun ismini bulan kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen dogum tarihinizi  yil-ay-gun olarak giriniz.");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        LocalDate girilenTarih = LocalDate.of(year, month, day);

        System.out.println(girilenTarih.getDayOfWeek());
        System.out.println(girilenTarih.getDayOfYear());

    }
}
