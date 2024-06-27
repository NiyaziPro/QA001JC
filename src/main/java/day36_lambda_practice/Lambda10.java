package day36_lambda_practice;

import java.util.ArrayList;
import java.util.List;

public class Lambda10 {
    public static void main(String[] args) {
        //10) Bir List'teki A ile baslayanlar haric tum elemanlari
        //console'a yazdiran method'u olusturunuz.

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

        aHaric(names);


    }
    public static void aHaric(List<String> list){
        list.stream().filter(Utils::isDontStartWithA).forEach(Utils::printObject);

    }

}
