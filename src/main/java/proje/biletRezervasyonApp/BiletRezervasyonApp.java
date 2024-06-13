package proje.biletRezervasyonApp;

import java.util.Scanner;

public class BiletRezervasyonApp {

            /*
        project: Bilet Rezervasyon ve Bilet Fiyatı Hesaplama Uygulaması

                1-Uygulama mesafe ve kurallara göre otobüs bileti fiyatı hesaplar sonuç olarak bilet bilgisini verir
                2- Kullanıcıdan     mesafe (KM),
                yolcu yaşı ,
                yolculuk tipi (Tek Yön, Gidiş-Dönüş)
                ve koltuk no bilgilerini alınır.
                NOT: Koltuk numaraları 1-32 aralığında olmalıdır.)
                Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
                Aksi halde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

                3-Fiyat hesaplama kuralları:
                -Mesafe başına ücret:
                Tek yön: 1 Lira / km       Çift Yön(Gidiş-Dönüş): 2 Lira/km
                -Tekli Koltuk ücreti:
                Koltuk no 3 veya 3 ün katı ise fiyat %20 daha fazladır(Tek yön: 1.2 Lira/km, Çift Yön:2.4 Lira/km).
                -İlk olarak seferin mesafe, yön ve koltuk no bilgisine göre fiyatı hesaplanır,
                sonrasında koşullara göre aşağıdaki indirimler uygulanır ;
                i)-Çift Yön indirimi:
                "Yolculuk Tipi" gidiş dönüş seçilmiş ise son bilet fiyatı üzerinden %20 indirim uygulanır.
                ii)-Yaş indirimi:
                Kişi 12 yaşından küçükse son bilet fiyatı üzerinden %50 indirim uygulanır.
                Kişi 65 yaşından büyük ise son bilet fiyatı üzerinden %30 indirim uygulanır.

                */

    public static void main(String[] args) {
        // 1. bilet rezervasyonu yapabilmek icin bir otobuse ihtiyacimiz var

        Bus bus = new Bus("80 AB 80", "Techpro", "2.Peron");

        //3-bilet objesi olusturup biletle ilgili ozellikleri koyucaz
        Ticket ticket = new Ticket();
        //ticket.printTicket(bus);
        // 7. uygulamayi baslatan bir method
        //start(ticket, bus);
        start();
        /*
         2- Kullanıcıdan     mesafe (KM),
                yolcu yaşı ,
                yolculuk tipi (Tek Yön, Gidiş-Dönüş)
                ve koltuk no bilgilerini alınır.
                NOT: Koltuk numaraları 1-32 aralığında olmalıdır.)
                Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
                Aksi halde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
         */

    }

    public static void start(Ticket ticket, Bus bus) {
        // 8.Kullanicidan bilgi almak
        Scanner input = new Scanner(System.in);

        int select;
        do {
            System.out.println("<< Bilet Rezervasyon uygulamasina hosgeldiniz >>");
            System.out.println("Lutfen Mesafe bilgisini KM olarak giriniz : ");
            double distance = input.nextDouble();

            System.out.println("Lutfen yolculuk tipini seciniz : \n1. Tek yon \n2. Gidis-donus");
            int type = input.nextInt();

            System.out.println("Lutfen yasinizi giriniz : ");
            int age = input.nextInt();

            System.out.println("Lutfen koltuk No seciniz \nTekli koltuk ucreti %20 daha fazladir");
            System.out.println(bus.seats);//Mevcut koltuk No'lari getirir
            String seat = input.next();
            // secilen koltuk no listede varmi yoksa rezerve edilmismi
            boolean isReserved = !bus.seats.contains(seat);
            if (isReserved) {
                System.out.println("Secilen koltuk rezerve edilmistir");

            }
            //girilen degerler gecerli mi ?
            if (age > 0 && distance > 0 && (type == 1 || type == 2) && !isReserved) {
                // girilen degerler gecerli ise listeden koltugumuzu silelim
                bus.seats.remove(seat);

                // bileti olusturalim
                ticket.distance=distance;
                ticket.seatNo=seat;
                ticket.typeNo = type;
                ticket.getTotalPrice(age);
                ticket.printTicket(bus);
            }else {
                System.out.println("Hatali veri girdiniz!! Lutfen tekrar deneyin.");
            }
            System.out.println("Yeni islem icin bir sayi giriniz,Cıkış icin 0'i seciniz");
            select= input.nextInt();

        }while (select!=0);
        System.out.println("iyi gunler dileriz ve tekrar bekleriz");




    }

