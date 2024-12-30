## Abstract Classes in Java

An abstract class in Java is a class that cannot be instantiated. It serves as a blueprint for other classes and is meant to be extended by subclasses. Abstract classes can contain both abstract and non-abstract methods.



### Key Points about Abstract Classes:

- An abstract class is declared using the `abstract` keyword.
- Abstract classes cannot be instantiated, meaning you cannot create objects of an abstract class.
- Abstract classes can have constructors, instance variables, and concrete methods.
- Abstract methods are declared without a body and are meant to be implemented by the subclasses.
- Subclasses of an abstract class must either implement all the abstract methods or be declared as abstract themselves.
- Abstract classes can have non-abstract methods, which are inherited by the subclasses.
- Abstract classes can be used to achieve abstraction and provide a common interface for a group of related classes.

Abstract methods cannot be final, static and private

### Example:
```java
abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public void displayColor() {
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);

        circle.displayColor();
        System.out.println("Circle Area: " + circle.getArea());

        rectangle.displayColor();
        System.out.println("Rectangle Area: " + rectangle.getArea());
    }
}

```
