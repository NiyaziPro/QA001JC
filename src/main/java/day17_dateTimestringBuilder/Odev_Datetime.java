package day17_dateTimestringBuilder;

import java.time.LocalDateTime;

public class Odev_Datetime {
    public static void main(String[] args) {

         /*
                odev!!!
                    soru 3)
                    bize bugunun tarihini ve su anki saati dondurun
                    bize 3 ay 100 saat sonraki tarih ve saati dondurun
                    bize 100 gun once 100 saat sonraki tarihi dondurun
                    bize 3 yil 5 ay 10 gün 1000 saat sonraki tarihin haftanin hangi günü oldugunu dondurun
                    bize sadece bugunun tarihi dondurun
                     //LocalDateTime kullanarak yapın tum hepsini
                 */

        // bize bugunun tarihini ve su anki saati dondurun
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);
        //bize 3 ay 100 saat sonraki tarih ve saati dondurun
        System.out.println(today.plusMonths(3).plusHours(100));
        //bize 100 gun once 100 saat sonraki tarihi dondurun
        System.out.println(today.minusDays(100).plusHours(100));
        // bize 3 yil 5 ay 10 gün 1000 saat sonraki tarihin haftanin hangi günü oldugunu dondurun
        System.out.println(today.plusYears(3).plusMonths(5).plusDays(10).plusHours(1000).getDayOfWeek());
        //bize sadece bugunun tarihi dondurun
        System.out.println(today.toLocalDate());
        



    }
}
