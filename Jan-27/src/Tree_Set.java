import java.util.TreeSet;

public class Tree_Set {
    public static void main(String[] args) {
        TreeSet car = new TreeSet();
        car.add("BMW");
        car.add("Audi");
        car.add("Mercedes");
        car.add("Lamborghini");
        car.add("Ferrari");

        // Sorting Order(Ascending) 
        System.out.println(car);

        System.out.println(car.contains("BMW")); // returns true if check is present in ts

        TreeSet num = new TreeSet();
        num.add(21);
        num.add(12);
        num.add(23);
        num.add(14);
        num.add(05);

        // Sorting Order(Ascending)
        System.out.println(num);

        // Sorting Order(Descending)
        System.out.println(num.descendingSet());

        // Returns the first element
        System.out.println(num.first());

        // Returns the last element
        System.out.println(num.last());

        // Returns the element which is less than or equal to the given element
        System.out.println(num.floor(13));

        // Returns the element which is greater than or equal to the given element
        System.out.println(num.ceiling(13));

        // Returns the element which is less than the given element
        System.out.println(num.lower(13));

        // Returns the element which is greater than the given element
        System.out.println(num.higher(13));

        // Returns the element which is greater than the given element
        System.out.println(num.pollFirst());

        // Returns the element which is less than the given element
        System.out.println(num.pollLast());

    
    }

}
