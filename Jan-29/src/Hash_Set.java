import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hash_Set {
    public static void main(String[] args) throws Exception {

        HashSet<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Mango");

        // Printing the HashSet
        System.out.println(set);

        // Removing items from HashSet using remove()
        set.remove("Apple");
        System.out.println("Set after removing = " + set);
    }

}

class Linked_Hash_Set {
    public static void main(String[] args) throws Exception {

        HashSet<String> set = new LinkedHashSet<>();

        // Adding elements to the HashSet
        set.add("100");
        set.add("110");
        set.add("10");
        set.add("9");

        // Printing the HashSet
        System.out.println(set);
    }

}
