package JavaPractice;

public class S13 {
    public static void main(String[] args) {

        int x = 5;
        int y = 6;

        System.out.println(multiply(x, y));
    }


    public static int multiply(int x, int y) {
        int C = 0;

        while (x > 0) {
            C = C + y;
            x = x - 1;
        }
        return C;
    }
}
