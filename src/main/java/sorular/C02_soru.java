package sorular;

import java.util.Scanner;

public class C02_soru {
    public static void main(String[] args) {
        //  kullanicidan bir cumle isteyiniz ve cumlenin
        //  bas(ilk) harfini buyultun eger noktalama isareti yoksa noktalama isareti ekleyin

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz :");
        String cumle = input.nextLine(); // java bugun cok guzel geciyor

        String sonHali=cumle.toUpperCase().charAt(0) + cumle.substring(1);

        if (sonHali.endsWith(".")) {
            System.out.println(sonHali);
        }
        if (!sonHali.endsWith(".")) {
            System.out.println(sonHali + ".");
        }


    }
}
