package day26_maps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps05 {
    public static void main(String[] args) {
        //ornek 2: Size verilen bir String'deki her harfin o String'de kac defa kullanildigini gosteren kodu yaziniz.
        //          “Hello” ==> H=1, e=1, l=2, o=1

        String s = "Hello";
        s = s.toLowerCase();
        System.out.println(s); // hello

        String[] karakterler = s.split("");
        System.out.println(Arrays.toString(karakterler)); // [h, e, l, l, o]

        HashMap<String, Integer> myMap = new HashMap<>();
        System.out.println(myMap); // {}

        for (String karakter : karakterler) {
            Integer gorunum = myMap.get(karakter);
            if (gorunum == null) {
                myMap.put(karakter, 1);
            } else {
                myMap.put(karakter, gorunum + 1);
            }
        }
        System.out.println(myMap); // {e=1, h=1, l=2, o=1}

        //        for (String karakter : karakterler) {
        //            myMap.merge(karakter, 1, Integer::sum);
        //        }
    }
}
