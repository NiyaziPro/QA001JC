package day20_oop;


public class Iphone extends Telefon {
    public Iphone(){
        super();
        System.out.println(15);
    }
    public Iphone(int model){
        super("Mini");
        System.out.println(model);
    }
}
