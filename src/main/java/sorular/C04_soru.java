package sorular;

import java.util.Scanner;

public class C04_soru {
    public static void main(String[] args) {
        // Toplama, Çıkarma, Çarpma, Bölme ve kalan Hesaplama
        // yapan basit bir Hesap Makinesi oluşturun:

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen islem yapmak istediginiz operatoru giriniz :\n+,*,-,/,%");
        char operator = input.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Lutfen islem yapmak istediginiz sayilari giriniz :");
                System.out.println("Sayilarin toplami : " + (input.nextDouble() + input.nextDouble()));
                break;
            case '*':
                System.out.println("Lutfen islem yapmak istediginiz sayilari giriniz :");
                System.out.println("Sayilarin carpimi : " + input.nextDouble() * input.nextDouble());
                break;
            case '-':
                System.out.println("Lutfen islem yapmak istediginiz sayilari giriniz :");
                System.out.println("Sayilarin farki : " + (input.nextDouble() - input.nextDouble()));
                break;
            case '/':
                System.out.println("Lutfen islem yapmak istediginiz sayilari giriniz :");
                double sayi1 = input.nextDouble();
                double sayi2 = input.nextDouble();
                if (sayi2 == 0) {
                    System.out.println("Payda 0 olamaz!");
                } else {
                    System.out.println("Sayilarin bolumu : " + sayi1 / sayi2);
                }
                break;
            case '%':
                System.out.println("Lutfen islem yapmak istediginiz sayilari giriniz :");
                System.out.println("Sayilarin bolumunden kalan : " + input.nextDouble() % input.nextDouble());
                break;
            default:
                System.out.println("Lutfen gecerli bir operator giriniz!");

        }


        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете първото число :");
        double num1 = scanner.nextDouble();
        System.out.println("Въведете второто число :");
        double num2 = scanner.nextDouble();
        System.out.println("Изберете операция ( + , - , * , / ) :");
        char operator = scanner.next().charAt(0);
        double result;

        switch (operator){
            case '+' :
                result = num1+num2;
                System.out.println("Резултат : "+result);
                break;
            case '-' :
                result = num1-num2;
                System.out.println("Резултат : "+result);
                break;
            case '*' :
                result = num1*num2;
                System.out.println("Резултат : "+result);
                break;
            case '/' :
                if (num2!=0){
                    result = num1/num2;
                    System.out.println("Резултат : "+result);
                } else {
                    System.out.println("Грешка : деление на нула !");
                }
                break;
            default:
                System.out.println("Грешка : невалиден оператор !");
                break;

        }scanner.close();
         */
    }
}
