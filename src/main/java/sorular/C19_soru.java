package sorular;

import java.util.ArrayList;
import java.util.Arrays;

public class C19_soru {
    public static void main(String[] args) {


        //bir String list olusturup eleman ekleyin ve icinde bosluk iceren karakterleri yazdirin

        ArrayList<String> list = new ArrayList<>();
        list.add("Ja va ");
        list.add("can ");
        list.add("dir");
        list.add("geri si ");
        list.add("hey e can ");

        System.out.println(list);

        for (String s : list) {
            if (!s.contains(" ")) {
                System.out.println(s);
            }
        }






    }
}
