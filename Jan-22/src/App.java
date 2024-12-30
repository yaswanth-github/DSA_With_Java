public class App {
    int a;
    static int b = 5;

    float c(){
        System.out.println("This is c method");
        return 4.44f;
    }

    void d(){
        System.out.println("This is d method");
    }
    static int inherited(){
        System.out.println("This is inherited method");
        return 0;
    }

    public static void main(String[] args) throws Exception {
        App obj = new App();
        obj.a = 5;
        // obj.b = 6;  // static variable can be accessed by object
        System.out.println(obj.a); 
        // System.out.println(obj.b); 
        obj.c();
        System.out.println(obj.c()); // static variable can be accessed by object

        System.out.println(b); // static variable can be accessed by class name
        System.out.println(inherited());  // static method can be accessed by class name
    }
}

class B extends App{
    // over riding class d
    void d(){
        System.out.println("This is d method from B");
    }

    // over riding class static inherited
    static int inherited(){
        System.out.println("This is inherited method from B");
        return 0;
    } // but static method can not be over ridden

    public static void main(String[] args) throws Exception {
        B obj = new B(); 
        // System.out.println(obj.b); 
        System.out.println(b);
        obj.d();
        obj.c();
        // obj.inherited();
    }
}