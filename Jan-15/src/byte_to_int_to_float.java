public class byte_to_int_to_float {
    public static void main(String[] args){

        // Gives Complication Error
        //byte a = 3222;

        byte a = (byte)3222;
        int b = a;

        System.out.println("byte a = (byte)3222 = " + a);
        System.out.println("int b = a = " + b);
        
        float c = b;
        System.out.println("float c = b = " + c);

    }
}
