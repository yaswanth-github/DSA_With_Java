public class Interface {

}

interface A{
    int a = 5;
    void show();
}

class Main implements A{
    int b =10;

    // a =15; // error: cannot assign a value to final variable a

    public void show(){
        System.out.println(a+" From Interface show() method");
    }

    void print(){
        System.out.println(b+" From Main print() method");
    }
    public static void main(String[] args) {
        Main obj = new Main();
        obj.show();
        obj.print();

        // System.out.println(obj.a);
        System.out.println(obj.b);

        System.out.println(A.a); // static variable can be accessed by interface name
        // System.out.println(A.b); // error: non-static variable b cannot be referenced from a static context
    }
    
}