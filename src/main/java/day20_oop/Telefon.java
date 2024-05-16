package day20_oop;

public class Telefon extends Elektronik {
    public Telefon (){

        System.out.println("Pro Max");
    }
    public Telefon (String tip){
        super("Iphone",2012,"16GB");
        System.out.println(tip);
    }
}
