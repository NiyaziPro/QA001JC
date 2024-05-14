package sorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C17_soru {
    public static void main(String[] args) {
        // bir array olusturun ve bu arraydeki
        //elemanlari alfabetik siraya gore siralayin

        String[] arr = {"Eren", "Ali", "Zeyn", "Fatih", "Emre"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        ArrayList<String> list = new ArrayList<>();
        list.add("Eren");
        list.add("Ali");
        list.add("Zeyn");
        list.add("Fatih");
        list.add("Emre");

        // arraylistlerde 2 farkli yontem var :
        // 1. Arraylistlerin icinde bulunan sort methodu ile fakat icine ne girecegimizi bilmiyoruz
        // 2. bizim collection dedigimiz bir yapi vardir

        Collections.sort(list);
        System.out.println(list);


    }
}
