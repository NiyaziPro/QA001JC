package day30_exceptions;

import java.util.Scanner;

public class C01_Exception {
    public static void main(String[] args) {
        /*
        kullanıcının girdigi site linkinde virus var mı
        diye kontrol saglayın virus varsa exception firlatın
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kontrol etmek istediginiz site linkini giriniz : ");
        String link = input.nextLine();

        boolean virussuzMu = link.contains("wwww.")&&link.contains(".com");

        if (virussuzMu){
            System.out.println(link);
        } else {
            throw new VirusException ("Bu site virus icerebilir, tiklamadan once lutfen bi daha dusunun!");

        }

    }
}
