package day36_lambda_practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda14 {
    public static void main(String[] args) {
        //14) Bir List'teki elemanlari tekrarsiz olarak, uzunluklarina gore
        // kucukten buyuge siralayarak console'a yazdiran method'u olusturunuz.

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

        tekrarsizUzunlukSiraliYazdir(names);


    }
    public static void tekrarsizUzunlukSiraliYazdir(List<String>list){
        list.stream().distinct().
                sorted(Comparator.comparing(String::length)).
                forEach(System.out::println);
    }
}
