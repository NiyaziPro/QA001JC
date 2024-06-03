package day27_maps;

import java.util.HashMap;
import java.util.Map;

public class Maps03 {
    public static void main(String[] args) {

        // Bir boş HashMap olusturup key degeri string value deger integer
        // olucak sekilde ve value degerleri 300'den buyuk olan elemanları yazdirin

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("A", 100);
        hm.put("B", 200);
        hm.put("C", 300);
        hm.put("D", 400);
        hm.put("E", 500);

        for (Map.Entry<String, Integer> w : hm.entrySet()) {
            if (w.getValue() >= 300) {
                System.out.println(w);
            }
        }

    }
}
