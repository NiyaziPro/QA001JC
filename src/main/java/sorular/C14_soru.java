package sorular;

import java.util.Arrays;

public class C14_soru {
    public static void main(String[] args) {
        /*
            bir array olusturun ve bu arraydeki
             elemanlari alfabetik siraya gore siralayin
         */

        String [] array = {"java","candir", "sonrasi","heyecan"};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
