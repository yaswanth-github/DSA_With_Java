class M2 {
    int x = 5;

    // constrater show() is created

    void show(){
        int x = 10;
        // Prints x from local varable where x = 10
        System.out.println(x);
        System.out.println(x);

        // Prints x from main class where x = 5
        System.err.println(this.x);
    }
    public static void main(String[] args) {
        // creates object d in M2 Class
        M2 d = new M2();
        d.show();
    }
}
