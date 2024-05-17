package JavaPractice;

public class S12 extends S11{

    @Override
     public int fly(int a) {
        return super.fly(a);
    }

    public void go() {
        System.out.println("Good");
    }

    public static void main(String[] args) {
        S12 s = new S12();
        s.go();
    }

}
