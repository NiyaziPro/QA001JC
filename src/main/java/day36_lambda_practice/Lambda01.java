package day36_lambda_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
        //1) Bir list'teki tek elemanlari ayni satirda aralarina bosluk koyarak
        // yazdiran method'u olusturunuz.

        List<Integer> mylist = new ArrayList<>(List.of(2, 4, 6, 8, 9, 10, 20, 21, 25, 12));
        tekYazdiran(mylist);


    }

    public static void tekYazdiran(List<Integer> mylist) {
        mylist.stream().
                filter(Utils::isNumberOdd).
                forEach(Utils::printObject);
    }
}
