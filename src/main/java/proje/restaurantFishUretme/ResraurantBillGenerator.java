package proje.restaurantFishUretme;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class ResraurantBillGenerator {
     /*
        Proje: Restaurant Fiş Üretme Uygulaması(BillGenerator)
        1-Bir restaurantın online sipariş sisteminde hesabı
        yazdıran uygulama tasarlayınız.

        2-Restauranttaki yiyecekler bir listte tutulsun.
          Yiyeceklerin kodu, ismi ve ücreti olsun.

        3-Yiyecek menüsü gösterme, sipariş oluşturma/iptal ve hesap
          oluşturma için seçim menüsü gösterilsin.

        4-Yiyecek menü:Listedeki yiyecekler menü şeklinde listelensin
          Sipariş girme:Yiyeceğin kodu ve istenilen adet girilerek sipariş oluşturulsun
                       Her sipariş için kod üretilsin(başlangıç 1000 artarak devam eder)
                       Her bir yiyecek siparişi için tutar hesaplansın

         Sipariş iptal:Sipariş kodu girilerek sipariş silinsin
         Hesap oluşturma: Tutarları ile birlikte tüm siparişleri ve
                          toplam tutarı gösteren bir hesap fişi yazdırılsın.
          */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean isAgain = false;

        do {
            System.out.println(">>>>>>> BIZIM RESTORAN <<<<<<<" +
                    "\n<< Uygulamasina Hosgeldiniz >> " +
                    "\n\n1.Yiyecek menüsü\n2.Sipariş oluştur\n3.Cikiş yap");
            int select;
            if (input.hasNextInt()) {
                select = input.nextInt();
                input.nextLine();
            } else {
                System.err.println("Yanlis  girdiniz! Lutfen tekrar deneyin!");
                input.next();
                isAgain = true;
                continue;
            }
            switch (select) {
                case 1:
                    showFoodList();
                    System.out.println("\nSipariş etmek icin 1 , Ana menuye donmek icin 2 girin : ");

                    try {
                        int slct = input.nextInt();
                        if (slct == 1) {
                            order();
                        } else if (slct == 2) {
                            isAgain = true;
                        } else {
                            System.err.println("Hatali giris! Lutfen tekrar deneyin...");
                            isAgain = true;
                        }
                    } catch (InputMismatchException e) {

                        System.err.println("Lutfen bir tam sayi giriniz!!!");
                        isAgain = true;
                        input.nextLine();
                    }
                case 2:
                    showFoodList();
                    System.out.println();
                    order();

                    break;
                case 3:
                    System.out.println("Bizi tercih ettiginiz icin Tesekkur ederiz " +
                            "\n<<<<>>>>       Afiyet olsun        <<<<>>>>");
                    break;
                default:
                    throw new IllegalArgumentException();

            }

        } while (isAgain);


    }

    private static void order() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sectiginiz yemegin numarasini girin : \nToplam tutari gormek icin 0 girin");
        boolean isAgain = true;
        double toplam = 0;
        String foodName = "";
        FoodLists[] list = FoodLists.values();
        while (isAgain) {
            int select = scanner.nextInt();
            for (FoodLists w : list) {
                if (select == w.getFoodCode()) {
                    if (select < 0 || select > 11) {
                        System.err.println("Lutfen Menu disi yemek kodu girmeyiniz!");
                        isAgain = false;
                    } else {
                        toplam = toplam + w.getFoodPrice();
                        foodName = w.getFoodName();
                        System.out.println(w.getFoodName() + " - " + w.getFoodPrice() + " Euro");
                    }
                } else if (select == 0) {
                    System.out.format("Siparisinizin toplam tutari : %.2f Euro", toplam);
                    System.out.println("\n1. Siparis Et\n2. Iptal et");
                    select = scanner.nextInt();
                    if (select == 1) {
                        System.out.println("Siparisiniz tamamlanmistir.\nBizi tercih ettiginiz icin Tesekkur ederiz\nAfiyet olsun :)");

                        isAgain = false;
                    } else if (select == 2) {
                        System.out.println("Siparisiniz iptal edilmistir...");
                        isAgain = false;
                        break;

                    } else {
                        System.out.println("Hatali giris! Lutfen tekrar deneyin");
                        isAgain = true;
                        continue;
                    }
                }
            }
        }
    }

    public static void showFoodList() {

        FoodLists[] menu = FoodLists.values();
        System.out.println("Yiyecek menüsü");
        for (FoodLists w : menu) {
            System.out.println(w.getFoodCode() + ". " + w.getFoodName() + " - " + w.getFoodPrice() + " Euro");
        }
    }



}
