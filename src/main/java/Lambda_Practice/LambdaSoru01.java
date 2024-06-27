package Lambda_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaSoru01 {
    public static void main(String[] args) {

        //1) Bir list'teki tek elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.
        // Erstellen Sie eine Methode, die einzelne Elemente in einer Liste
        // in derselben Zeile mit Leerzeichen dazwischen druckt.


        List<Integer> liste = new ArrayList<>(Arrays.asList(8, 13, 5, 6, 7, 8, 11, 16, 8, 7, 3, 2));

        einzelneElementeInListeMitLeerzeichen(liste); // 8 13 5 6 7 11 16 3 2


    }

    public static void einzelneElementeInListeMitLeerzeichen(List<Integer> liste) {
        liste.stream().
                distinct().
                forEach(t -> System.out.print(t + " "));

    }

}
