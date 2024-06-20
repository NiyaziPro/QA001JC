package day32_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda07 {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>(Arrays.asList(2, 3, 3, 5, 10, 10,11,14));

        tekrarsizCiftKareCarpim(myList);


    }//1) Bir list'teki "Tekrarsiz" elemanlardan "çift" olanlarin "karesinin"
    // "çarpımını" hesaplayan bir method oluşturun
    public static void tekrarsizCiftKareCarpim(List<Integer> myList) {
        int carpim = myList.
                    stream().
                    distinct().
                    filter(t -> t % 2 == 0).
                    map(t -> t * t).
                    reduce(1, (t, u) -> t * u);

        System.out.println(carpim);
    }
}
