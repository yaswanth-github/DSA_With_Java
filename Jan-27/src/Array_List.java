import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) throws Exception {
        ArrayList car = new ArrayList();
        car.add("BMW");
        car.add("Audi");
        car.add("Mercedes");
        car.add("Lamborghini");
        car.add("Ferrari");
        
        System.out.println(car);

        // ArrayList is Hetetogeneous Type
        ArrayList Student = new ArrayList<>();
        Student.add("Rahul");
        Student.add("LPU");
        Student.add(20);
        Student.add(5.8);
        Student.add('M');
        Student.ensureCapacity(510);
        System.out.println(Student);
        System.out.println(Student.size());
        Student.trimToSize(); // Used to trim the size of ArrayList
        }
}
