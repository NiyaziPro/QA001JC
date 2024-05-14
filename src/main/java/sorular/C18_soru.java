package sorular;

import java.util.ArrayList;

public class C18_soru {
    public static void main(String[] args) {
        // bir dogal sayi arraylisti olusturun
        //ve olusturdugunuz arraylistdeki tum ogeleri toplayın

        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(7);
        sayilar.add(8);
        sayilar.add(9);
        sayilar.add(10);
        System.out.println(sayilar);


        int sum = 0;

        for (Integer i : sayilar) {
            sum += i;

        }
        System.out.println("Toplam : "+sum);












    }
}
