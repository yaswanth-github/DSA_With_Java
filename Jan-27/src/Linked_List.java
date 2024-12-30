import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args) {
        LinkedList car = new LinkedList();
        car.add("BMW");
        car.add("Audi");
        car.add("Mercedes");
        car.add("Lamborghini");
        car.add("Ferrari");
        System.out.println(car);

        car.addFirst("Rolls Royce");
        System.out.println(car);

        LinkedList Student = new LinkedList();
        Student.add("Rahul");

        // offer is purly based on memory availability
        Student.offer("LPU"); // May or May not be added


    }

}
