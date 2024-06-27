package day36_lambda_practice;

import java.util.ArrayList;
import java.util.List;

public class Lambda07 {
    public static void main(String[] args) {
        //7)bir listedeki tekrarsiz elemanlardan 4'e tam bolunenlerin karekoklerinin carpimini yazdirin

        List<Integer> mylist = new ArrayList<>(List.of(2, 4, 6, 8, 9, 10, 20, 21, 25, 12));

        dordeBolunenKarekokCarpimi(mylist);

    }

    public static void dordeBolunenKarekokCarpimi(List<Integer> mylist) {
        int number = mylist.stream().
                distinct().
                filter(Utils::isNumberDivisibleFour).
                map(Utils::sqrt).
                reduce(1, Utils::multiply);

        System.out.println(number);

    }
}
