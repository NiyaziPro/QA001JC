package day15arraylistMethodcreation;

public class MethodCreation01 {
    public static void main(String[] args) {
        int toplama = toplama(5, 6);
        System.out.println(toplama);
    }

    // void hicbir sey dondurmemeyi saglar genelde yazdirma islemleri icin kullanilir
    public static int toplama(int a, int b) {
        System.out.println(a + b);
        return a + b;
    }


}
