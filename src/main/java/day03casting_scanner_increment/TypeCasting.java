package day03casting_scanner_increment;

public class TypeCasting {
    public static void main(String[] args) {
        /*
        * Type Casting -> tip donusturmek
          Sayisal primitive data turlerinin birbirine donusturulmesine typecasting denir*/

        byte a = 25;
        short b = a;
        System.out.println(b);
    /*
    Not 1) kucuk data type'lar buyuk data type'lara cevilirebilir java bunu otomatik olarak yapar
    bu isleme de biz AutoWidening(otomatik genişleme) denir
     */

        //Ornek 1: byte data type' ini int data type'ina ceviriniz.==>AutoWidening“ (Otomatik genisletme)
        //Example 1: Convert byte data type to int data type.
        byte x = 34;
        int y = x;
        System.out.println(y);

        //Ornek 2 : int data type' ini short data type' ina ceviriniz.Explicit Narrowing (Aciktan Daraltma)
        //Example 2: Convert int data type to short data type.

        int c = 5;
        short n = (short) c;
        System.out.println(n);

        double dbl = 25.658;
        int dbl1 = (int) dbl;
        System.out.println(dbl1); // 25


    }
}
