package day22_oop.abstractClass.konuIcinOrnek;

public class HondaRunner {
    public static void main(String[] args) {
        // Honda h = new Honda();  HATA - 'Honda' is abstract; cannot be instantiated

        Civic c = new Civic();
        c.engine(); //Gas 1.6 Eco

        Accord a = new Accord();
        a.engine(); // Dizel 2.0

        a.music(); // Pro

    }
}
