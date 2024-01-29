# DSA In Java

![Java Collection Framework Hierarchy](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20200811210521/Collection-Framework-1.png)

## Framework
A framework is a reusable software infrastructure that provides a set of pre-defined classes and functions to simplify the development of applications.

It offers a structured way to build applications by providing ready-made components, libraries, and tools.

Frameworks in Java help developers save time and effort by handling common tasks, such as database access, user interface design, and network communication. Some popular Java frameworks include Spring, Hibernate, and JavaFX.

## List


1. ArrayList
2. LinkedList
3. ArrayDeque
4. Vector
5. Stack



## ArrayList

- ArrayList is resizable `Array` 

- ArrayList is `Hetetogeneous Type` (Any type of data can be stroed)

- It also index appeoach

- The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified. 

- While elements can be added and removed from an ArrayList whenever you want.

The syntax is also slightly different:
```java
import java.util.ArrayList; // import the ArrayList class

ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
```

Example:
```java
ArrayList Student = new ArrayList<>();
        Student.add("Rahul");
        Student.add("LPU");
        Student.add(20);
        Student.add(5.8);
        Student.add('M');

        System.out.println(Student);
```

Access an Element from Array List, use the get():
```java
Student.get(0); //0=Index
```

To modify an element, use the set():
```java
Student.set(0,"Ram");
//    0=Index, New Name or element
```
 
 To remove an element, use the remove():
 ```java
 Student.remove(0); //0=Index
 ```

 TO remove all elements for ArrayList, use the clear();
 ```java
 Student.clear();
 ```

## LinkedList

The LinkedList class is almost identical to the ArrayList.

The LinkedList stores its items in "containers."

The LinkedList class is a collection which can contain many objects of the same type, just like the ArrayList.

Syntax:
```java
import java.util.LinkedList; // import the ArrayList class

LinkedList<String> cars = new LinkedList<String>(); // Create an LinkedList object
```

Example:
```java
// Import the LinkedList class
import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
  }
}
```
#### LinkedList Methods
For many cases, the ArrayList is more efficient as it is common to need access to random items in the list, but the LinkedList provides several methods to do certain operations more efficiently:

Method	Description	Try it
- addFirst()	Adds an item to the beginning of the list.	
- addLast()	Add an item to the end of the list	
- removeFirst()	Remove an item from the beginning of the list.	
- removeLast()	Remove an item from the end of the list	
- getFirst()	Get the item at the beginning of the list	
- getLast()	Get the item at the end of the list

## ArrayDeque

It provides a way to apply resizable-array

It is also known as Array Double Ended Queue or Array Deck.

This is a special kind of array that grows and allows users to add or remove an element from both sides of the queue.

- ArrayDeque is a class which implements Deque Interface
- Deque is a double ended queue
- ArrayDeque is a class
- Deque is an interface which extends Queue interface
- Queue is an interface which extends Collection interface
- Collection is an interface which extends Iterable interface
- Iterable is an interface which extends Iterator interface


Example:
```java
import java.util.ArrayDeque;
import java.util.Deque;
 
public class Example {
  public static void main(String[] args) {
    Deque<Integer> deque = new ArrayDeque<>();
    deque.addFirst(1);
    deque.addLast(2);
    int first = deque.removeFirst();
    int last = deque.removeLast();
    System.out.println("First: " + first + ", Last: " + last);
  }
}
```

## Queue

### PriorityQueue

- min heap data structure
- Dupicates are alllowed

```java
Queue car = new PriorityQueue();
car.add("Elements...")
```
