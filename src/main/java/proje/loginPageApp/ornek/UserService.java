package proje.loginPageApp.ornek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {

    static Scanner input = new Scanner(System.in);
    List<String> emails = new ArrayList<>();
    List<String> passwords = new ArrayList<>();

    // 3. ad soyad, email, sifre bilgilerini alip kayit edelim

    public void register() {
        System.out.println("Lutfen Ad-Soyad bilgisini giriniz : ");
        String name = input.nextLine();
        //4. email gecersiz ise  tekrar tekrar girmeli
        String email;
        boolean isValid;
        do {
            System.out.println("Lutfen email adresinizi giriniz : ");
            email = input.nextLine();
            isValid = validateEmail(email);
            if (emails.contains(email)) {
                System.out.println("Bu E-mail zaten kayitli. Lutfen baska bir email ile tekrar deneyiniz");
                isValid = false;
            }

        } while (!isValid);

        String password;
        boolean isValidPassword;
        do {
            System.out.println("Lutfen password'unuzu giriniz");
            password = input.nextLine();
            isValidPassword = validatePassword(password);
        } while (!isValidPassword);

        // 6 user olusturalim

        User user = new User(name, email, password);
        emails.add(user.getEmail());
        passwords.add(user.getPassword());
        System.out.println("Tebrikler. Kayit islemi basariyla gerceklesmistir.");
        System.out.println("Email ve sifreniz ile sisteme giris yapabilirsiniz.");


    }

    public void login() {
        System.out.println("Lutfen E-mail adresinizi giriniz :");
        String email = input.nextLine();
        boolean isExistEmail = emails.contains(email);
        if (isExistEmail) {
            //kullanicinin kaydi vardir sifreyi kontrol edelim
            int sayac = 3;
            while (sayac > 0) {
                System.out.println("Lutfen sifrenizi giriniz :");
                String pass = input.nextLine();
                //sifre ile email ayni indekstemi
                int index = emails.indexOf(email);
                if (passwords.get(index).equals(pass)) {
                    System.out.println("Sisteme basarili bir sekilde giris yaptiniz, Hosgeldiniz");
                    break;
                } else {
                    sayac--;
                    System.out.println("Sifrenizi yanlis ya da eksik girdiniz lutfen tekrar deneyiniz.Kalan giris hakkiniz : " + sayac);
                    if (sayac == 0) {
                        throw new passwordException("Deneme hakkiniz bitti 15 dakika sonra tekrar deneyiniz");
                    }
                }
            }
        } else {
            // kullanicinin kaydi yoktur tekrar denemesi gerek
            System.out.println("Sisteme kayitli bir kullanici bulunamadi.\nUyeyseniz bilgilerinizi kontrol ediniz \nDegilseniz uye olunuz");
        }


    }

    public boolean validateEmail(String email) { //Ahmet hoca
        boolean isValid=false;
        boolean space = email.contains(" ");
        boolean containsAt = email.contains("@");

        if (space){
            System.out.println("Email bosluk iceremez");
            isValid= false;
        }
        if (!containsAt){
            System.out.println("Email @ icermeli");
            isValid = false;
        }
        if (!space && containsAt){
            String firstPart = email.split("@")[0];
            String secondPart = email.split("@")[1];
            boolean notValidChar = firstPart.replaceAll("[a-zA-Z0-9-._]","").isEmpty();
            boolean checkSecond = secondPart.equals("gmail.com")||secondPart.equals("yahoo.com")||secondPart.equals("hotmail.com");
            if (!notValidChar){
                System.out.println("Email harf,rakam ve -_. sembolleri disinda karakter iceremez");
            }
            if(!checkSecond){
                System.out.println("Email gmail.com , hotmail.com veya yahoo.com ile bitmelidir");
            }
            isValid = notValidChar&&checkSecond;
            if (!isValid){
                System.out.println("Gecersiz Email!!!");
            }
        }


        return isValid;


    }

    public boolean validateEmail1(String email) {
        // ODEV !!!
        //email validation:
        // boşluk içermemeli
        // : @ içermeli
        // : gmail.com,hotmail.com veya yahoo.com ile bitmeli.
        // : mailin kullanıcı adı kısmında(@ den önce) sadece büyük-küçük harf,rakam yada -._ sembolleri olabilir.
        boolean isValid;
        if (email.contains("@")) {
            isValid = true;
        } else {
            isValid = false;
        }
        if (email.endsWith("gmail.com") || email.endsWith("hotmail.com") || email.endsWith("yahoo.com")) {
            isValid = true;
        } else {
            isValid = false;
        }
        if (email.split("@")[0].replaceAll("[A-Za-z0-9-_.]", "").isBlank()) {
            isValid = true;
        } else {
            isValid = false;
        }
        return isValid;
    }


    public boolean validatePassword1(String password) {
        //password validation
        //          : boşluk içermemeli
        //          : en az 6 karakter olmalı
        //          : en az bir tane küçük harf içermeli
        //          : en az bir tane büyük harf içermeli
        //          : en az bir tane rakam içermeli
        //          : en az bir tane sembol içermeli
        boolean isValid;
        if (!password.contains(" ")) {
            isValid = true;
        } else {
            System.err.println("Sifre bosluk icermemeli!");
            isValid = false;
        }
        if (password.length() > 5) {
            isValid = true;
        } else {
            System.err.println("Sifre en az 6 karakter olmali");
            isValid = false;
        }
        if (password.replaceAll("[^a-z]", "").length() > 0) {
            isValid = true;
        } else {
            System.err.println("Sifre en az bir tane küçük harf içermeli");
            isValid = false;
        }
        if (password.replaceAll("[^A-Z]", "").length() > 0) {
            isValid = true;
        } else {
            System.err.println("Sifre en az bir tane buyuk harf içermeli");
            isValid = false;
        }
        if (password.replaceAll("[^0-9]", "").length() > 0) {
            isValid = true;
        } else {
            System.err.println("Sifre en az bir tane rakam içermeli");
            isValid = false;
        }

        return isValid;
    }

    public boolean validatePassword(String password) {
        boolean isValid;
        boolean space = password.contains(" ");
        boolean length = password.length() > 5;
        boolean kucukHarf = password.replaceAll("^[a-z]", "").length() > 0;
        boolean buyukHarf = password.replaceAll("^[A-Z]", "").length() > 0;
        boolean rakam = password.replaceAll("^[0-9]", "").length() > 0;
        boolean sembol = password.replaceAll("[\\P{Punct}]", "").length() > 0;

        if (space) {
            System.out.println("password bosluk karakteri iceremez");
        }
        if (!length) {
            System.out.println("password en az 6 karakter olmalıdır");
        }
        if (!kucukHarf) {
            System.out.println("password en az 1 tane kucuk harf icermelidir");
        }
        if (!buyukHarf) {
            System.out.println("password en az 1 tane buyuk harf icermelidir");
        }
        if (!rakam) {
            System.out.println("password en az 1 tane rakam icermelidir");
        }
        if (!sembol) {
            System.out.println("password en az 1 tane sembol icermelidir");
        }

        isValid = !space && length && kucukHarf && buyukHarf && rakam && sembol;

        if (!isValid) {
            System.out.println("Lutfen gecerli bir sifre ile tekrar deneyiniz");
        }
        return isValid;

    }

    public boolean validateEmail2(String email) {
        // ODEV !!!
        //email validation:
        // boşluk içermemeli
        // : @ içermeli
        // : gmail.com,hotmail.com veya yahoo.com ile bitmeli.
        // : mailin kullanıcı adı kısmında(@ den önce) sadece büyük-küçük harf,rakam yada -._ sembolleri olabilir.
        boolean isValid;
        boolean space = email.contains(" ");
        boolean cont = email.contains("@");
        boolean endWith = email.endsWith("gmail.com") || email.endsWith("yahoo.com") || email.endsWith("hotmail.com");
        boolean username = email.split("@")[0].replaceAll("[A-Za-z0-9-_.]", "").isEmpty();

        if (space) {
            System.out.println("Email bosluk karakteri iceremez");
        }
        if (!cont) {
            System.out.println("Email @ icermeli");
        }
        if (!endWith) {
            System.out.println("Email gmail.com,hotmail.com veya yahoo.com ile bitmeli.");
        }
        if (!username) {
            System.out.println("Emailin kullanıcı adı kısmında(@ den önce) sadece büyük-küçük harf,rakam yada -._ sembolleri olabilir.");
        }
        isValid = !space && cont && endWith && username;

        if (!isValid) {
            System.out.println("Lutfen gecerli bir email ile tekrar deneyiniz");
        }
        return isValid;
    }


}