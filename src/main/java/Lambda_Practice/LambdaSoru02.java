package Lambda_Practice;

import java.util.ArrayList;
import java.util.List;

public class LambdaSoru02 {
    public static void main(String[] args) {
        //2) bir listedeki elemanlardan 5'e tam bolunenleri yazdiran bir method olusturun
        // Erstellen Sie eine Methode, die die Elemente in einer Liste ausgibt, die durch 5 teilbar sind.

        List<Integer> ersteListe = new ArrayList<>();
        ersteListe.add(50);
        ersteListe.add(32);
        ersteListe.add(4);
        ersteListe.add(40);
        ersteListe.add(58);
        ersteListe.add(66);
        ersteListe.add(55);
        ersteListe.add(14);
        ersteListe.add(97);
        ersteListe.add(100);
        ersteListe.add(72);
        ersteListe.add(55);

        elementeInListeDurchFunfTeilbar(ersteListe); // 50 40 55 100

    }

    public static void elementeInListeDurchFunfTeilbar(List<Integer> eineListe) {
        eineListe.
                stream().
                distinct().
                filter(t -> t % 5 == 0).
                forEach(Dienstprogramme::DruckeInDerGleichenZeileMitLeerzeichen);
    }
}
