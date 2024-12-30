import java.util.Scanner;

public class Check_Parenthesis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Parenthesis = input.nextLine();

        int count = 0;

        for (int i = 0; i < Parenthesis.length(); i++ ){
            if (count < 0){
                System.out.println("Un Balanced");
                break;
            }

            if (Parenthesis.charAt(0) == '}'){
                System.out.println("Un Balanced");
                break;
            }
    
            if (Parenthesis.isEmpty()){
                System.out.println("Sting is Empty");
                break;
            }

            if (Parenthesis.charAt(i) == '{'){
                count ++;
            }
            else{
                count --;
            }

            if (count == 0){
                System.out.println("Balanced");
                break;
            }
            else{
                System.out.println("Un Balanced");
                break;
            }
        }

        

    }
}


