import java.util.ArrayList;
import java.util.ListIterator;

public class List_Iterator {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("Apple");
        al.add("Banana");
        al.add("Orange");
        al.add("Mango");

        System.out.println("*********** Normal Direction *********** ");
        System.out.println(al);

        System.out.println("*********** Back Direction *********** ");

        ListIterator litr = al.listIterator(al.size());

        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }

    }
    
}

class List_Iterator_2 {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(29);
        al.add(33);
        al.add(100);
        al.add(10);
        al.add(63);

        System.out.println("*********** Normal Direction *********** ");
        System.out.println(al);

        System.out.println("*********** Back Direction *********** ");

        ListIterator litr = al.listIterator(al.size());

        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }

        System.out.println("*********** Next Direction *********** ");
        ListIterator litr2 = al.listIterator(al.size());

        while(litr.hasNext()){
            System.out.println(litr.next());
        }

    }
    
}