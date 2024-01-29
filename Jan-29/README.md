
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

