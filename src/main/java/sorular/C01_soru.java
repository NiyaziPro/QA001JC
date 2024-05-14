package sorular;

import java.util.Scanner;

public class C01_soru {
    public static void main(String[] args) {
        // iki sayinin toplamini yeni bir degere atayanizi ve yazdiriniz
        int a = 15;
        double b = 38.6;
        double toplam = a + b;
        System.out.println("Toplam = " + toplam); // Toplam = 53.6


        // bir int deger ve bir double degeri toplayin
        // ayni sayilari toplayip sadece tam kismini alin

        int sum = (int) (a + b); // int sum = a+(int)b;
        System.out.println("sum = " + sum);  // sum = 53

        System.out.println("-------------");

        //  Kullanicidan yaricap isteyip cemberin cevresini ve
        //  dairenin alanini hesaplayip yazdirin cevre formulu 2πrdir
        //  (pi sayisini 3 alabilirsiniz)dairenin alani ise π r²dir(pi sayisini 3 alabilirsiniz)

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen cemberin yaricapini giriniz :");
        double r = input.nextDouble();
        System.out.println("Dairenin cevresi : " + 2 * Math.PI * r);
        System.out.println("Dairenin alani : " + Math.PI * r * r);

        //  Soru 4) Kullanicidan dikdortgenler prizmasinin
        //          - uzun,kisa kenarlarini ve
        //          - yuksekligini isteyip prizmanin hacmini (uzun*kisa*yukseklik)hesaplayip
        //          - yazdirin

        System.out.println("Lutfen dikdortgenin kisa kenarini giriniz :");
        double kisaKenar = input.nextDouble();
        System.out.println("Lutfen dikdortgenin uzun kenarini giriniz :");
        double uzunKenar = input.nextDouble();
        System.out.println("Lutfen dikdortgenin yuksekligini giriniz :");
        double yukseklik = input.nextDouble();


        System.out.println("Prizmanin hacmi : " + kisaKenar * uzunKenar * yukseklik);


    }
}
