package day20_oop.polymorphism;

public class Bird extends Animal {
    public void tweet(){
        System.out.println("Birds tweet...");
    }

    @Override
    public void drink() {
        System.out.println("Birds drink water...");
    }
}
