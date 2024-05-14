package day11Loops;

import java.util.Random;
import java.util.Scanner;

public class WhileLoop05 {
    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        // Random rnd=new Random();
        // int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur

        Scanner input = new Scanner(System.in);

        Random rnd = new Random(); // rastgele sayi olusturmak icin kullanilir
        int sayi = rnd.nextInt(100); // random sayimizi olusturduk

        // eger kullanici sayiyi bulana kadar ugrasmis olsaydi :
        int kullaniciSayi;
        int tahminSayisi = 0; // sayac
        while (true) {
            System.out.println("Lutfen tahminde bulunmak icin 1-100 arasina bir sayi giriniz");
            kullaniciSayi = input.nextInt();
            tahminSayisi++;
            if (kullaniciSayi > sayi) {
                System.out.println("Lutfen daha kucuk sayi giriniz");
            } else if (kullaniciSayi < sayi) {
                System.out.println("Lutfen daha buyuk sayi giriniz");
            } else {
                System.out.println(tahminSayisi + ". tahminde bulundunuz : " + sayi);
                break;
            }
        }
        /*
        eger kullaniciya 5 tahmin hakki verseydik :
        for (int i = 4; i >=0 ; i--) {
            System.out.println("lutfen tahminde bulunmak icin 1-100 arasinda bir sayi giriniz");
            kullaniciSayi= input.nextInt();
         if (kullaniciSayi>sayi){
                  System.out.println("lutfen daha kucuk sayi giriniz");
          } else if (kullaniciSayi<sayi) {
                System.out.println("lutfen daha buyuk sayi giriniz");
           }else {
                System.out.println("Evet dogru sayiyi buldunuz tebrikler : "+sayi);
                break;
            }
            System.out.println("kalan tahmin hakkınız : "+i);
            }

         */


    }
}
