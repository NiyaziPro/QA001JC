package day32_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda08 {
    public static void main(String[] args) {

        List<Integer> birListe = new ArrayList<>(Arrays.asList(1,5,4,3,9));
        guzelBirMethod(birListe);
        List<Double> ikinciListe = new ArrayList<>(Arrays.asList(1.0,2.5,5.0,7.2,6.6,12.0));
        guzelBirMethod2(ikinciListe);

    }
    /*
   bir listedeki elemanlardan 3'e bolunenlerin ilk once kupunu alıp sonra bunlarin toplamını bulan bir method olusturun
 */
    public static void guzelBirMethod(List<Integer> birListe){

        double toplam = birListe.
                stream().
                filter(t->t%3==0).
                map(t->Math.pow(t,3)).
                reduce(0.0, Double::sum);

        System.out.println(toplam);

    }
    public static void guzelBirMethod2(List<Double> birListe){

        double toplam = birListe.
                stream().
                filter(t->t%3==0).
                map(t->Math.pow(t,3)).
                reduce(0.0, Double::sum);

        System.out.println(toplam);

    }


}
