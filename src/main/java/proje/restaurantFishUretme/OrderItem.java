package proje.restaurantFishUretme;

public class OrderItem {
    private int orderCode;
    private FoodLists food;
    private int quantity;
    private double totalAmount;

    public OrderItem(int orderCode, FoodLists food, int quantity, double totalAmount) {
        this.orderCode = orderCode;
        this.food = food;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
    }

    public int getOrderCode() {
        return orderCode;
    }

    public FoodLists getFood() {
        return food;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public String toString() {
        return "Sipariş Kodu: " + orderCode +
                ", Yiyecek: " + food.getFoodName() +
                ", Adet: " + quantity +
                ", Toplam Tutar: " + String.format("%.2f",totalAmount) + " Euro";
    }
}
