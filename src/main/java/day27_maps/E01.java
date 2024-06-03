package day27_maps;

public class E01 {
    public static void main(String[] args) {

        /*Exception: Kod çalıştırıldığında akışı bozan hatalardır. "Beklenmedik sorunlar" demektir.
            Her exception, hata mesajını ve hata türüne ait bilgiyi içinde bulundurur.

            1- exception (İstisnalar) , normal kod yürütme akışını bozan hatalardir.

            2- exception bir classtir. Methodlari vardir. Kendi icinde hata kodlari, bilgi mesajlari vardir.
            Ornegin; classtaki bir method cagirildigi zaman kod calismaya baslar. Bu andan itibaren kodlar satir satir
            okunmaya baslar. Ve kodlarda bir hata varsa, exception durumu olusur.

            Tabi bu hatalari developer onceden ongorup handler etmeli, duzeltmelidir ama kullanici programimizi
            kullanirken ongorulmeyen durumlar her zaman olusabilir. Bir hata olustugunda neden kaynaklandigini
            ogrenip cozmek, o an cozulemiyorsa da sistemin durmayip calismasinin devam etmesi icin alternatif
            cozumler uretmek gerekiyor

            3- Bir exception oluştuğunda, kod yürütme durur. Exception'lar, hata ayıklama günlüklerinde(log) oturum açar.
            4- Exception Handling, Java'da, akışı kesintiye uğratmadan kodumuzdaki istenmeyen istisnaları
            veya sorunları işlememize olanak tanıyan bir yöntemdir

            5- Exception denince akliniza 3 seyin gelmesi lazim. try, catch ve finally (optional).

            6- Kod başarılı bir şekilde çalışmadığında bile, kullanıcı deneyiminin sorunsuz olmasını sağlamak için,
            tüm yürütmeleri bir try catch ifadesine sarmak programlama dünyasında en iyi uygulama olarak kabul edilir.
            Ancak, tüm kodları körü körüne try-catch blokları içine almak her zaman en iyi pratik değildir.
            Bu, hataları maskeleyebilir ve programın gerçek hataları gizlemesine yol açabilir.

            https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html
             */

        //1) ArithmeticException : Matematik kurallarinda herhangi bir hata yaparsaniz bu exception'i alirsiniz


        //bolme(1, 0); // HATA ArithmeticException: / by zero
        bolme2(2, 0);

    } // main sonu

    public static void bolme(int a, int b) {
        if (b == 0) {
            System.out.println("Sifir girmeyiniz!");
        } else {
            System.out.println(a / b);
        }
    }

    public static void bolme2(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Sifir ile bolunmez!");
        }
    }
}
