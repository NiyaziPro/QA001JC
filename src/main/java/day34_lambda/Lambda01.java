package day34_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 11, 10, -11, 16, 19, 22, 14, -32));
        List<String> names = new ArrayList<>();
        names.add("AliX");
        names.add("Elif");
        names.add("ElifX");
        names.add("Yusuf");
        names.add("Yusuf");
        names.add("Arda");
        names.add("Niyazi");
        names.add("Esra");
        names.add("Hasan");
        names.add("Hüseyin");
        names.add("Zeynep");

        //removeIfLengthGreaterThanFive(names);
        //removeIfStartWithZOrEndWithf(names);
        //removeIfContainsX(names);






        //numbers.stream().distinct().sorted().forEach(Utils::printInTheSameLineWithSpace);


    } public static void method1(List<String> list){
        list.stream().
                distinct().
                map(String::toLowerCase).
                sorted(Comparator.comparing(String::length)).
                forEach(Utils::printInTheSameLineWithSpace);


    }
    //1) Karakter sayisi 5'ten fazla olan elemanları silen bir method oluşturun.
    public static void removeIfLengthGreaterThanFive(List<String> list){
        //removeIf() metodu, koleksiyonlardaki (özellikle List, Set gibi) elemanları belirli bir koşula göre
        // kaldırmak için kullanılır.removeIf metodu Collection arayüzünde tanımlıdır,
        // stream kullanilmadan cagirilir
        list.removeIf(t->t.length()>5);
        System.out.println(list);

    }
    public static void removeIfStartWithZOrEndWithf(List<String> list){
        //2 ) ‘Z’ ile başlayan yada ‘f’ ile biten elemanları silen bir method oluşturun.
        //1.yol
        list.removeIf(t->t.startsWith("Z")||t.endsWith("f"));
        System.out.println(list);
        //2.yol
        list.removeIf(t->t.charAt(0)=='Z' || t.charAt(t.length()-1) == 'f');
        System.out.println("list = " + list);
    }

    //3 ) "X" karakteri iceren elemanları silen bir method oluşturun.
    public static void removeIfContainsX(List<String> list){
        list.removeIf(t->t.contains("X"));
        System.out.println(list);
    }








}
