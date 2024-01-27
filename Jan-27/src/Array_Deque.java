import java.util.ArrayDeque;

public class Array_Deque {
    public static void main(String[] args) {
        ArrayDeque car = new ArrayDeque();
        car.add("BMW");
        car.add("Audi");
        car.add("Mercedes");
        car.add("Lamborghini");
        car.add("Ferrari");
        System.out.println(car);

        car.addFirst("Rolls Royce");
        System.out.println(car);

        ArrayDeque Student = new ArrayDeque();
        Student.add("Rahul");
        
        // offer is purly based on memory availability
        Student.offer("LPU"); // May or May not be added

        System.out.println(Student);
    }

}
