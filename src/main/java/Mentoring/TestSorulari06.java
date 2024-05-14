package Mentoring;

public class TestSorulari06 {
    public static void main(String[] args) {
        String s = "";
        for (Integer i = 120; i > 10; i--) {
            if (i % 4 == 0 && i % 6 == 0) {
                s = s + i + " ";
            }
        }
        System.out.println(s);
    }
}
