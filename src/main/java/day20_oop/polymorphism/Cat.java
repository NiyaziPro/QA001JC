package day20_oop.polymorphism;

public class Cat extends Mammal {

    public void meow(){
        System.out.println("Cats meow....");
    }
    public void eat(){
        System.out.println("Cats eat...");
    }

    @Override
    public void feedWithMilk() {
        System.out.println("Cats feed their babies with milk");
    }
}
