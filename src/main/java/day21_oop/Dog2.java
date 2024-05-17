package day21_oop;

public class Dog2 extends Mammal2 {

    @Override
    public void eat() {
        System.out.println("Dogs eat meat...");
    }

    private void eat(String str) {
        System.out.println("Dogs eat " + str);
    }

    private void eat(int a) {
        System.out.println("Dogs eat " + a);
    }

    @Override
    public Animal2 create() {
        return new Dog2();
    }
}
