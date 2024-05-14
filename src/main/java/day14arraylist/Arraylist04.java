package day14arraylist;

import java.util.ArrayList;

public class Arraylist04 {
    public static void main(String[] args) {
        //Ornek 1:  Bir String ArrayList oluşturun ve "a" içeren elemanlari silin.

        ArrayList<String> list = new ArrayList<>();
        list.add("Esra Hanim");
        list.add("Niyazi Bey");
        list.add("Ahmet Hoca");
        list.add("Cem Bey");
        list.add("Eren");

        // bir eleman silecegimiz zaman for each dongusu kullanamayiz, cunku for each  kac eleman var

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("a")){
                list.remove(i);
                i--;
            }

        }
        System.out.println(list);

    }
}
