package day24_collections;

import java.util.*;

public class LinkedList01 {
    public static void main(String[] args) {

      /*  ArrayList<String> list1 = new ArrayList<>();

        List<String> list2 = new ArrayList<>();*/

        // LinkedList eleman olusturma / ekleme
        LinkedList<String> mylist = new LinkedList<>();

        mylist.add("Ali");
        mylist.add("Veli");
        mylist.add("Ayse");
        mylist.add("Fatma");
        System.out.println(mylist);

        LinkedList<String>linkedList1 = new LinkedList<>(Arrays.asList("Eleman1","Eleman2","Eleman3"));
        linkedList1.add("Eleman4");
        System.out.println(linkedList1);

        LinkedList<String> linkedList2 = new LinkedList<>(List.of("Derya","Umut","Damla","Mert"));
        System.out.println(linkedList2);

        List<String>immutableList = List.of("Eleman1","Eleman2","Eleman3");
        // immutableList.add("A");  UnsupportedOperationException

        //2- add(int index, E element); belirtilen konuma bir oge ekler
        mylist.add(1,"Zeynep");
        System.out.println(mylist); // [Ali, Zeynep, Veli, Ayse, Fatma]

        //3- addFirst(E e): Listenin basina oge ekler
        mylist.addFirst("Hasan");
        System.out.println(mylist); // [Hasan, Ali, Zeynep, Veli, Ayse, Fatma]

        //4- addLast(E e): Listenin sonuna bir öğe ekler.
        mylist.addLast("Huseyin");
        System.out.println(mylist); // [Hasan, Ali, Zeynep, Veli, Ayse, Fatma, Huseyin]

        //5) remove(Object o): Belirtilen öğeyi listeden kaldırır ve boolean dondurur
        mylist.remove();
        System.out.println(mylist); // [Ali, Zeynep, Veli, Ayse, Fatma, Huseyin]

        mylist.remove("Huseyin");
        System.out.println(mylist); // [Ali, Zeynep, Veli, Ayse, Fatma]

        //6)removeFirstOccurrence() metodu,
        // belirtilen bir öğeyi LinkedList içinde
        //bastan başlayarak arar ve bu öğeyi bulduğunda onu listeden kaldırır.
        //Eğer bu öğe birden fazla kez bulunuyorsa, en bastaki öğe kaldırılır.
        //Eğer belirtilen öğe listede bulunmuyorsa, herhangi bir değişiklik yapmaz ve liste aynı kalır.
        mylist.add("Yusuf");
        mylist.add(3,"Yusuf");
        System.out.println(mylist); // [Ali, Zeynep, Veli, Yusuf, Ayse, Fatma, Yusuf]
        mylist.removeFirstOccurrence("Yusuf");
        System.out.println(mylist); // [Ali, Zeynep, Veli, Ayse, Fatma, Yusuf]

        //7) removeLastOccurrence metodu, belirtilen bir öğeyi LinkedList içinde
        //sondan başlayarak arar ve bu öğeyi bulduğunda onu listeden kaldırır.
        //Eğer bu öğe birden fazla kez bulunuyorsa, en sondaki öğe kaldırılır.
        //Eğer belirtilen öğe listede bulunmuyorsa, herhangi bir değişiklik yapmaz ve liste aynı kalır.

        mylist.removeLastOccurrence("Yusuf");
        System.out.println(mylist); // [Ali, Zeynep, Veli, Ayse, Fatma]


        //8) peek() metodu, bir koleksiyonun ilk elemanına erişmek için kullanılır.
        // Bu metod, elemanı koleksiyondan kaldırmaz.
        // Bu metod, koleksiyon boşsa null dondurur)
        System.out.println(mylist.peek()); // Ali
        System.out.println(mylist); // [Ali, Zeynep, Veli, Ayse, Fatma]
        System.out.println(mylist.peekLast()); // Fatma
        System.out.println(mylist); // [Ali, Zeynep, Veli, Ayse, Fatma]

        //9)poll() metodu, bir koleksiyonun başındaki elemanı alır ve koleksiyondan kaldırır.

        System.out.println(mylist.poll()); // Ali
        System.out.println(mylist); // [Zeynep, Veli, Ayse, Fatma]


        //10) element() metodu, bir koleksiyonun başındaki elemanı alır, ancak elemanı koleksiyondan kaldırmaz.
        // Bu metod, koleksiyon boşsa NoSuchElementException istisnası atar. (peek() null dondurur)
        // bir koleksiyonun boş olup olmadığını kontrol etmek için NoSuchElementException istisnasını kullanir
        System.out.println(mylist.element()); // Zeynep
        System.out.println(mylist); // [Zeynep, Veli, Ayse, Fatma]


        //11) pop() metodu, bir koleksiyonun ilk elemanını alır ve koleksiyondan kaldırır.
        // Bu metod, koleksiyon boşsa NoSuchElementException istisnası atar.(poll() null dondurur)
        System.out.println(mylist.pop()); // Zeynep
        System.out.println(mylist); // [Veli, Ayse, Fatma]


        Queue<String> queue = new LinkedList<>();
        Deque<String> deque = new LinkedList<>();
        List<String> list = new LinkedList<>();

        queue.add("Q1");
        queue.add("Q2");
        queue.add("Q3");
        System.out.println(queue); // [Q1, Q2, Q3]

        deque.add("Dq1");
        deque.add("Dq2");
        deque.addFirst("Dq3");
        System.out.println(deque); // [Dq3, Dq1, Dq2]




    }
}
