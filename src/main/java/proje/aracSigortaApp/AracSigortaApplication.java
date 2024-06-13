package proje.aracSigortaApp;

import java.util.Scanner;

public class AracSigortaApplication {
    /*
        Proje: Araç Sigorta Prim Hesaplama
               Araç tipleri:otomobil, kamyon, otobüs, motosiklet
                            -otobüs: 18-30 koltuk veya 31 ve üstü koltuk

               Tarife dönemi:Aralık 2024,Haziran 2024
                  1.dönem :Haziran 2024               2.dönem:Aralık 2024
                  otomobil: 2000                       otomobil: 2500
                  kamyon:   3000                       kamyon:   3500
                  otobüs: tip1: 4000 tip2: 5000        otobüs: tip1: 4500 tip2: 5500
                  motosiklet: 1500                     motosiklet: 1750
        
                1-Tekrar tekrar kullanılan bir seçim menüsü(form) gösterelim.//while-switch
                2-Tarife dönemi bilgisi,araç tipi bilgilerini kullanıcıdan alalım.
                3-Hatalı girişte hesaplama başarısız uyarısı verip tekrar menü(form) gösterilsin.
                4-Menüde yeni işlem veya çıkış için seçenek sunulsun .
                5-tarife dönemi ve araç tipine göre sigorta primi hesaplansın.
         */
    public static void main(String[] args) {
        // 1. Uygulamayi baslatan method
        start();
    }

    public static void start() {
        // 2. Kullanicidan bilgi almak icin scanner objesi olusturalim
        Scanner input = new Scanner(System.in);
        //3. Tekrar tekrar menu gosterilsin

        boolean isAgain;

        do {
            System.out.println("<< Zorunlu Arac Sigorta Prim Hesaplama >>");
            System.out.println("Tarife donemi seciniz : ");
            System.out.println("1.Haziran 2024");
            System.out.println("2.Aralik 2024");
            int donem;
            if (input.hasNextInt()) {
                donem = input.nextInt();
            } else {
                System.err.println("Sadece kacinci donem oldugunu giriniz!!!");
                input.nextLine();//dummy
                isAgain = true;
                continue;
            }
            String donemBilgi = donem == 1 ? "Haziran 2024" : "Aralik 2024";

            // tarife donemBilgisi dogru ise calistirmaya devam et, hatali giris ise basa geri dondur
            if (donem != 1 && donem != 2) {
                System.err.println("Hatali giris!!!");
                isAgain = true;
                continue;
            }
            //4.bir arac objesi olusturalim
            Arac arac = new Arac();

            System.out.println("Arac tipini seciniz : ");
            System.out.println("Otomobil, kamyon, otobus, motosiklet");
            arac.type = input.next().toLowerCase();
            arac.primHesapla(donem);
            //prim==0 ise hatali giris yapmıs yeni işlem yapsın
            //prim>0 ise hesaplama islemi basarili bir sekilde yapılmıstır sonucu gosterelim
            if (arac.prim > 0) {
                System.out.println("----------------------");
                System.out.println("Arac tipi : " + arac.type);
                System.out.println("Tarife Donemi : " + donemBilgi);
                System.out.println("Aracinizin ilgili donem sigorta primi : " + arac.prim);
                System.out.println("----------------------");
                System.out.println("Yeni islem icin 1, cikis icin 0'i seciniz");
                int select = input.nextInt();
                isAgain = select == 1 ? true : false;

            } else {
                System.err.println("Hesaplama islemi basarisiz, tekrar deneyiniz!");
                System.out.println("Yeni islem icin 1, cikis icin 0'i seciniz");
                int select = input.nextInt();
                isAgain = select == 1 ? true : false;
            }


        } while (isAgain);


    }
}
