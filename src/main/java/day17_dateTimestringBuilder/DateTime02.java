package day17_dateTimestringBuilder;

import java.time.LocalDate;

public class DateTime02 {
    public static void main(String[] args) {

        /*
       soru 1)
       -bugunun tarihini obje olusturarak yazdirin
       -bugun yilin kacinci gunu oldugunu yazdirin
       -hangi gunde oldugumuzu yazdirin
       -yılın bitmesine kac gun kaldıgını yazdırın
       -bugunden itibaren 3yil 5 ay 7gun sonraki tarihi yazdirin
       -bugunden itibaren 2yil 2 ay 2 gun sonraki tarihin ayin kacinci gunu oldugunu yazdirin
       -bugunden itibaren 7yil 7 ay 7 gun sonraki tarihin haftanin hangi gunu oldugunu yazdirin
       -ikinci bir tarih objesi olusturun ve iki tarihi karsilastirin ve bize eski olan tarihi dondurun
*/

        //bugunun tarihini obje olusturarak yazdirin
        LocalDate today = LocalDate.now();
        System.out.println(today);

        //bugun yilin kacinci gunu oldugunu yazdirin
        System.out.println(today.getDayOfYear());
        System.out.println(today.getDayOfMonth());

        //yılın bitmesine kac gun kaldıgını yazdırın
        System.out.println(today.lengthOfYear() - today.getDayOfYear());

        //bugunden itibaren 3yil 5 ay 7gun sonraki tarihi yazdirin
        System.out.println(today.plusYears(3).plusMonths(5).plusDays(7));

        //bugunden itibaren 2yil 2 ay 2 gun sonraki tarihin ayin kacinci gunu oldugunu yazdirin
        System.out.println(today.plusYears(2).plusMonths(2).plusDays(2).getDayOfMonth());

        // bugunden itibaren 7yil 7 ay 7 gun sonraki tarihin haftanin hangi gunu oldugunu yazdirin
        System.out.println(today.plusYears(7).plusMonths(7).plusDays(7).getDayOfWeek());

        // ikinci bir tarih objesi olusturun ve iki tarihi karsilastirin ve bize eski olan tarihi dondurun

        LocalDate newdate = LocalDate.of(2025, 1, 27);
        if (newdate.isBefore(today)) {
            System.out.println(newdate);
        } else {
            System.out.println(today);
        }

    }
}
