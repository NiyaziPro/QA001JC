package sorular;

import java.util.Scanner;

public class C08_soru {
    public static void main(String[] args) {

        // kullanicidan toplamak istedigi sayilari alin
        // ve kullanici 0'a basincaya kadar devam edin
        // kullanici 0'a bastiginda
        // girdigi tum sayilarin toplamini yazdirin

        Scanner input = new Scanner(System.in);
        int toplam = 0;


        while (true){
            System.out.println("Lutfen toplamak istediginiz sayilari giriniz \nsiz 0'a basana kadar devam edecektir:");
            int sayi = input.nextInt();
            toplam+=sayi;
            if (sayi==0){
                System.out.println("Sayilarin toplami : "+toplam);
                System.out.println("Bizi tercih ettiginiz icin tesekkurler tekrar bekleriz !");
                break;
            }

        }

    }
}
