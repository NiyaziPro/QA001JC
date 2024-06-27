package day36_lambda_practice;

import java.util.ArrayList;
import java.util.List;

public class Lambda06 {
    public static void main(String[] args) {
        //6)bir listedeki elemanlardan 3'e bolunenlerin
        // ilk once kupunu alıp sonra bunlarin toplamını bulan bir method olusturun

        List<Integer> mylist = new ArrayList<>(List.of(2, 4, 6, 8, 9, 10, 20, 21, 25, 12));
        System.out.println(uceBolunenKupToplam(mylist));

    }

    public static Integer uceBolunenKupToplam(List<Integer> mylist) {
        return mylist.stream().
                filter(Utils::isNumberDivisibleThree).
                map(Utils::cubeANumber).
                reduce(0, Utils::sum);
    }
}
