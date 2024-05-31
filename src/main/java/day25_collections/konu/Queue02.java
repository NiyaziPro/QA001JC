package day25_collections.konu;

import java.util.PriorityQueue;

public class Queue02 {
    public static void main(String[] args) {
         /* PriorityQueue (oncelik kuyrugu), bir FIFO (first in first out) yapısı ile nesneleri
           öncelik sırasına göre sıralayan bir kuyruk (Queue) aracıdır.
           Yani, en yüksek önceliğe sahip olan nesne, her zaman ilk olarak çıkar.

           Örneğin, sayıları içeren bir PriorityQueue kullanıyorsanız,
           sayılar kendi doğal sıralamalarına göre önceliklendirilir.

           Gerçek hayattan bir örnek olarak, bir hastanedeki hastaların acil servise giriş sırası
           priorityQueue olarak temsil edilebilir. Hastalar, aciliyet derecelerine göre sıralanır.
           Aciliyeti en yüksek olan hasta, her zaman ilk olarak tedavi edilir. */

        // ------------------ PriorityQueue basil olusturulur?

        PriorityQueue<String> acilSirasi = new PriorityQueue<>();

        acilSirasi.add("Mehmet");
        acilSirasi.add("Mahmut");
        acilSirasi.add("Ekrem");
        acilSirasi.add("Oya");
        acilSirasi.add("Tansu");
        acilSirasi.add("Damla");
        // Siralamasi icin Comparator kullanilir ( Lambda )
        System.out.println(acilSirasi); // [Damla, Mehmet, Ekrem, Oya, Tansu, Mahmut]


    }
}
