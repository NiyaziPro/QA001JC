package proje.restaurantFishUretme.ornek;


import java.util.List;
import java.util.Scanner;

public class RestaurantBillGenerator {
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
        //start methodu
        getSelectionMenu();

    }


    private static void getSelectionMenu() {
        Scanner inp=new Scanner(System.in);
        DishService service=new DishService();
        OrderService orderService=new OrderService();
        //2- tekrar tekrar menu gosterilsin
        int select;
        do {
            System.out.println("------------------------------------");
            System.out.println("*** Techpro sipariş uygulamasina hoşgeldiniz ***");
            System.out.println("1- menü");
            System.out.println("2- sipariş gir");
            System.out.println("3- sipariş iptal");
            System.out.println("4- hesap oluştur");
            System.out.println("0- çıkış");
            System.out.println("seçiminiz : ");
            select=inp.nextInt();
            System.out.println("------------------------------------");
            switch (select){
                case 1:
                    service.showMenu();
                    break;
                case 2:
                    orderService.createOrder(service);
                    break;
                case 3:
                    orderService.deleteOrder();
                    break;
                case 4:
                    orderService.printBill();
                    break;
                case 0:
                    System.out.println("iyi günler dileriz...");
                    break;
                default:
                    System.out.println("hatali giriş yaptiniz tekrar deneyiniz");
                    break;
            }


        }while (select!=0);

    }

}