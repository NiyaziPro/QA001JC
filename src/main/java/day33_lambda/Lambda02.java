package day33_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda02 {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>(Arrays.asList(2, 3, -17, 55, 3, 5, 6, 7, 8, 10, -10, 11, 14));

        minimum1(myList);
        minimum2(myList);
        minimum3(myList);
        minimum4(myList);


    } //7)Verilen List'teki "minimum değeri" bulmak için bir method oluşturun

    public static void minimum1(List<Integer> myList) {

        int min = myList.stream().
                distinct().
                reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u);

        System.out.println(min);

    }

    public static void minimum2(List<Integer> myList) {
        //myList.get(0)

        int min = myList.stream().
                distinct().
                reduce(myList.get(0), (t, u) -> t < u ? t : u);

        System.out.println(min);

    }

    public static void minimum3(List<Integer> myList) {

        //sorted(Comparator.reverseOrder()) ifadesi,
        // Java Stream API'si içinde bir koleksiyonu ters sıralamak için kullanılır.
        //Comparator class, reverseOrder() methoddur.
        Integer min = myList.stream().
                distinct().
                sorted(Comparator.reverseOrder()).
                reduce((t, u) -> u).get();

        System.out.println(min);

    }

    public static void minimum4(List<Integer> myList) {

        int min = myList.stream().
                distinct().
                reduce(Math::min).get();

        System.out.println(min);

    }


}
