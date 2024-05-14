package day19_static_oop;

public class AnimalRunner {
    public static void main(String[] args) {
        Cat polat = new Cat();
        polat.meow();
        polat.feedWithMilk();
        polat.eat();

        //siz de yapın bird classında bir obje olusturup icindeki
        // bilgilerin nerden geldigini karsına yazın

        Bird kus = new Bird();
        kus.tweety(); // Bird class'tan
        kus.eat();    // Animal class'tan
        kus.drink(); // Animal class'tan




    }
}
