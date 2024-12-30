## Interface Class in Java

An interface in Java is a blueprint of a class. It defines a set of methods that a class must implement. It provides a way to achieve abstraction and multiple inheritance in Java.

Interfaces are introduced in Java to provide a way to achieve abstraction and `multiple inheritance`.

Examples:

```java
// Multiple Inheritance
class A{};
class B{};
interface C{};
interface D{};

class Main extends A{}; // Vaild


```



interfaces in Java provide a way to achieve abstraction and multiple inheritance, allowing for more flexible and modular code design.


### Syntax
```java
public interface InterfaceName {
    // Method declarations
}
```

## Connection
 * Represents a connection to a database.
 * This class provides methods to establish, manage, and close the connection.

Syntex

```java
public class Connection {
    // code implementation goes here
}
```

Example:

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "password";

        System.out.println("Connecting to database...");

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Database connected!");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect to the database!", e);
        }
    }
}
```

If gets any error:

- Click on Java Projects in the explorer tab on the left-hand side in VSCode. 
- Then right-click on your project name and click on Configure Classpath. this will open Classpath Configuration in a new tab. 
- Scroll to the bottom and then click add on the referenced libraries. 
- This will open an explorer pop-up window. 
- Select the java-mysql connector jar file and then it should work.

## Encapsulation

Encapsulation in java is a process of wrapping code(methods)and data(variables) together into a single unit like a capsule.

Binding of variables and methods into a single unit and
 those methods(getters and setters) are operating on the same variables.

Encapsulation is a principle in object-oriented programming that bundles data and methods together within a class, and controls access to the data through getter and setter methods.

To perform encapsulation there are some rules we need to follow :

1. in a specific class(Java Bean), the variables declared must be private.

2. To access those private variables we need getter and setter methods 
that must be declared as public.

The `java bean` class is the example of fully encapsulated class.  

setter method is used for setting the value of private variable. `public void setA()`

getter method is used for getting/returning the value of private variable. `public void getA()`

`Note : The setters and getters are used only for 
accessing the private data or variables outside another class.`

Application of Encapsulation :
Encapsulation is used for data(variables) hiding.

```java
class Employee //java bean
{
	private int age;
                   
	
	public void setAge(int age) //setter method
	{
		if(age>100)
		{
			this.age = 100;
		}
		else if(age<0)
		{
			this.age = 0;
		}
		else
		{
			this.age = age;
		}
	}
	
	public int getAge()
	{
		return age;
	}
}

class Main 
{
	public static void main(String[] args)
	{
		Employee obj = new Employee();
	
		obj.setAge(20);
		
		int x = obj.getAge();
		
		System.out.println("The age of employee is : "+x);
		
	}
}
```