public class App {
    public static void main(String[] args) throws Exception {
        WIth_Out_main_method WOMM = new WIth_Out_main_method();
        System.out.println(WOMM);
    }
}

class WIth_Out_main_method{
    static{
        System.out.print("Form static method");
    }
}