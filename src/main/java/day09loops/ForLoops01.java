package day09loops;

public class ForLoops01 {
    public static void main(String[] args) {
        // Ornek 1: Console'a 4 kere 'Hi!' yazdirin

        // 1.yol
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");

        System.out.println("--------------------");

        //baslangic degeri   loop calisma kurali  // artirma veya eksiltme
        for (int i = 1; i < 5; i++) {
            System.out.println("Hi!");
        }


    }
}
