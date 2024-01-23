public class App {
    void show(){
        System.out.println("From show() in App.java");
    }

    void print(){
        System.out.println("From print() in App.java");
    }
    // public static void main(String[] args) {
    //     A obj = new A();
    //     obj.show(); // From show() in A
    //     obj.print(); // From print() in A
    // }
}

class A extends App
{
    void show(){
        System.out.println("From show() in A");
    }

    void print(){
        System.out.println("From print() in A");
    }

    public static void main(String[] args) {
        App obj = new App();
        obj.show();
        obj.print();
    }
}