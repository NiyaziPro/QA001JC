package day04increment_decrement_if;

public class IncrementDecrement {
    public static void main(String[] args) {
        // Increment
        int a = 5;
        a = a + 2; // a iki defa yazilmistir ve bir tekrar soz konusu
        System.out.println(a);  // 7
        a += 2; // a= a+2
        System.out.println(a); // 9

        // Decrement
        int c = 10;
        c = c - 3;
        System.out.println(c); // 7
        c -= 4; // c=c-4;
        System.out.println(c); // 3

        // Carpma
        int d = 7;
        d = d * 2;
        System.out.println(d); // 14
        d *= 2;
        System.out.println(d); //28

        // Bolme
        int e = 24;
        e = e / 2;
        System.out.println(e); // 12
        e /= 2;
        System.out.println(e); // 6

        // 1 ile increment
        int f = 13;
        f = f + 1;  // +1
        f += 1;   // +1
        f++;    // +1
        System.out.println(f);  // 16

        // 1 ile decrement

        int j = 19;
        j = j - 1;  // -1
        j -= 1;    // -1
        j--;     // -1
        System.out.println(j); // 16

        // Post-Increment (i++) , pre-increment (++i)

        int i = 10;
        int k = i++;
        System.out.println(k); // 10
        System.out.println(i); // 11

        int m = 20;
        int n = ++m;
        System.out.println(n);  // 21
        System.out.println(m);  // 21


        // post-decrement(i--) , pre-decrement(--i)
        int p = 17;
        int r = p--;
        System.out.println(r);  // 17
        System.out.println(p);  // 16

        int s = 20;
        int t = --s;
        System.out.println(s);  // 19
        System.out.println(t);  // 19


    }

}
