package day03casting_scanner_increment;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Ornek 5: Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        //rakamlarin toplamini yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir tamsayi giriniz : ");
        int num = input.nextInt();

        int ilkIki = num / 1000;
        int sonIki = num % 100;
        System.out.println("Ilk iki basamak : " + ilkIki);
        System.out.println("Son iki basamak : " + sonIki);

        System.out.println("Toplamlari : " + (ilkIki + sonIki));


       /*  //1. adım scanner objesi
            Scanner input=new Scanner(System.in);
           //2. adım kullanıcıya mesaj vermek
            System.out.println("lutfen 5 basamaklı bir tam sayi giriniz");
           //3. adım variable'a atama islemi
            int num=input.nextInt();

           //Java'da bir tamsayiyi baska bir tamsayiya bolerseniz sonuc daima tamsayi olur
           //Java kusuratlari yani .'dan sonrasini siler
            int ilkIki=num/1000;//45

           //bir sayinin birler basamagini almak icin 10'a bolumunden kalanı alırız
           //onlar basamagini almak icin 100'e bolumunden kalanı alırız
           // % ==> modulus bu isaret bolumunden kalanı almaya yarar
            int sonIki=num%100;

            System.out.println("ilk iki basamak : "+ilkIki);
            System.out.println("son iki basamak : "+sonIki);

            System.out.println("toplamlari : "+(ilkIki+sonIki));

*/
        int a = 5, b = 6;
        System.out.println(a + b);
    }
}
