public class Multi_Array {
    public static void main(String[] args) {
        int marks[][] = {
                { 89, 91, 78, 62, 80 },
                { 89, 91, 78, 62, 80 },
                { 89, 91, 78, 62, 80 },
                { 89, 91, 78, 62, 80 },
                { 89, 91, 78, 62, 80 }
        };

        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
