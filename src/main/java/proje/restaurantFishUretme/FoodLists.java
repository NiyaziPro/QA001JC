package proje.restaurantFishUretme;

public enum FoodLists {

    //Yiyeceklerin kodu, ismi ve ücreti olsun.

    MERCIMEKCORBA(1, "Mercimek Çorbası", 5.00),
    EZOGELINCORBA(2, "Ezogelin Çorbası", 4.50),
    KELLEPACA(3, "Kelle Paça", 6.40),
    PIZZA(4, "Pizza", 9.55),
    HAMBURGER(5, "Hamburger", 8.49),
    KEBAP(6, "Kebap", 12.00),
    CIGER(7, "Ciğer", 10.99),
    BAKLAVA(8, "Baklava", 7.00),
    SUFLE(9, "Sufle", 13.33),
    SU(10, "Su 1,5 ml", 1.49);

    private int foodCode;
    private String foodName;
    private double foodPrice;

    FoodLists(int foodCode, String foodName, double foodPrice) {
        this.foodCode = foodCode;
        this.foodName = foodName;
        this.foodPrice = foodPrice;
    }

    public int getFoodCode() {
        return foodCode;
    }

    public String getFoodName() {
        return foodName;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

}
