package sorular;

import java.util.ArrayList;
import java.util.Collections;

public class C20_soru {
    public static void main(String[] args) {
        // Ornek 1: Bir tane Integer List olusturunuz.
        //          Bu List'te birbirine en yakin iki tamsayiyi yaziniz.
        //          [12, 23, 10, 19] ==> 12 ve 10

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(23);
        myList.add(10);
        myList.add(19);
        myList.add(13);
        //sort ile elemanlari siraladık cunku sıralı elemanlarda islem yapmasi daha kolay
        Collections.sort(myList);
        //minFark ile aralarindaki min farki buldugumuz zaman en yakın iki degeri bulmus oluruz
        int minFark = myList.get(1) - myList.get(0);

        for (int i = 1; i < myList.size(); i++) {
            minFark = Math.min(minFark, myList.get(i) - myList.get(i - 1));
        }
        System.out.println("minFark = " + minFark);

        for (int i = 1; i < myList.size(); i++) {
            if (myList.get(i) - myList.get(i - 1) == minFark) {
                System.out.println(myList.get(i-1)+" ve "+ myList.get(i));
            }
        }
    }
}
