package day24_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set01 {
        /**Java'da üç tür set vardır:
        1) HashSet: Bu set, elemanların hash kodlarına göre depolandığı bir settir. Elemanlar,
        her birinin benzersiz bir hash kodu (kimlik numarası) ile depolandığı bir yapıda tutulur.
        Bir eleman eklediğinizde, bu elemanın hash kodu hesaplanır ve o hash koduna karşılık gelen
        bir hücreye yerleştirilir.

        HashSet'ler, en hızlı performansı sunar.Ancak, elemanların sırasını korumazlar.
        null'i eleman olarak kabul ederler

        2) LinkedHashSet:Bu set, elemanların eklenme sırasına göre(insertion order) depolandığı
        bir settir. LinkedHashSet class'i, HashSet class'inin child'idir.
        LinkedHashSet'ler, elemanların sırasını korumaya ihtiyaç duyulan uygulamalar için iyi bir seçimdir.
        Ancak, HashSet'lerden daha yavaş performans sunarlar. (orta)

        Ornegin; Okullarda kayit sirasina gore ogrenci bilgilerini tutmak isterseniz kullanabilirsiniz

        3) TreeSet:Bu set, elemanların doğal sırasına(natural order-kucukten buyuge) göre depolandığı bir settir.
        HashSet'ler ve LinkedHashSet'lerden daha yavaş performans sunarlar.
        Java'da TreeSet, SortedSet arayüzünü(interface) uygulayan bir class'tir.
        Bu nedenle, TreeSet bir Sorted Set'tir. */

        public static void main(String[] args) {

            HashSet<String> mySet = new HashSet<>();
            System.out.println(mySet);
            mySet.add("Sinan");
            mySet.add("Kerem");
            mySet.add("Tuba");
            mySet.add("Onur");

            // mySet.add("Sinan");  Duplicate Set element
            System.out.println(mySet); // [Kerem, Sinan, Tuba, Onur]

            for (String s : mySet){
                System.out.println(s+"'in Hash kodu : "+s.hashCode());
            }
            // Kerem'in Hash kodu : 72385760
            // Sinan'in Hash kodu : 79889125
            // Tuba'in Hash kodu : 2618016
            // Onur'in Hash kodu : 2462940

            // Eleman eklemenin kisa yollari

            HashSet<String >hashSet1 = new HashSet<>(Arrays.asList("Kerem", "Sinan", "Tuba", "Onur"));
            System.out.println(hashSet1); // [Kerem, Sinan, Tuba, Onur]

            HashSet<String >hashSet2 = new HashSet<>(Set.of("Kerem", "Sinan", "Tuba", "Onur"));
            System.out.println(hashSet2);  // [Kerem, Sinan, Tuba, Onur]

            // LinkedList olusturun , ve bir OOp nesne olusturun ve bu insanlari baglayin. ( ornek : LinkedList<Human> halay = new LinkedList();

        }

}
