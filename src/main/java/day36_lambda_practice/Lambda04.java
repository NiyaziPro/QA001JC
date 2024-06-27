package day36_lambda_practice;

import java.util.ArrayList;
import java.util.List;

public class Lambda04 {
    public static void main(String[] args) {

        //4) Bir list'teki "3'e tam bolunmeyen" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda
        //aralarina bosluk koyarak yazdiran method'u olusturunuz.

        List<Integer> mylist = new ArrayList<>(List.of(2, 4, 6, 8, 9, 10, 20, 21, 25, 12));

        uceBolunmeyenlerinKupleri(mylist);


    }
    public static void uceBolunmeyenlerinKupleri(List<Integer> mylist){
        mylist.stream().
                distinct().
                filter(Utils::isNumberNotDivisibleThree).
                map(Utils::cubeANumber).
                forEach(Utils::printObject);
    }
}
