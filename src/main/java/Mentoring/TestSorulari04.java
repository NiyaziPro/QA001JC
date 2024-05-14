package Mentoring;

public class TestSorulari04 {
    public static void main(String[] args) {
int bas = 5;
int bit = 3;
        int carpim = 1;
        int toplam = 0;
        if(bas<=bit) {
            for(int i=bas; i<=bit; i++) {
                toplam = toplam + i;
            }
        } else {
            for(int i=bas; i>=bit; i--) {
                carpim = carpim * i;
            }
        }
        System.out.print(carpim+ ",");
        System.out.println(toplam);



    }
}
