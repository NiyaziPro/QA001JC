package Lambda_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaSoru04 {
    public static void main(String[] args) {

        //4) Bir list'teki "3'e tam bolunmeyen" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda
        //aralarina bosluk koyarak yazdiran method'u olusturunuz.
        //Erstellen Sie eine Methode, die die Würfel von Elementen in einer Liste, die „nicht durch 3 teilbar“ sind,
        // ohne Wiederholung in derselben Zeile mit einem Leerzeichen dazwischen druckt.

        List<Integer> dritteListe = new ArrayList<>(Arrays.asList(1, 3, 4, 9, 6, 3, 2, 7, 8, 10, 14, 22, 45, 69, 87));

        wurfelElementNichtDurchDreiTeilbar(dritteListe); // 1 64 8 343 512 1000 2744 10648

    }

    public static void wurfelElementNichtDurchDreiTeilbar(List<Integer> liste) {
        liste.stream().
                distinct().
                filter(t -> t % 3 != 0).
                map(t -> t * t * t).
                forEach(Dienstprogramme::DruckeInDerGleichenZeileMitLeerzeichen);
    }
}
