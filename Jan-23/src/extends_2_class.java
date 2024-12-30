public class extends_2_class {
}

class B extends extends_2_class {
}

class C extends B {
    B hello() {
        System.out.println("NO");
        return this;
    }
}

class Main1 extends C {
    C hello() {
        System.out.println("hi");
        return this;

    }

    public static void main(String[] args) {
        C obj = new Main1();
        obj.hello();
    }
}
