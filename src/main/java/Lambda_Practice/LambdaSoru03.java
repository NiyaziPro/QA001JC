package Lambda_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaSoru03 {
    public static void main(String[] args) {
        //3) Bir list'teki "10'dan kucuk" olan elemanlarin "kare"lerini ayni satirda  aralarina bosluk
        //koyarak yazdiran method'u olusturunuz.
        // Erstellen Sie eine Methode, die die Quadrate der Elemente „weniger als 10“ in einer Liste
        // in derselben Zeile mit einem Leerzeichen dazwischen druckt.

        List<Integer> zweiteListe = new ArrayList<>(Arrays.asList(1, 3, 4, 9, 6, 3, 2, 7, 8, 10, 14, 22, 45, 69, 87));

        quadrateDerElementeWenigerAlsZehn(zweiteListe); // 1 9 16 81 36 9 4 49 64

    }

    public static void quadrateDerElementeWenigerAlsZehn(List<Integer> liste) {
        liste.stream().
                filter(t -> t < 10).
                map(t -> t * t).
                forEach(Dienstprogramme::DruckeInDerGleichenZeileMitLeerzeichen);
    }
}
