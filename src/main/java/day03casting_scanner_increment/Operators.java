package day03casting_scanner_increment;

public class Operators {
    public static void main(String[] args) {
        /* Aritmetik operatorler :
         1) +,-,/,* islemleri java da matematikte nasil kullaniyorsak burda da ayni sekilde
         2) Not 1 : Java' da bir tamsayiyi bir tamsayiya bolersek cikti daima tamssayi
         3) Not 2 : Eger sonuc tam sayi degilse ondalikli kismi siler
         4) Not 3 : Eger bir matematiksel islemde iki farkli data type
                    kullanilirsa daima buyuk olana gore islem yapilir
         5) Not 4 : Javada us alma operatoru yoktur- us alma islemi yapmak icin Math.pow() methodunu aliriz*/

        System.out.println(Math.pow(2, 5));

        /*Mantiksal operatorler :
          And (&&) islemde true degerini alabilmek icin her seyin true olmasi gerekmektedir
          and islemini carpma islemi gibi dusunebiliriz

          Or (||) isleminde bir tane bile true deger varsa tum degerlerimiz true olarak gelir

          Not (!) operatoru - true degeri false, false olani true yapar.
          */

        /* Karsilastirma operatorleri :
           <,>,<=,>=,==,!=
           Not 1: Karsilastirma operatorleri kullandigimizda sonuc daima true veya false olarak doner*/

        /*
Aritmatik operatorler :
1)+,-,/,* islemleri java'da matematikte nasıl kullanıyorsak burda da ayni şekilde
2)Not 1: Java'da bir tamsayiyi diger bir tamsayiya bolersek cikti daima tamsayi
  Not 2: Eger sonuc tamsayi degilse ondalıklı kısmı siler
  Not 3: Eger bir matematiksel islemde iki farklı data type kullanılırsa daima buyuk olana gore islem yapılır
  Not 4: Java üs alma operatoru yoktu üs alma işlemi yapmak icin Math.pow() bu method alırız
 */
        double sayi1 = 258;
        int sayi2 = 100;
        System.out.println(sayi1 / sayi2);//2.5 beklerim fakat bana 2 verdi
        System.out.println(Math.pow(2, 5));


/*
Mantıksal operatorler :
And(&&) islemde true degerini alabilmek icin her şeyin true olmasi gerekmektedir
and islemini carpam islemi gibi dusunebilir

Or(||) isleminde bir tane bile true deger varsa tum degerlerimiz true olarak gelir

Not operatoru(!)true degeri false, false olani true yapar.
 */

/*
Karsilastirma operatorleri :
<,>,<=,>=,==,!=
Not 1: karsılasma operatlerini kullanıgımızda sonuc daima true veya false olarak doner(boolean)
 */
        boolean a = 3 < 5;//true
        boolean b = 2 + 3 != 5;//false
        boolean c = 2 + 3 * 5 >= 19;//false once carpma 17>19

        System.out.println(a && b);//false
        System.out.println(a || b || c);//true


    }
}
