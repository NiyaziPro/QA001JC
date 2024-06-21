package day33_lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda08 {
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

        alfabetikSiradaYazdir(mylist);



    }
        //ornek 13: Bir List'teki elemanlari tekrarsiz olarak, buyuk harflerle, alfabetik sirada
        // console'a yazdiran method'u olusturunuz.

    public static void alfabetikSiradaYazdir( List<String> mylist ){
        mylist.stream().
                distinct().
                map(String::toUpperCase).
                sorted().
                forEach(System.out::println);
    }

}
