package sorular;

import java.util.LinkedList;
import java.util.Random;

public class C23_soru {
    public static void main(String[] args) {
        //bir linkedlist olusturup icinde 1000'den kucuk 200 tane farklı pozitif tam sayi giriniz

        LinkedList<Integer> myList = new LinkedList<>();
        Random randomDeger = new Random(1000);


        for (int i = 0; i < 200; i++) {
            int sayi = randomDeger.nextInt(1000);
            if (!myList.contains(sayi)) {
                myList.add(sayi);
            } else {
                i--;
            }

        }
        System.out.println(myList.size());
        System.out.println(myList);


    }
}
