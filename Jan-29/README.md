## TreeSet

TreeSet is one of the most important implementations of the SortedSet interface in Java.

- Dupicates are not alllowed
- Index based assueing is not allowed
- It followes Binary tree search

```java
TreeSet ts = new TreeSet(); 
```

Example:
```java
TreeSet ts = new TreeSet();

ts.add(100);
ts.add(90);
ts.add(50);
ts.add(70);
ts.add(60);
ts.add(80);

System.out.println(ts);

// output: [50,60,70,80,90,100]
```

## HashSet And LinkedHashSet

These two class implements set interface

HashSet Syntex:
```java
import java.util.HashSet;

HashSet<String> set = new HashSet<>();

// Adding elements to the HashSet
set.add("Apple");
set.add("Banana");
set.add("Orange");
set.add("Mango");

// Printing the HashSet
System.out.println(set);
```

## For-each loop in Java

- It starts with the keyword for like a normal for-loop.
- In the loop body, you can use the loop variable you created rather than using an indexed array element. 
- It’s commonly used to iterate over an array or a Collections class (eg, ArrayList)

Syntax: 
```java
for (type var : array) 
{ 
    statements using var;
}
```

Example:
```java
int ar[] = { 10, 50, 60, 80, 90 }; 
  
for (int element : ar) {

    System.out.print(element + " "); 
}
```

## Legacy Classes

### Vector
Vector == ArrayList

- Vector is a special type of ArrayList that defines a dynamic array
- ArrayList is not sync while Vector is sync

## HashMap

HashMap is a class in Java that implements the Map interface. It is used to store key-value pairs, where each key is unique. Here are some key points about HashMap:

- It does not maintain any order of the elements.
- It allows null values for both keys and values.
- It provides constant-time performance for basic operations like get and put.

Example:
```java
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a new HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the HashMap
        map.put("John", 25);
        map.put("Jane", 30);
        map.put("Mike", 35);

        // Access values using keys
        int johnAge = map.get("John");
        System.out.println("John's age: " + johnAge);

        // Update a value
        map.put("Jane", 31);

        // Remove a key-value pair
        map.remove("Mike");

        // Iterate over the HashMap
        for (String name : map.keySet()) {
            int age = map.get(name);
            System.out.println(name + "'s age: " + age);
        }
    }
}
```
## LinkedHashmap



## BufferedInputStream




