public class OPP {
    public static void main(String[] args) {
        System.out.println("Hello, World2!");

        ClassA classA = new ClassA();
        classA.methodA();

        ClassB classB = new ClassB();
        classB.methodB();
    }
}

class ClassA {
    void methodA() {
        System.out.println("This is method A from Class A");
    }
}

class ClassB {
    void methodB() {
        System.out.println("This is method B from Class B");
    }
}