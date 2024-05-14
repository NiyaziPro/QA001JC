package Mentoring;

import java.time.LocalTime;

public class TestSorulari08 {
    public static void main(String[] args) {
        /*
        Eger saat :
            !)      24:00 ile 05:00 arasında ise konsola 'Uyku zamanı' yazdırınız.
            !!)     08:00 ile 16:00 arasında ise konsola 'Çalısma zamanı' yazdırınız.
            !!!)    19:00 ile 22:00 arasında ise konsola 'Aile zamanı' yazdırınız.
            !v)     Digerleri için konsolda 'Kisisel zaman' yazdırınız.
         */

        LocalTime timeNow = LocalTime.now();
        int time = timeNow.minusHours(7).getHour();
        System.out.println(time);

        if (time > 0 && time < 5) {
            System.out.println("Uyku zamanı");
        } else if (time > 8 && time < 16) {
            System.out.println("Çalısma zamanı");
        } else if (time > 19 && time < 22) {
            System.out.println("Aile zamanı");
        } else {
            System.out.println("Kisisel zaman");
        }
    }


}