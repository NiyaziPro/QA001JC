package proje.loginPageApp;


import java.util.*;


public class Menu {
    public static void start() {

        Map<String, String> emailsPass = new HashMap<>();


        Scanner scanner = new Scanner(System.in);

        boolean isAgain = false;
        do {
            System.out.println("<< TechPro Education >> \n>> Hosgeldiniz <<" +
                    "\nLutfen yapmak istediginiz islemi giriniz" +
                    "\n1.Giris (Login)\n2.Uye ol (Register)\n3.Cikis (Exit)");
            int giris;
            if (scanner.hasNextInt()) {
                giris = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.err.println("Yanlis  girdiniz! Lutfen tekrar deneyin!");
                scanner.next();
                isAgain = true;
                continue;
            }
            if (giris == 1) {
                System.out.println("Giris yapmak icin Email ve Parolanizi giriniz ");
                System.out.println("Lutfen E-mail adresinizi giriniz  :");
                String email = scanner.next();
                if (!PasswordEmailControl.isValidEmail(email)) {
                    isAgain = true;
                    continue;
                }
                if (!emailsPass.containsKey(email)) {
                    System.err.println("Girilen E-mail bulunamadi. Lutfen uye olun.");
                    isAgain = true;
                    continue;
                } else {
                    System.out.println("Lutfen Parola'nizi giriniz : ");
                    String password = scanner.next();

                    if (emailsPass.get(email).equals(password)) {
                        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                        System.out.println("Uygulamaya giris gerceklesmistir! " +
                                        " \n>>>>>>>>>>>>>Enjoy<<<<<<<<<<<<<<");
                        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
                        break;
                    } else {
                        System.err.println("Yanlis Parola! Lutfen tekrar deneyiniz...");
                        continue;
                    }
                }

            } else if (giris == 2) {
                System.out.println("Uye olmak icin lutfen ad-soyad, email ve şifre bilgilerinizi giriniz");
                System.out.println("Lutfen adinizi giriniz :");
                String name = scanner.nextLine();

                System.out.println("Lutfen soyadinizi giriniz :");
                String surname = scanner.nextLine();

                System.out.println("Lutfen E-mail adresinizi giriniz  :");
                String email = scanner.next();
                if (!PasswordEmailControl.isValidEmail(email)) {
                    isAgain = true;
                    continue;
                }
                if (!emailsPass.containsKey(email)) {

                    System.out.println("Lutfen Parola'nizi giriniz : ");
                    String password = scanner.next();
                    if (!PasswordEmailControl.isValidPassword(password)) {
                        isAgain = true;
                        continue;
                    }
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                    System.out.println("Kaydiniz olusturulmustur. Uygulamaya giris yapabilirsiniz ");
                    System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
                    emailsPass.put(email, password);
                    isAgain = true;
                    continue;
                } else {
                    System.err.println("Bu Email ile uye olusturulmus. Lutfen baska Email adresi kullanin!");
                    isAgain = true;
                    continue;
                }
            } else if (giris == 3) {
                System.out.println("Çıkış yapılıyor...");
                break;
            } else {
                System.err.println("Hatali giris! Lutfen tekrar deneyin.");
                isAgain = true;
                continue;
            }


        } while (isAgain);
    }


}
