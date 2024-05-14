package Mentoring;

import java.util.Scanner;

public class TestSorulari12 {
    public static void main(String[] args) {
        //ÖDEV: bir ürünün kdv li fiyatını hesaplayınız:kdv oranı=0.8
        //ürün fiyatı kullanıcıdan alınacak
        //kdv miktarı=ürün fiyatı* kdv oranı
        //toplam fiyat=ürün fiyatı+kdv miktarı

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir urunun KDV'siz fiyatini girin : ");

        double kdv = 0.8;

        if (scan.hasNextDouble()){
            double price = scan.nextDouble();
            double kdvMiktari = price*kdv;
            System.out.println("kdvMiktari = " + kdvMiktari);
            double total = price+kdvMiktari;
            System.out.println("Toplam : "+total);
        } else {
            System.out.println("Lutfen gecerli bir urun fiyati giriniz!");
        }


    }
}
