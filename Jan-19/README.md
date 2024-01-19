## The "this" Keyword in Java

In Java, the "this" keyword is a reference to the current object within a class.
It is used to refer to the instance variables and methods of the current object.

### Usage of "this" Keyword

1. To differentiate between instance variables and local variables that have the same name:

   ```java
   public class MyClass {
       private int x;

       public void setX(int x) {
           this.x = x; // "this" refers to the instance variable
       }
   }
   ```

2. To invoke one constructor from another constructor in the same class:

   ```java
   public class MyClass {
       private int x;
       private int y;

       public MyClass(int x) {
           this.x = x;
       }

       public MyClass(int x, int y) {
           this(x); // invoking the constructor with one parameter
           this.y = y;
       }
   }
   ```

3. To pass the current object as an argument to a method or constructor:

   ```java
   public class MyClass {
       private int x;

       public void doSomething() {
           AnotherClass obj = new AnotherClass();
           obj.method(this); // passing the current object as an argument
       }
   }
   ```


## The "this(args)" and "this()" in Java

In Java, the "this(args)" and "this()" are used to invoke constructors within a class. However, they have some differences in their usage.

### "this(args)"

The "this(args)" is used to invoke a constructor with arguments from another constructor in the same class. It allows you to reuse the code of one constructor in another constructor.

Syntex:
```java
public ClassName(arguments) {
    this(arguments); // invoking the constructor with arguments
}
```
Example:
```java
public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(int side) {
        this(side, side); // invoking the constructor with two arguments
    }
}
```

### Conclusion

The "this" keyword is a powerful tool in Java that allows you to refer to the current object and access its members. It is particularly useful in scenarios where there is a need to differentiate between instance variables and local variables or when invoking one constructor from another.