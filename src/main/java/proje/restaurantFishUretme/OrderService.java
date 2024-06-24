package proje.restaurantFishUretme;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class OrderService {
    public static int nextOrderCode = 1000;
    public static Map<Integer, OrderItem> orders = new HashMap<>();

    public static void order() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen sipariş vermek istediğiniz yiyeceğin kodunu girin :");
        int foodCode = 0;
        int quantity = 0;
        try {
            foodCode = scanner.nextInt();
            System.out.println("Lutfen kac adet istediginizi girin :");
            quantity = scanner.nextInt();
            if (foodCode > 0 && quantity > 0) {

                FoodLists selectedFood = getFoodByCode(foodCode);

                if (selectedFood != null) {
                    double totalAmount = selectedFood.getFoodPrice() * quantity;
                    int orderCode = generateOrderCode();
                    OrderItem orderItem = new OrderItem(orderCode, selectedFood, quantity, totalAmount);
                    orders.put(orderCode, orderItem);

                    System.out.println("\nSipariş oluşturuldu:");
                    System.out.println(orderItem);
                }
            } else {
                System.err.println("Hatali giris! Lutfen tekrar deneyin...");
            }

        } catch (InputMismatchException e) {
            System.err.println("Yanlış girdiniz! Lütfen tekrar deneyin.");
        }


    }

    public static void cancelOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("İptal etmek istediğiniz siparişin kodunu girin: ");
        try {
            int orderCode = scanner.nextInt();

            if (orders.containsKey(orderCode)) {
                OrderItem cancelledOrder = orders.remove(orderCode);
                System.out.println("Sipariş iptal edildi:");
                System.out.println(cancelledOrder);
            } else {
                System.err.println("Sipariş bulunamadı!");
            }
        } catch (InputMismatchException e) {
            System.err.println("Yanlış girdiniz! Lütfen tekrar deneyin.");
        }
    }

    public static void printBill() {
        double totalBill = 0.0;
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm dd.MM.yyyy");

        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Hesap Fisi <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
        for (OrderItem orderItem : orders.values()) {
            System.out.println(orderItem);
            totalBill += orderItem.getTotalAmount();
        }

        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.print(dateTimeFormatter.format(dateTime));
        System.out.format("                                       Toplam Tutar: %.2f Euro", totalBill);

        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Afiyet olsun <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }

    private static FoodLists getFoodByCode(int foodCode) {
        for (FoodLists food : FoodLists.values()) {
            if (food.getFoodCode() == foodCode) {
                return food;
            }
        }
        return null;
    }

    private static int generateOrderCode() {
        return nextOrderCode++;
    }
}
