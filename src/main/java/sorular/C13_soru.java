package sorular;

public class C13_soru {
    public static void main(String[] args) {
        //bir dogal sayi arrayi olusturun
        //ve olusturdugunuz arraydeki tum ogeleri toplayın

        int[] arr = {4, 6, 2, 5, 34, 45};

        int toplam = 0;

        for (int a : arr) {
            toplam += a;
        }
        System.out.println(toplam);
    }
}
