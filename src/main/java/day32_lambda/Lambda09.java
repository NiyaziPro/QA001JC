package day32_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda09 {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>(Arrays.asList(2, 3, 3, 8, 16, 5, 10, 10, 11, 14));

        tekrarsiz4BolunenKareKokCarpimi(myList);

    }/*
        bir listedeki tekrarsiz elemanlardan 4'e tam bolunenlerin karekoklerinin carpimini yazdirin
        */

    public static void tekrarsiz4BolunenKareKokCarpimi(List<Integer> myList) {

        double carpim = myList.stream().
                                    distinct().
                                        filter(t -> t % 4 == 0).
                                            map(Math::sqrt).
                                                reduce(1.0, (t, u) -> t * u);
        System.out.println(carpim);
        System.out.printf("%.2f",carpim);
    }


}
