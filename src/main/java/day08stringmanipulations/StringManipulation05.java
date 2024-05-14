package day08stringmanipulations;

public class StringManipulation05 {
    public static void main(String[] args) {
        /*
         Java'da memory kullanimi : Java'da memory yonetimi JVM (Java Virtual Machine) tarafindan otomatik olarak yapilir
         Java'da iki ana bellek vardir : HEAP (yigin) ve STACK(yigin)
         ==> Heap dinamic olarak olusturulan Object'ler icin kullanilir
         yani new keyword'u ile olusturdugumuz yapilar

         */

        String str1 = new String("Merhaba");
        String str2 = new String("Merhaba");
        String str3 = str1;

        System.out.println(str1.equals(str3)); // true - cunku sadece degerlerimize bakti
        System.out.println(str2 == str1);      // false - cunku deger'e ve adreslerine bakti
        System.out.println(str2.equals(str1)); // true
        System.out.println(str1 == str3);      // true
    }
}
