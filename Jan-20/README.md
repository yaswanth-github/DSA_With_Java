## `super()` and `super(args)` in Java

In Java, the `super()` keyword is used to invoke the constructor of the superclass. It is typically used in the constructor of a subclass to call the constructor of its superclass.

The `super(args)` syntax is used when the superclass constructor requires arguments. By using `super(args)`, we can pass the required arguments to the superclass constructor.

Here are a few key points to remember:

- The `super()` statement must be the first statement in the constructor body.
- If the superclass has multiple constructors, we can choose which one to invoke by providing the appropriate arguments.
- If we don't explicitly call `super()` or `super(args)`, the compiler automatically inserts a call to the default constructor of the superclass.


Example usage:
```java
class Vehicle {
    String brand;

    Vehicle() {
        this.brand = "Unknown";
    }

    Vehicle(String brand) {
        this.brand = brand;
    }

    void display() {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    int year;

    Car(int year) {
        super(); // Invokes the default constructor of the superclass
        this.year = year;
    }

    Car(String brand, int year) {
        super(brand); // Invokes the parameterized constructor of the superclass
        this.year = year;
    }

    void display() {
        super.display(); // Calls the display() method of the superclass
        System.out.println("Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(2022);
        car1.display();

        Car car2 = new Car("Toyota", 2021);
        car2.display();
    }
}
```

## Polymorphism in Java

The word “poly” means many and “morphs” means forms, So it means many forms.

 * This class demonstrates polymorphism in Java.
 * Polymorphism is the ability of an object to take on many forms.
 * In Java, polymorphism is achieved through method overriding and method overloading.
 * Method overriding allows a subclass to provide a specific implementation of a method that is already defined in its superclass.
 * Method overloading allows multiple methods with the same name but different parameters to coexist in a class.
 
 In Java Polymorphism is mainly divided into two types:
- Compile-time Polymorphism
- Runtime Polymorphism

![Types of Polumorphism](lib/Types-of-poymorphism.png)

<h3>Compile-Time Polymorphism in Java</h3>
It is also known as static polymorphism. This type of polymorphism is achieved by function overloading or operator overloading. 

```Note: But Java doesn’t support the Operator Overloading.```

![OverridingVsOverloading](lib/OverridingVsOverloading.png)

<h4>Method Overloading</h4>

When there are multiple functions with the same name but different parameters then these functions are said to be overloaded. 

Functions can be overloaded by changes in the number of arguments or/and a change in the type of arguments.

```java
// Java Program for Method overloading
// By using Different Types of Arguments 
 
// Class 1
// Helper class
class Helper {
 
    // Method with 2 integer parameters
    static int Multiply(int a, int b)
    {
        // Returns product of integer numbers
        return a * b;
    }
 
    // Method 2
    // With same name but with 2 double parameters
    static double Multiply(double a, double b)
    {
        // Returns product of double numbers
        return a * b;
    }
}
 
// Class 2
// Main class
class GFG {
    // Main driver method
    public static void main(String[] args)
    {
        // Calling method by passing
        // input as in arguments
        System.out.println(Helper.Multiply(2, 4));
        System.out.println(Helper.Multiply(5.5, 6.3));
    }
}

OUTPUT
8
34.65
```

<h4>Subtypes of Compile-time Polymorphism</h4>

1. Function Overloading:
It is a feature in C++ where multiple functions can have the same name but with different parameter lists. The compiler will decide which function to call based on the number and types of arguments passed to the function.

2. Operator Overloading:
It is a feature in C++ where the operators such as +, -, *, etc. can be given additional meanings when applied to user-defined data types.

3. Template:
it is a powerful feature in C++ that allows us to write generic functions and classes. A template is a blueprint for creating a family of functions or classes.

<h3>Runtime Polymorphism in Java</h3>
It is also known as Dynamic Method Dispatch.

This type of polymorphism is achieved by Method Overriding.

```java
// Java Program for Method Overriding

// Class 1
// Helper class
class Parent {

	// Method of parent class
	void Print()
	{

		// Print statement
		System.out.println("parent class");
	}
}

// Class 2
// Helper class
class subclass1 extends Parent {

	// Method
	void Print() { System.out.println("subclass1"); }
}

// Class 3
// Helper class
class subclass2 extends Parent {

	// Method
	void Print()
	{

		// Print statement
		System.out.println("subclass2");
	}
}

// Class 4
// Main class
class GFG {

	// Main driver method
	public static void main(String[] args)
	{

		// Creating object of class 1
		Parent a;

		// Now we will be calling print methods
		// inside main() method

		a = new subclass1();
		a.Print();

		a = new subclass2();
		a.Print();
	}
}

OUTPUT

subclass1
subclass2
```

<h4>Subtype of Run-time Polymorphism</h4>

1. Virtual functions:
It allows an object of a derived class to behave as if it were an object of the base class. The derived class can override the virtual function of the base class to provide its own implementation. The function call is resolved at runtime, depending on the actual type of the object.
