package JavaPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class S14 {
    public static void main(String[] args) {
        // HashMap oluşturma
        HashMap<String, Integer> myMap = new HashMap<>();

        // Anahtar-değer (Key-Value) çiftleri ekleme
        // put(K key, V value): Belirtilen anahtarla ilişkili değeri ekler veya günceller.
        // Eğer anahtar daha önce eklenmişse, eski değer yeni değerle değiştirilir.

        myMap.put("Elma", 30);
        myMap.put("Muz", 50);
        myMap.put("Portakal", 60);

        myMap.put("Elma", 35);
        System.out.println(myMap);

        //replace(K key, V value): Belirtilen anahtar mevcutsa, ilişkili değeri belirtilen yeni değerle değiştirir.

        myMap.replace("Elma",45);
        System.out.println(myMap);

        //replace(K key, V oldValue, V newValue): Belirtilen anahtar ve eski değer mevcutsa,
        // eski değeri belirtilen yeni değerle değiştirir.

        myMap.replace("Muz",50,70);
        System.out.println(myMap);




        // Bir anahtarın (key)  değerini alma
        // get(Object key): Belirtilen anahtarla ilişkili değeri döner.
        // Eğer anahtar mevcut değilse, null döner.

        System.out.println(myMap.get("Portakal")); // 60

        // Bir anahtarın (key) varlığını kontrol etme
        // containsKey(Object key): Belirtilen anahtarın HashMap içinde olup olmadığını kontrol eder.

        boolean isStockAvailable = myMap.containsKey("Muz");
        System.out.println(isStockAvailable);  // true

        // Bir değerin (value) varlığını kontrol etme
        // containsValue(Object value): Belirtilen değerin HashMap içinde olup olmadığını kontrol eder.

        boolean isAvailable = myMap.containsValue(50);
        System.out.println(isAvailable);


        // remove(Object key): Belirtilen anahtarla ilişkili değeri kaldırır.
        // Kaldırılan değeri döner.

        myMap.remove("Ellma");
        System.out.println(myMap);

        // Anahtar-değer (Key-Value) çiftini silme
        //remove(Object key, Object value): Belirtilen anahtar ve değerle eşleşen anahtar-değer çiftini kaldırır.
        // Eğer eşleşme varsa true, aksi takdirde false döner.

        myMap.remove("Muz", 60);
        System.out.println(myMap);

        // Tüm anahtarları (keys)  alma .
        // keySet(): Tüm anahtarları içeren bir Set döner.

        Set<String> mySet = myMap.keySet();
        System.out.println(mySet);

        // Tüm değerleri (values) alma
        // values(): Tüm değerleri içeren bir Collection döner.

        Collection<Integer> myCol = myMap.values();
        System.out.println(myCol);

        // Tüm anahtar-değer (Key-Value) çiftlerini alma
        // entrySet(): Tüm anahtar-değer çiftlerini içeren bir Set döner.
        // Her eleman bir Map.Entry objesidir.

        Set<Map.Entry<String, Integer>> myEntry = myMap.entrySet();
        System.out.println(myEntry);

    }
}
