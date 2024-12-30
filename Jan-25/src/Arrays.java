public class Arrays {

    public static void main(String[] args){

        // Declaring an array
        int[] marks1;
        marks1 = new int[5];
        // or
        int[] marks2 = new int[5];

        // Initializing an array
        int[] marks3 = new int[] {89,91,78,62,80};

        // Declaring and Assign an Array

        int[] marks4 = new int[5];
        marks4[0]=89;
        marks4[1]=73;
        marks4[2]=91;
        marks4[3]=62;
        
        System.out.println("Array Marks3");
        for (int i=0; i < 5; i++){
            // System.out.println(marks1[i]);
            // System.out.println(marks2[i]);
            System.out.println(marks3[i]);
            // System.out.println(marks4[i]);
        }

        System.out.println("Array Marks4");

        for (int i : marks4){
            System.out.println(i);
        }

    }

}
