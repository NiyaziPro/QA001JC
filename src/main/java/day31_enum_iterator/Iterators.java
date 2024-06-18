package day31_enum_iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterators {
    public static void main(String[] args) {
        /*
       1- Iterator'ler loop'larin yaptigi ayni isi yapar
       2) Iterator'lerde sonsuz loop olusma ihtimali yoktur(for each gibi)
       3) Iterator'ler ile loop'lar arasinda performans farki yoktur
       4) Iterator'ler bir collection'dan eleman silme ve bir collection'daki elemani degistirme konusunda daha basarilidir
       5) Iki tip iterator vardir:
           a) Iterator:
           Bu sadece eleman silmede kullanilir, eleman eklemek veya elemani degistirmek mumkun degildir
           b) ListIterator:
           Bu eleman silebilir, ekleyebilir ve degistirebilir

           Not:
           Iterator, sadece soldan saga (ilk elemandan son elemana) calisir
           ListIterator iki yonlu calisabilir
        */

       /* List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);

        for (Integer a :myList){
            if (a==4){
                myList.remove(a);
            }
        }
        System.out.println(myList); // ConcurrentModificationException*/

        List<String> myList = new ArrayList<>();
        myList.add("Esra");
        myList.add("Niyazi");
        myList.add("Ali");
        myList.add("Ahmet");
        myList.add("Mehmet");

        System.out.println(myList);

        Iterator<String> itr = myList.iterator();
        // eleman silme yapalim ama once bize bazi methodlari aciklamak lqzim
        //remove()  : Pointer'in atladigi elemani siler
        //hasNext() : Koleksiyon bir sonraki elemanin olup olmadigini kontrol eder (boolean)
        // next()   : Pointer'i bir sonraki elemanin onune konumlandirir ve pointer'in atladigi elemani verir

        while (itr.hasNext()) {
            itr.next(); // pointer'i 2 elemanin onune alir ve atladigi degeri dondurur
            itr.remove(); // next ile gectigimiz degeri siler

        }
        System.out.println(myList); // []
        myList.add("Esra");
        myList.add("Niyazi");
        myList.add("Ali");
        myList.add("Ahmet");
        myList.add("Mehmet");

        itr = myList.iterator();

        //**specific bir elemani iterator ile nasil silebiliriz? (Ali'yi silelim)

        while (itr.hasNext()) {
            String el = itr.next();
            if (el.equals("Ali")) {
                itr.remove();
            }
        }
        System.out.println(myList);


    }
}
