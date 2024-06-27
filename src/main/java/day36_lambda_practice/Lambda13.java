package day36_lambda_practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda13 {
    public static void main(String[] args) {

        //13) Bir List'teki elemanlari tekrarsiz olarak, kucuk harflerle, alfabetik sira'nin tersi olarak
        // console'a yazdiran method'u olusturunuz.

        List<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Elif");
        names.add("Elif");
        names.add("Yusuf");
        names.add("Yusuf");
        names.add("Arda");
        names.add("Niyazi");
        names.add("Esra");
        names.add("Hasan");
        names.add("Hüseyin");
        names.add("Zeynep");

        tekrarsizKucukTersYazdir(names);

    }

    public static void tekrarsizKucukTersYazdir(List<String> list) {
        list.stream().distinct().
                map(String::toLowerCase).
                sorted(Comparator.reverseOrder()).
                forEach(System.out::println);
    }
}
