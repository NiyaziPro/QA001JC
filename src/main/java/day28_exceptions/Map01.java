package day28_exceptions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map01 {
    public static void main(String[] args) {
        // HashMap oluşturma

        HashMap<String,Integer> myMap = new HashMap<>();
        System.out.println(myMap);

        // Anahtar-değer (Key-Value) eleman  ekleme
        // put(K key, V value): Belirtilen anahtarla ilişkili değeri ekler veya günceller.
        // Eğer anahtar daha önce eklenmişse, eski değer yeni değerle değiştirilir.
        // ürün stok miktarı

        myMap.put("Elma",10);
        myMap.put("Muz",50);
        myMap.put("Portakal",75);
        myMap.put("Elma",30); // tercih edilmez
        System.out.println(myMap); // {Muz=50, Elma=10, Portakal=75}


        //replace(K key, V value): Belirtilen anahtar mevcutsa, ilişkili değeri belirtilen yeni değerle değiştirir.

        myMap.replace("Elma",50);
        System.out.println(myMap); // {Muz=50, Elma=50, Portakal=75}

        //replace(K key, V oldValue, V newValue): Belirtilen anahtar ve eski değer mevcutsa,
        // eski değeri belirtilen yeni değerle değiştirir.
        myMap.replace("Elma",50,60);
        System.out.println(myMap);

        // Bir anahtarın (key)  değerini alma
        // get(Object key): Belirtilen anahtarla ilişkili değeri döner. Eğer anahtar mevcut değilse, null döner.

        System.out.println(myMap.get("Portakal"));

        // Bir anahtarın (key) varlığını kontrol etme
        // containsKey(Object key): Belirtilen anahtarın HashMap içinde olup olmadığını kontrol eder. Ve bize boolean dondurur

        boolean mevcutmu = myMap.containsKey("Muz");
        System.out.println(mevcutmu); // true

        // Bir değerin (value) varlığını kontrol etme
        // containsValue(Object value): Belirtilen değerin HashMap içinde olup olmadığını kontrol eder.

        System.out.println(myMap.containsValue(50)); // true

        // remove(Object key): Belirtilen anahtarla ilişkili değeri kaldırır. Kaldırılan değeri döner.

        System.out.println(myMap.remove("Elma")); // 60

        // Anahtar-değer (Key-Value) çiftini silme
        //remove(Object key, Object value): Belirtilen anahtar ve değerle eşleşen anahtar-değer
        // çiftini kaldırır. Eğer eşleşme varsa true, aksi takdirde false döner.
        System.out.println(myMap.remove("Muz", 10)); // false

        // Tüm anahtarları (keys)  alma .
        // keySet(): Tüm anahtarları içeren bir Set döner.

        Set<String> mySet = myMap.keySet();
        System.out.println(mySet); // [Muz, Portakal]
        System.out.println("Anahtarlar: " + myMap.keySet()); // Anahtarlar: [Muz, Portakal]


        // Tüm değerleri (values) alma
        // values(): Tüm değerleri içeren bir Collection döner.

        System.out.println(myMap.values()); // [50, 75]


        // Tüm anahtar-değer (Key-Value) çiftlerini alma
        // entrySet(): Tüm anahtar-değer çiftlerini içeren bir Set döner.
        // Her eleman bir Map.Entry objesidir.

        Set<Map.Entry<String,Integer>> myEntrySet = myMap.entrySet();
        System.out.println(myEntrySet);

        System.out.println("Anahtar-Değer Çiftleri: " + myMap.entrySet());
        //Anahtar-Değer Çiftleri: [Muz=50, Portakal=75]


    }
}
