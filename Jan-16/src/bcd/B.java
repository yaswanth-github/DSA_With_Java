package bcd;
import abc.A;

public class B {
    int c = 30;
    private static int d = 40;

    public int getC() {
        return c;
    }

    public static int getD() {
        return d;
    }
    
    public static void main(String[] args) {
        A obj = new A();
        
        System.out.println("From Package abc a = "+obj.getA());
        System.out.println("From Package abc b = "+A.getB());

    }
}
