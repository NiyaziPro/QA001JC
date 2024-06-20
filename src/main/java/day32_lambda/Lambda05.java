package day32_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda05 {
    public static void main(String[] args) {
        List<Integer> numb = new ArrayList<>(Arrays.asList(2, 3, 3, 5, 10, 10));
        tekrarsizTekKup(numb);
    }
    //1) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda
    //aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void tekrarsizTekKup(List<Integer> numb) {
        numb.stream().distinct().filter(t-> t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t+" "));
    }
}
