package day26_maps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps04 {
    public static void main(String[] args) {

        /*
        //ornek 1: Size verilen bir String'deki her kelimenin, o String'de kac defa kullanildigini
        //           gosteren kodu yaziniz.(Case insensitive (Büyük/küçük harfe duyarsız)olsun)
        **          Ali nasilsin Ali.    ==> Burda Ali kac kere gozuktu?
        **          Ali=1 kere gozuktu. Java digerini Ali. olarak algilar.
        ** Once noktalama isaretlerini siliniz, sonra Space karakterinden split yapin.
        **Dikkat:split metodu array (String[]) türünde bir sonuç döndürür, bu yüzden doğrudan bir ArrayList'e atayamazsınız

        // Regex yontemiyle \\p{Punct} butun ozel karakterleri siler (pant).
        //ali=2 , nasilsin=1 elde etmeliyim. **Bu ne yapisi? Map yapisi..Bos map olusturup icini dolduracagim.

        //Map'lerde get(key) ==> icine key yazariz, Bize value'sunu verir.
         */

        String s = "Ali nasilsin Ali nasilsin?.";
        s = s.replaceAll("\\p{Punct}", "").toLowerCase();
        System.out.println(s); // ali nasilsin ali
        String[] kelimeler = s.split(" ");
        System.out.println(Arrays.toString(kelimeler)); // [ali, nasilsin, ali]

        HashMap<String, Integer> myMap = new HashMap<>();

        for (String kelime : kelimeler) {
            Integer gorunum = myMap.get(kelime);
            if (gorunum == null)
                myMap.put(kelime, 1);
            else
                myMap.put(kelime,gorunum+1);
        }
        System.out.println(myMap);




    }
}
