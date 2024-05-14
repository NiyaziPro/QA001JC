package day19_static_oop;

import java.time.LocalDate;

public class StaticBlock {
    /*"static" blok, bir class'in yüklenmesi sırasında otomatik olarak çalışan ve class'in başlatılmasını
veya başlangıç ayarlarını yapmayı sağlayan bir özelliktir. Statik blok, yalnızca bir kez çalıştırılır.
 Bu bloklar örneğin, veritabanı bağlantıları için kullanılır.
 Bu, uygulamanın herhangi bir bölümünde veritabanına erişim gerektiğinde bağlantının hızlı
 bir şekilde hazır olmasını sağlar.
 */

    //Bir variable olusturup deger atamazsaniz o variable'i initialize etmediniz demektir
    static double pi;//herhangi bir degeri yok

    static int price;


    /*
    bazi durumlarda variable'imizi main method oncesi kullanıma hazır hale getirmemiz gerekebilir
    bu durumlarda static block kullanılır
    static variabler static blocklar icinde initilaze edilirse o classin icinde herseyden once hazır hale gelir
     */

    public static void main(String[] args) {
        System.out.println(pi);//3.14//
        System.out.println("Main Method ici");
        System.out.println(price);
    }

    static {//static block
        pi = 3.12;
        System.out.println("Static Block 2");
        LocalDate currentDay = LocalDate.now(); // su anki tarihi alir
        if (currentDay.getMonthValue() == 5) { //mayis ayi diye kontrol eder
            price = 1000;                  // eger ay 5 ise fiyat 1000 olarak aksi takdirde 1500 olarak
        } else {
            price = 1500;

            /***Bu kod, class yüklendiğinde bir kere çalışır
             // ve o anki tarihe bağlı olarak price değişkeninin
             // değerini ayarlar. ve herhangi bir yerde price değişkenine erişildiğinde
             // bu değer kullanılır.
             // ***Onden ayarlama yapmis oluruz.
             */
        }
    }


    static {//static block
        pi = 3.15;
        System.out.println("Static Block 1");
    }

    //Senaryo: Mayis ayinda fiyatlarda indirim olacak. Class cagirildiginda otomatik price'i alacak
    //ve class'in heryerinde bu degeri kullanacak


}
