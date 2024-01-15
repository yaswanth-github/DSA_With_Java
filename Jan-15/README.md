# Java Variables Overview

In Java, a **variable** is the data container that saves values during Java program execution.

## Instance Variable

Instance variables are stored in the heap area. They are declared in the main class but not within any specific method. These variables can be accessed using an object or object reference.


## Class Variable

Class variables are stored in the method area. They are declared in the class using the static keyword but not within the main method. Class variables can be accessed directly, using the class name, or through an object or object reference.

## Local Variable

Local variables are stored in the stack area. They are declared within a specific method, such as the main method, and can be accessed directly within that method.

# Taking Input from User in Java

In Java, you can take input from the user using the `Scanner` class, which is part of the `java.util` package. Here's a step-by-step guide:

<h3>1. Import the Scanner class</h3>

First, you need to import the `Scanner` class at the beginning of your Java file:

```
import java.util.Scanner;
````



<h3>2. Create a Scanner Object </h3>
create a Scanner object to read input from the user. You can do this in your main method or any other method where you want to take input.

```
Scanner scanner = new Scanner(System.in);
```


<h3>3. Read Input</h3>
Use the Scanner methods to read different types of input. Here are a few examples:

<h4>Reading Integer:</h4>

```
System.out.print("Enter an integer: ");
int num = scanner.nextInt();
System.out.println("You entered: " + num);
```

<h4>Reading Double:</h4>

```
System.out.print("Enter a double: ");
double num = scanner.nextDouble();
System.out.println("You entered: " + num);
```
<h4>Reading String:</h4>

```
System.out.print("Enter a string: ");
String input = scanner.nextLine();
System.out.println("You entered: " + input);
```

<h4>Close the Scanner:</h4>

```
scanner.close();
```

# For Loop in Java

In Java, the `for` loop is used to iterate over a sequence of elements. It is especially useful when the number of iterations is known beforehand.

The basic syntax of a `for` loop is as follows:

```
for (initialization; condition; update) {
    // code to be executed in each iteration
}
```

* Initialization: This is where you initialize the loop control variable.
* Condition: The loop continues to execute as long as this condition is true.
* Update: The loop control variable is updated after each iteration.

Let's go through a simple example that prints numbers from 1 to 5 using a for loop:

```
public class ForLoopExample {
    public static void main(String[] args) {
        // Using a for loop to print numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
```

## Nested For Loops:

You can also use nested for loops to create more complex patterns or iterate over two-dimensional arrays.

```
public class NestedForLoopExample {
    public static void main(String[] args) {
        // Using nested for loops to print a simple pattern
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
```