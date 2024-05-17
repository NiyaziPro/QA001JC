package day21_oop;

public class Animal2 {
    public int weight = 12;

    public void eat() {
        System.out.println("Animals eat ...");
    }

    public Animal2 create() {
        return new Animal2();
    }
}
