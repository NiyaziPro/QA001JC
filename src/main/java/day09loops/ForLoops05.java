package day09loops;

public class ForLoops05 {
    public static void main(String[] args) {
        // Ornek 2: Verilen bir String'de kucuk harfleri console'a yazdirmayan kodu yaziniz
        //                "Pwd12?Ab" ==> P12?A

        String str = "Pwd12?Ab";
        System.out.println(str.replaceAll("[a-z]", ""));

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch < 'z') {
                continue;
            } else {
                System.out.print(ch);
            }

        }
    }
}
