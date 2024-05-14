package day02Variables;

public class Concatination {
    public static void main(String[] args) {
        //Ornek 1: Bir String ve iki int variable olusturun.
        // String degeri ile Integer'larin toplamini console'a yazdirin.
        //Example 1: Create a String and two int variables.
        // Print the string value and the sum of the Integers to the console.

        String str = "Apple";
        int a = 10;
        int b = 25;
        System.out.println("str+a+b = " + str + a + b);     // str+a+b = Apple1025
        System.out.println("str+(a+b) = " + str + (a + b)); // str+(a+b) = Apple35
        System.out.println(a+b+str);                        // 35Apple
        System.out.println("Concatination : " +a+b);        // Concatination : 1025

        //Java da "+" sembolu iki sayi arasinda kullanilirsa "toplama islemi" olur
        //Java da "+" sembolu iki String veya bir String ve bir sayi arasinda kullanilirsa "concatenation" islemi olur
        //"concatenation" islemi birlestirme yapar
        //Not: Concatenation islemlerinde Java matematikteki islem onceligini kullanir
        //Java daima yukarıdan asagıya ve soldan sag dogru ilerler islemleri yapar
        /*
            matematikteki islem oncelikleri :
        1)parantez ici islemleri yapar
        2)us alma islemleri yapılır
        3)carpma ve bolme islemleri
        4)toplama ve cıkarma islemleri
        5)eger ayni oncelige sahipse soldan saga dogru islemler sirasiyla yapılır.
         */


    }
}
