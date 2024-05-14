package day15arraylistMethodcreation;

public class MethodCreation04 {
    public static void main(String[] args) {
        //ornek 2: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method olusturunuz

        System.out.println("Iki carp bir topla : " + ikiCarpBirTopla(3, 4, 5));

        word("Hello");
    }

    public static int ikiCarpBirTopla(int a, int b, int c) {
        return a * b + c;
    }

    //ornek 3: Girilen bir kelimeyi konsola yazdiran bir method olusturunuz (void yani return yok)

    public static void word(String word) {
        System.out.println("Girilen kelime : " + word);

    }
}
