package day17_dateTimestringBuilder;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class DateTime03 {
    public static void main(String[] args) {
        //ornek 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.
        /***girilenTarih değişkenini null ile başlatmak,
         *programın ilerleyen kısımlarında bu değişkene uygun bir değer atayıp atamadığınızı kontrol etmek,
         *hata yönetimi yapmak ve bellek yönetimi açısından yararlı bir yaklaşımdır.
         */


        LocalDate girilenTarih = null;
        System.out.println(girilenTarih);//icinde cunku sadece null deger yani hiclik var
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Lutfen yili giriniz");
            int year = input.nextInt();
            System.out.println("Lutfen ayi giriniz");
            int month = input.nextInt();
            if (month < 1 || month > 12) {
                System.out.println("Ay bilgisi 1 ile 12 arasinda olmalidir lutfen tekrar deneyiniz");
                continue; //donguyu basa almayi saglar donguyu bastan baslatir
            }
            System.out.println("Lutfen gunu giriniz");
            int day = input.nextInt();
            //o ayın kac cektigini bulmak icin izlenilen yol ,girilen yil ve ay icin YearMonth adli classtan bir obje olusturmamız gerekiyor(gun yoktur)
            YearMonth yearMonth = YearMonth.of(year, month);
            int daysInMonth = YearMonth.now().lengthOfMonth();
            if (day < 1 || day > daysInMonth) {
                System.out.println("Girilen ay icin gecersiz gun girdiniz lutfen tekrar deneyiniz");
                continue;
            }
            girilenTarih = LocalDate.of(year, month, day);
            if (girilenTarih.isBefore(LocalDate.now())) {
                System.out.println("Gecersiz tarih girdiniz.Gecmis bir tarih girdiniz. Lutfen tekrar deneyiniz");

            } else {
                System.out.println("Zamani girebilirsiniz");
                break;
            }
        } while (true);


    }
}
