package abc;
import cd.B;

public class A {
    int a = 10;
    private static int b = 20;

    public int getA() {
        return a;
    }
    public static int getB() {
        return b;
    }

    public static void main(String[] args) {
        B obj = new B();

        System.out.println("From Package bcd c = "+obj.getC());
        System.out.println("From Package bcd d = "+B.getD());
    }

}
