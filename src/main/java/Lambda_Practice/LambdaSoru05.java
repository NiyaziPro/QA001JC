package Lambda_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaSoru05 {
    public static void main(String[] args) {
        //5)Bir list'teki “tekrarsiz","7'den buyuk" elemanlarin "karelerinin toplamını" hesaplayan method oluşturun
        //Erstellen Sie eine Methode, die die „Summe der Quadrate“ der „nicht wiederkehrenden“,
        // „größer als 7“ Elemente in einer Liste berechnet

        List<Integer> liste = new ArrayList<>(Arrays.asList(1, 3, 4, 9, 6, 3, 2, 7, 8, 10, 14, 22));

        System.out.println(summeQuadrateNichtWiederkehrendenGroserAlsSieben(liste)); // 925
        // 9 * 9 + 8 * 8 + 10 * 10 + 14 * 14 + 22 * 22 = 925


    }

    public static int summeQuadrateNichtWiederkehrendenGroserAlsSieben(List<Integer> liste) {
        return liste.stream().
                distinct().
                filter(t -> t > 7).
                map(t->t*t).reduce(Math::addExact).
                get();
    }
}
