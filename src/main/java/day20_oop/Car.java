package day20_oop;

public class Car extends Vehicle{
    String model = "Accord";
    public int year = 2024;
    public Car(){

       this("Hatchback");
        System.out.println("Sedan");
    }
    public Car(String tip){
        super("Honda",2024,"Elektrikli");
        System.out.print(tip+", ");
    }
}
