package sorular;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class C26_soru {
    public static void main(String[] args) {

        // bir linked list olusturup eleman ekleyin ve bu linkedlisti bir sete donusturun

        LinkedList<String> citys = new LinkedList<>();
        citys.add("Lübeck");
        citys.add("Hamburg");
        citys.add("Frankfurt");
        citys.add("Travemünde");
        citys.add("Travemünde");
        citys.add("Lübeck");
        System.out.println(citys); // [Lübeck, Hamburg, Frankfurt, Travemünde, Travemünde, Lübeck]

        Set<String> citysSet = new HashSet<>(citys);
        //citysSet.addAll(citys);
        System.out.println(citysSet); // [Frankfurt, Lübeck, Hamburg, Travemünde]

    }
}
