package day33_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda10 {
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

        aHarfiBulunanListe(mylist);


    }/*
Verilen listedeki elemanlarindan icerisinde a harfi iceren elemanlari tekrarsiz bir sekilde uzunluklarina gore sıralayip yazdır
 */
    public static void aHarfiBulunanListe(List<String> mylist){
        mylist.stream().
                distinct().
                filter(t->t.contains("a")||t.contains("A")).
                sorted(Comparator.comparing(String::length)).
                forEach(System.out::println);

    }



}
