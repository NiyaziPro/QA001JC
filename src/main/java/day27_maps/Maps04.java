package day27_maps;

import java.util.HashMap;
import java.util.Map;

public class Maps04 {
    public static void main(String[] args) {
        //Bir boş HashMap olusturup key degeri string value deger integer olucak
        // sekilde ve key degerlerinden a harfini iceren degerleri getiriniz kucuk buyuk harfe duyarsızdır


        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Selma", 17);
        hm.put("Esra", 25);
        hm.put("Niyazi", 26);
        hm.put("Mehmet", 23);
        hm.put("Kerem", 19);


        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            if (entry.getKey().toLowerCase().contains("a")) {
                System.out.println(entry);
            }
        }


    }
}
