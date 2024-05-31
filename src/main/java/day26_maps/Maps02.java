package day26_maps;

import java.awt.font.FontRenderContext;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps02 {
    public static void main(String[] args) {
        //Ornek 2:  Verilen Map'deki kisi isimlerinin character sayisi ile yaslarinin toplamini bulunuz.
        //Java'da Map.Entry kullanarak bir Set üzerinde loop yapabilir ve
        // hem anahtarları (getKey()) hem de değerleri (getValue()) elde edebilirsiniz.

        HashMap<String, Integer> kisiler = new HashMap<>();
        kisiler.put("Ali", 3);
        kisiler.put("Can", 5);
        kisiler.put("Ayse", 2);

        int toplam = 0;

        Set<Map.Entry<String, Integer>> myEntrySet = kisiler.entrySet();

        System.out.println(myEntrySet); // [Can=5, Ayse=2, Ali=3]

        for (Map.Entry<String, Integer> w : myEntrySet) {
            toplam = toplam + w.getKey().length() + w.getValue();
        }
        System.out.println(toplam); // 20

        System.out.println("-----------");
        ////ornek 3 : verilen map'deki kisilerin yaslari ortalamasını alın ve yasları ortalamasından buyuk olanları yazdırı

        Collection<Integer> kisilerValue = kisiler.values();
        int total = 0;

        for (Integer w : kisilerValue) {
            total += w;
        }
        double ort = (double) total / kisilerValue.size();

        for (Integer w : kisilerValue) {
            if (ort < w) {
                System.out.println(w);
            }
        }

    }

}
