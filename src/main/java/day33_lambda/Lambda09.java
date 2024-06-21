package day33_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda09 {
    public static void main(String[] args) {

        List<String> mylist = new ArrayList<>();
        mylist.add("Ali");
        mylist.add("Elif");
        mylist.add("Elif");
        mylist.add("Yusuf");
        mylist.add("Yusuf");
        mylist.add("Arda");
        mylist.add("Niyazi");
        mylist.add("Esra");
        mylist.add("Hasan");
        mylist.add("Hüseyin");

        siralamaKucuktenBuyuge(mylist);


    }
        //ornek 14: Bir List'teki elemanlari tekrarsiz olarak, kucuk harflerle, uzunluklarina gore
        // kucukten buyuge siralayarak console'a yazdiran method'u olusturunuz.

    public static void siralamaKucuktenBuyuge(List<String> mylist){
        mylist.stream().
                distinct().
                map(String::toLowerCase).
                sorted(Comparator.comparing(String::length)).
                forEach(System.out::println);
    }



}
