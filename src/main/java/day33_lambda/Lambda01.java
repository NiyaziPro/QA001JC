package day33_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>(Arrays.asList(2, 3, 17, 55, 3, 5, 6, 7, 8, 10, 10, 11, 14));

        maximum1(myList);
        maximum2(myList);
        maximum3(myList);
        maximum4(myList);

    }

    //1)Verilen List'teki "maksimum değeri" bulmak için bir method oluşturun
    public static void maximum1(List<Integer> myList) {
        //Integer.MIN_VALUE : Bu int tipinin alabilecegi en kucuk degeri verir

        int max = myList.stream().
                distinct().
                reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);

        System.out.println(max);

    }

    public static void maximum2(List<Integer> myList) {
        //myList.get(0)

        int max = myList.stream().
                distinct().
                reduce(myList.get(0), (t, u) -> t > u ? t : u);

        System.out.println(max);

    }

    public static void maximum3(List<Integer> myList) {
        //sorted(): Koleksiyonu belirli bir kritere göre sıralar.(naturel order. kucukten buyuge)

        Integer max = myList.stream().
                distinct().
                sorted().
                reduce((t, u) -> u).get();

        System.out.println(max);

    }

    public static void maximum4(List<Integer> myList) {
        //Java'da :: işareti, "Method Reference" olarak adlandırılır.
        // Bir metodun doğrudan referansını alarak lambda ifadeleri yazmadan kullanmanızı sağlar.

        int max = myList.stream().
                distinct().
                reduce(Math::max).get();

        System.out.println(max);

    }


}
