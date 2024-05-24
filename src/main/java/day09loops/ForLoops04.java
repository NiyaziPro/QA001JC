package day09loops;

public class ForLoops04 {
    public static void main(String[] args) {
        /*Ornek 1: Verilen bir String'de ilk 'a' harfinden onceki tum character'leri console'a yazdiriniz
                ==> "Tramvay"==> "Tr"
        */

        String s = "Tramvay";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a') {
                break;
            }
            System.out.print(ch);
        }
    }
}