    public static void start() {
        // Kullanicidan bilgi almak

        Scanner input = new Scanner(System.in);
        // Menu
        boolean isAgain = false;

        do {
            System.out.println("<< Techpro Bilet Rezervasyonu >> ");
            System.out.println("Bilet rezervasyonu yapmak icin lutfen asagidaki istenen bilgileri giriniz.");
            System.out.println();

            System.out.println("Lutfen mesafeyi km olarak giriniz : ");
            //Mesafe
            double distance;
            if (input.hasNextDouble()) {
                distance = input.nextDouble();
                if (distance <= 0) {
                    System.err.println("Mesafe 0 veya negatif olamaz!");
                    isAgain = true;
                    distance = 0;
                    continue;
                }
            } else {
                System.err.println("Hatalı Veri Girdiniz! Lutfen gecerli bir deger giriniz!");
                input.nextLine();//dummy
                isAgain = true;
                continue;
            }

            // yolcu yasi
            System.out.println("Lutfen yasinizi giriniz : ");
            int age;
            if (input.hasNextInt()) {
                age = input.nextInt();
                if (age <= 0) {
                    System.err.println("Yasiniz 0 veya negatif olamaz!");
                    continue;
                }
            } else {
                System.err.println("Hatalı Veri Girdiniz! Lutfen gecerli bir deger giriniz!");
                input.nextLine();//dummy
                isAgain = true;
                continue;
            }
            // yolculuk tipi
            System.out.println("Yolculuk tipini seciniz : \n1. Tek yön \n2. Gidiş-Dönüş");
            int type;
            if (input.hasNextInt()) {
                type = input.nextInt();
            } else {
                System.err.println("Yanlis  girdiniz! Lutfen tekrar deneyin!");
                input.nextLine();
                isAgain = true;
                continue;
            }
            String yolculukTipi = type == 1 ? "Tek yön" : "Gidiş-Dönüş";
            if (type != 1 && type != 2) {
                System.err.println("Hatali giris!!!");
                isAgain = true;
                continue;
            }
            // koltuk no bilgileri
            System.out.println("Lutfen 1'den 32'ye kadar bir koltuk numarasi seciniz : " +
                    "\nTek koltuk numaralari : 1,5,9,13,17,21,25,29 \n");
            koltukGorsel();
            String koltukNo = input.next();
            int koltukNum = Integer.parseInt(koltukNo);
            if (koltukNum <= 0 || koltukNum > 32) {
                System.err.println("Hatali giris! Lutfen tekrar deneyin...");
                isAgain = true;
                continue;
            }
            input.nextLine();

            // otobus plaka no alma
            System.out.println("Lutfen otobus plaka numarasi giriniz : ");
            String plaka = input.nextLine().toUpperCase();
            plakaNoKontrol(plaka);
            // firma ismi alma
            System.out.println("Lutfen Firma ismini giriniz : ");
            String firma = input.nextLine();
            firma = firma.substring(0, 1).toUpperCase() + firma.substring(1).toLowerCase();
            // peron no alma
            System.out.println("Lutfen Peron No giriniz : ");
            String peron = input.nextLine();
            peron = peron.substring(0, 1).toUpperCase() + peron.substring(1).toLowerCase();


            Bus otobus = new Bus(plaka, firma, peron);
            Ticket ticket = new Ticket();
            ticket.seatNo = koltukNo;
            ticket.distance = distance;
            ticket.typeNo = type;

            if (distance > 0) {
                System.out.println("****************************************");
                ticket.getTotalPrice(age);
                ticket.printTicket(otobus);

                System.out.println("Yeni islem icin 1, cikis icin 0'i seciniz");
                int select = input.nextInt();
                isAgain = select == 1 ? true : false;
            } else {
                System.err.println("Rezervasyon islemi basarisiz, tekrar deneyiniz!");
                System.out.println("Yeni islem icin 1, cikis icin 0'i seciniz");
                int select = input.nextInt();
                isAgain = select == 1 ? true : false;
            }


        } while (isAgain);
    }

    public static void koltukGorsel() {
        System.out.println("|  1 |  | 2| 3| 4|" +
                "\n|  5 |  | 6| 7| 8|" +
                "\n|  9 |  |10|11|12|" +
                "\n| 13 |  |14|15|16|" +
                "\n| 17 |  |18|19|20|" +
                "\n| 21 |  |22|23|24|" +
                "\n| 25 |  |26|27|28|" +
                "\n| 29 |  |30|31|32|");
        //fori dongusu ic ice fori 8 / fori 4


    }

    public static String plakaNoKontrol(String plakaNo) {
        // En az  karakter olsun
        boolean lenghtControl = plakaNo.length() >= 6;

        // Space karakteri password'de olmasin
        boolean spaceControl = !plakaNo.contains(" ");


        // En az dort tane rakam olsun
        boolean digitControl = plakaNo.replaceAll("[^0-9]", "").length() >= 4;
        boolean wordControl = plakaNo.toLowerCase().replaceAll("[^a-z]", "").length() >= 2;
        boolean isValid = lenghtControl && spaceControl && digitControl;

        if (isValid) {
            System.out.println("Plaka No gecerlidir");
        } else {
            System.out.println("Plaka No Gecerli degildir");
            if (!digitControl) {
                System.err.println("Plaka No En az dort tane rakam icermeli!");
            }
            if (!wordControl) {
                System.err.println("Plaka No En az iki tane harf icermeli!");
            }
            if (!spaceControl) {
                System.err.println("Plaka No Space karakteri iceremez!");
            }
            if (!lenghtControl) {
                System.err.println("Plaka No en az 6 karaktere sahip olmali!");
            }

        }
        return plakaNo;


    }


}
