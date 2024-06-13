package proje.aracSigortaApp;

import java.util.Scanner;

public class Arac {
    /*
     Tarife dönemi:Aralık 2024,Haziran 2024
                  1.dönem :Haziran 2024               2.dönem:Aralık 2024
                  otomobil: 2000                       otomobil: 2500
                  kamyon:   3000                       kamyon:   3500
                  otobüs: tip1: 4000 tip2: 5000        otobüs: tip1: 4500 tip2: 5500
                  motosiklet: 1500                     motosiklet: 1750
     */

    public String type;
    public int prim;

    // 5. prim hesaplama
    public void primHesapla(int donem) {
        // tipine gore hesaplama

        switch (this.type) {
            case "otomobil":
                this.prim = donem == 1 ? 2000 : 2500;
                break;
            case "kamyon":
                this.prim = donem == 1 ? 3000 : 3500;
                break;
            case "otobus":
                primHesaplaOtobus(donem);
            case "motosiklet":
                this.prim = donem == 1 ? 1500 : 1750;
                break;
            default:
                System.err.println("Hatali giris!!!");
                this.prim = 0;
                break;


        }
    }

    public void primHesaplaOtobus(int donem) {

        Scanner input = new Scanner(System.in);
        System.out.println("Otobus tipini seciniz : \n1. 18-30 arasi koltuk sayisi \n2. 31 ve ustu koltuk sayisi");
        int otobusTipi = 0;
        if (input.hasNextInt()) {
            otobusTipi = input.nextInt();
        } else {
            System.err.println("Sadece otobus tipi numarasini  giriniz!!!");
            input.nextLine();
        }
        switch (otobusTipi) {
            case 1:
                this.prim = donem == 1 ? 4000 : 4500;
                break;
            case 2:
                this.prim = donem == 2 ? 5000 : 5500;
                break;
            default:
                System.err.println("Hatali giris !!!");
                this.prim = 0;
                break;
        }
    }

     /*
                 switch (this.type) {
            case "otomobil":
                if (donem==1){
                    prim = 2000;
                    System.out.println(prim+"TL");
                }else {
                    prim = 2500;
                    System.out.println(prim+"TL");
                }
            case "kamyon":
                if (donem==1){
                    prim = 3000;
                    System.out.println(prim+"TL");
                }else {
                    prim = 3500;
                    System.out.println(prim+"TL");
                }
            case "otobus":
                if (donem==1){
                    if (type.equalsIgnoreCase("tip1")){
                        prim = 4000;
                        System.out.println(prim+"TL");
                    } else {
                        prim = 5000;
                        System.out.println(prim+"TL");
                    }

                }else {
                    if (type.equalsIgnoreCase("tip1")){
                        prim = 4500;
                        System.out.println(prim+"TL");
                    } else {
                        prim = 5500;
                        System.out.println(prim+"TL");
                    }
                }
            case "motosiklet":
                if (donem==1){
                    prim = 1500;
                    System.out.println(prim+"TL");
                }else {
                    prim = 1750;
                    System.out.println(prim+"TL");
                }
                 */
}
