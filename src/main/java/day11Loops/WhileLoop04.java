package day11Loops;

public class WhileLoop04 {
    public static void main(String[] args) {
        //Ornek 1:  Belirli bir tamsayının palindrome olup olmadığını kontrol eden kodu yazın.
        //          Palindrome: 121 <==> 121       123321 <==> 123321

        int sayi = 121;
        String m = String.valueOf(sayi);
        String reserved = ""; // ters cevirecegimiz sayi degerini buna atayacagiz

        //  for (int i = m.length() - 1; i >= 0; i--) {
        //      reserved = reserved + m.charAt(i);
        //  }
        //  System.out.println(reserved);
        //  if (m.equals(reserved)){
        //      System.out.println("Polindrom'dur !");
        //  } else {
        //      System.out.println("Polindrom degildir !");
        //  }

        int i = m.length() - 1;
        while (i >= 0) {
            reserved = reserved + m.charAt(i);
            i--;
        }
        if (m.equals(reserved)) {
            System.out.println("Polindrom'dur !");
        } else {
            System.out.println("Polindrom degildir !");
        }


    }
}
