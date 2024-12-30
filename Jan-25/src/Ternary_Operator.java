public class Ternary_Operator {
    public static void main(String[] args) throws Exception {
        boolean correct_password = true;

        // Using if-else
        if (correct_password){
            System.out.println("User Logged-in");
        }
        else{
            System.out.println("User Not Logged-in");
        }

        // Using Ternary Operator

        String result = (correct_password) ? "User Logged-in" : "User Not Logged-in";

        System.out.println(result);
    }
}
