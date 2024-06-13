package proje.loginPageApp.ornek;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Runner {
    private static ArrayList<User> users = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    register();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
            }
        } while (choice != 3);
    }

    private static void showMenu() {
        System.out.println("\n--- Menü ---");
        System.out.println("1. Üye Ol");
        System.out.println("2. Giriş Yap");
        System.out.println("3. Çıkış");
        System.out.print("Seçiminiz: ");
    }

    private static void register() {
        System.out.print("Ad-Soyad: ");
        String fullName = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();
        if (!validateEmail(email)) {
            System.out.println("Geçersiz email formatı.");
            return;
        }

        if (isEmailTaken(email)) {
            System.out.println("Bu email ile zaten kayıt olunmuş.");
            return;
        }

        System.out.print("Şifre: ");
        String password = scanner.nextLine();
        if (!validatePassword(password)) {
            System.out.println("Geçersiz şifre formatı.");
            return;
        }

        users.add(new User(fullName, email, password));
        System.out.println("Kayıt başarılı.");
    }

    private static void login() {
        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Şifre: ");
        String password = scanner.nextLine();

        User user = findUserByEmail(email);
        if (user == null) {
            System.out.println("Bu email ile kayıtlı kullanıcı bulunamadı. Lütfen üye olun.");
        } else if (user.getPassword().equals(password)) {
            System.out.println("Giriş başarılı! Hoş geldiniz, " + user.toString());
        } else {
            System.out.println("Şifre yanlış.");
        }
    }

    private static boolean validateEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.(gmail\\.com|hotmail\\.com|yahoo\\.com)$";
        return Pattern.matches(emailRegex, email);
    }

    private static boolean validatePassword(String password) {
        if (password.length() < 6) return false;
        if (!password.matches(".*[a-z].*")) return false;
        if (!password.matches(".*[A-Z].*")) return false;
        if (!password.matches(".*\\d.*")) return false;
        if (!password.matches(".*[!@#$%^&*()_+=|<>?{}\\[\\]~-].*")) return false;
        return !password.contains(" ");
    }

    private static boolean isEmailTaken(String email) {
        for (User user : users) {
            if (user.getEmail().equalsIgnoreCase(email)) {
                return true;
            }
        }
        return false;
    }

    private static User findUserByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equalsIgnoreCase(email)) {
                return user;
            }
        }
        return null;
    }
}
