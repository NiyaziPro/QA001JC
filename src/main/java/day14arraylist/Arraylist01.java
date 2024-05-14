package day14arraylist;

import java.util.ArrayList;

public class Arraylist01 {
    public static void main(String[] args) {

        ArrayList<Integer> ages = new ArrayList<Integer>(); // primitive data type'i kullanilamaz
        // java 6 ve oncesi  icin kullanilan olusturma yontemi

        ArrayList<Integer> newAges = new ArrayList<>(); // Java 7 ve sonrasi

        /*
        1. Array'lerde primitive ve non-primitive data type'leri depolayabilir
        fakat ArrayList'ler sadece non-primitive data type'leri saklar

        2. ArrayList'ler memoryde array'lerden daha fazla yer kapliyor

        3. Array'lerde olustururken bastan eleman sayisini belirtmek zorundayiz
        4. Arraylist'ler ise eleman sayisi konusunda esnektir

        5. Arrayler cok hizli yapidadir ve memoryde az yer kapladigi icin belli sayidaki elemanlar icin kullanilir
         */

        ages.add(1);
        ages.add(2);
        ages.add(3);
        ages.add(4);
        ages.add(5);
        System.out.println(ages);

        //List'te ararya eleman eklemek icin index numarasini yazariz
        ages.add(2, 90);
        System.out.println(ages);
        ages.add(5,50);
        System.out.println(ages);

        // Ornek 1 : Verilen Integer List'i , ages List'inin icine koyunuz

        System.out.println(newAges);
        newAges.add(10);
        newAges.add(20);
        newAges.add(30);

        ages.addAll(1,newAges);
        System.out.println(ages);

        System.out.println(ages.size());
        // size () methodu arralistteki ogelerin toplam sayisini dondurur

        System.out.println(ages.get(3));
        // get (index) methodu arraylisteki istedigimiz indexteki elemani bize dondurur

        System.out.println(ages.set(3, 25));
        System.out.println(ages);
        // set (int index , Integer element ) methodu arraylistlerdeki belirtilen indexteki ogeyi
        // verilen yeni eleman yapar ve bize eski olan yani guncellenen elemani dondurur




    }
}
