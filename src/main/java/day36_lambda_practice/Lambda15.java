package day36_lambda_practice;

import java.util.ArrayList;
import java.util.List;

public class Lambda15 {
    public static void main(String[] args) {
        // 15)verilen listedeki ifadelerden buyuk harf iceren kelimeler disindakileri yazdırın

        List<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Elif");
        names.add("elif");
        names.add("yusuf");
        names.add("Yusuf");
        names.add("arda");
        names.add("Niyazi");
        names.add("Esra");
        names.add("Hasan");
        names.add("Hüseyin");
        names.add("Zeynep");

        method(names);

    }
    public static void method( List<String> list){
        list.stream().
                filter(Utils::withoutCapitalLetters).
                forEach(System.out::println);
    }
}
