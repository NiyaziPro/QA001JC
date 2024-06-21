package day33_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda07 {
    public static void main(String[] args) {

        List<String> mylist = new ArrayList<>();
        mylist.add("Ali");
        mylist.add("Elif");
        mylist.add("Yusuf");
        mylist.add("Arda");
        mylist.add("Niyazi");
        mylist.add("Esra");
        mylist.add("Hasan");
        mylist.add("Hüseyin");

        method(mylist);


    }

    //ornek 12: Bir List'teki karakter sayisi 5’den az olan tum elemanlari tekrarsiz olarak kucuk harflerle
    // natural order da console'a yazdiran method'u olusturunuz.

    public static void method(List<String> mylist) {
        mylist.stream().
                distinct().
                filter(t -> t.length() < 5).
                map(String::toLowerCase).
                sorted(Comparator.naturalOrder()).
                forEach(System.out::println);
    }
}
