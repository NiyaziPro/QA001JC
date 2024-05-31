package day26_maps;

import java.util.HashMap;

public class Maps03 {
    public static void main(String[] args) {

        //bir map olusturalım ve baska methodlari da ogrenelim

        HashMap<String,Integer> stdAges = new HashMap<>();
        stdAges.put("Ali",18);
        stdAges.put("Can",19);
        stdAges.put("Tom",33);
        stdAges.put("Veli",63);
        stdAges.put("Ahmet",41);

        stdAges.put("Tom",35);
        System.out.println(stdAges); // {Can=19, Ahmet=41, Tom=35, Veli=63, Ali=18}

        //1) replace() methodu value'lari key'leri kullanarak update etmeye yarar
        //Aynı işlemi put ile yapmak da teknik olarak işe yarar, ancak replace kullanmak,
        // kodunuzu okuyan diğer geliştiricilere ve size daha net bilgi verir.

        stdAges.replace("Tom",39);
        System.out.println(stdAges); // {Can=19, Ahmet=41, Tom=39, Veli=63, Ali=18}

        //2) replace() methodu eski deger kontrolu yaparak ta calisir
        stdAges.replace("Tom",21,45);
        System.out.println(stdAges); // {Can=19, Ahmet=41, Tom=39, Veli=63, Ali=18}

        stdAges.replace("Tom",39,45);
        System.out.println(stdAges); // {Can=19, Ahmet=41, Tom=45, Veli=63, Ali=18}


        //3)putIfAbsent() metodu, belirtilen key ve value çiftini, key Map'te yoksa Map'e ekler.
        //Key Map'te zaten varsa, metodun hiçbir etkisi olmaz.

        stdAges.putIfAbsent("Tom",12);
        System.out.println(stdAges); // 12 degeri eklenmez

        stdAges.putIfAbsent("Ayse",23); // ekleme oldu
        System.out.println(stdAges);

        //4- get() ve getOrDefault() method'lari eger aranan eleman map'te var ise, ikisi de ayni isi yapar
        //key verirsiniz, size value verir
        System.out.println(stdAges.get("Tom"));//45
        System.out.println(stdAges.getOrDefault("Tom",15));//45 ,tom map'te var
        //orjinal deger verildi

        System.out.println(stdAges.get("Jerry"));//eleman yok get() null verir
        System.out.println(stdAges.getOrDefault("Jerry", 18));//18, mapte yok . defualt verir

        System.out.println("-----------------------------------");

        //5)containsKey() metodu, Map'te bir key olup olmadığını kontrol eder.
        //containsValue() metodu ise, Map'te bir value olup olmadığını kontrol eder.
        //Boolean return ederler
        boolean b= stdAges.containsValue(19);
        System.out.println(b);//true
        System.out.println(stdAges.containsValue(99));//false

        System.out.println(stdAges.containsKey("Tom")); // true
        System.out.println(stdAges.containsKey("TOM")); // false

        System.out.println("-----------------------------------");

        //6)remove(String key); methodu key kullanarak entry silmeye yarar

        System.out.println(stdAges.remove("Tom")); // 45 // Tom 'un value'sunu dondurur
        System.out.println(stdAges); // {Can=19, Ahmet=41, Veli=63, Ayse=23, Ali=18}

        stdAges.remove("Can",19);
        System.out.println(stdAges); // {Ahmet=41, Veli=63, Ayse=23, Ali=18}


    }
}
