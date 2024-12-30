# [Strings](https://www.geeksforgeeks.org/strings-in-java/)
Strings in Java are objects that represent sequences of characters. The java.lang.String class is used to create a string object.

### Creating Strings
There are two ways to create String in Java:

```java
String Literal: String s = "Hello";
```

Using new keyword:
```java
String s = new String("Hello");
```
String Methods

Java provides several methods to perform operations on strings such as compare(), concat(), equals(), split(), length(), replace(), compareTo(), intern(), substring() etc.

String Immutability

In Java, string objects are immutable, which means once a String object is created, it cannot be changed. If you try to change it, a new object is created.

String Pool

Java has a special memory region called "String Pool". When a string is created and if the string already exists in the pool, the reference of the existing string will be returned, instead of creating a new object.

```java
// Java program and visualize the
// actual JVM memory structure
// mentioned in image
class StringStorage {
    public static void main(String args[])
    {
        // Declaring Strings
        String s1 = "TAT";
        String s2 = "TAT";
        String s3 = new String("TAT");
        String s4 = new String("TAT");
 
        // Printing all the Strings
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
```
![String Heap Area](https://media.geeksforgeeks.org/wp-content/uploads/20230323181532/String-in-Java-2-768.png)

String Comparison

In Java, string comparison can be done by using equals() method and == operator. equals() method compares the actual content of the string, == operator compares the references.

String Conversion

Strings can be converted to new data types and vice versa. For example, Integer.parseInt("123") converts a string to an integer.

StringBuilder and StringBuffer

Java provides StringBuilder and StringBuffer classes for creating mutable strings. StringBuilder is faster and preferred over StringBuffer for single-threaded program, as StringBuffer is thread safe.


