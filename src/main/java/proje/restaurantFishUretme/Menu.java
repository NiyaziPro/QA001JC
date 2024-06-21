package proje.restaurantFishUretme;

import java.util.Scanner;

import static proje.restaurantFishUretme.Methodlar.*;
import static proje.restaurantFishUretme.ResraurantBillGenerator.showFoodList;

public class Menu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean isAgain = true;

        do {
            System.out.println("\n>>>>>>> BIZIM RESTORAN <<<<<<<" +
                    "\n<< Uygulamasina Hosgeldiniz >> " +
                    "\n\n1. Yiyecek menüsü\n2. Sipariş oluştur\n3. Sipariş iptal\n4. Hesap fişi görüntüle\n5. Çıkış yap");

            int select;
            if (input.hasNextInt()) {
                select = input.nextInt();
                input.nextLine();
            } else {
                System.err.println("Yanlış girdiniz! Lütfen tekrar deneyin.");
                input.next();
                continue;
            }

            switch (select) {
                case 1:
                    showFoodList();
                    break;
                case 2:
                    order();
                    break;
                case 3:
                    cancelOrder();
                    break;
                case 4:
                    printBill();
                    break;
                case 5:
                    System.out.println("Bizi tercih ettiğiniz için teşekkür ederiz.");
                    isAgain = false;
                    break;
                default:
                    System.err.println("Geçersiz seçim. Lütfen tekrar deneyin.");
            }
        } while (isAgain);

    }


}
