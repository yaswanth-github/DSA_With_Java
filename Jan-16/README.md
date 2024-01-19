## Access Modifiers in Java

Access modifiers in Java are keywords that determine the accessibility or visibility of classes, methods, variables, and constructors in Java programs.

![Access Modifiers in Java](https://media.geeksforgeeks.org/wp-content/uploads/20230409123202/Access-Modifiers-in-Java-2.webp)

**There are four types of access modifiers in Java:**

1. **Public**: The public access modifier allows unrestricted access to the class, method, variable, or constructor from any other class or package.

2. **Private**: The private access modifier restricts access to the class, method, variable, or constructor within the same class. It is not accessible from any other class or package.

3. **Protected**: The protected access modifier allows access to the class, method, variable, or constructor within the same class, subclasses, and same package. It is not accessible from other packages.

4. **Default**: If no access modifier is specified, it is considered as the default access modifier. The default access modifier allows access to the class, method, variable, or constructor within the same class and same package. It is not accessible from other packages.

Access modifiers can be applied to classes, methods, variables, and constructors. They provide control over the visibility and accessibility of these elements, ensuring encapsulation and data hiding in Java programs.

## Operators in Java

### Arithmetic Operators

Arithmetic operators are used to perform mathematical operations such as addition, subtraction, multiplication, division, and modulus.

### Unary Operators

Unary operators are used to perform operations on a single operand. Examples include increment (++), decrement (--), and logical complement (!).

### Assignment Operator

The assignment operator (=) is used to assign a value to a variable.

### Relational Operators

Relational operators are used to compare two values and return a boolean result. Examples include equal to (==), not equal to (!=), greater than (>), less than (<), greater than or equal to (>=), and less than or equal to (<=).

### Logical Operators

Logical operators are used to perform logical operations on boolean values. Examples include logical AND (&&), logical OR (||), and logical NOT (!).

### Ternary Operator

The ternary operator (?:) is a shorthand way of writing an if-else statement. It takes three operands and returns a value based on a condition.

### Bitwise Operators

Bitwise operators are used to perform operations on individual bits of a value. Examples include bitwise AND (&), bitwise OR (|), bitwise XOR (^), bitwise complement (~), left shift (<<), right shift (>>), and unsigned right shift (>>>).

### Shift Operators

Shift operators are used to shift the bits of a value to the left or right. Examples include left shift (<<) and right shift (>>).

### instanceof Operator

The instanceof operator is used to check if an object is an instance of a particular class or interface.


## Loops in Java

Loops in Java are used to repeatedly execute a block of code until a certain condition is met. There are three types of loops in Java:

### for loop
The for loop is used when the number of iterations is known beforehand. It consists of an initialization, a condition, and an increment/decrement statement.

Syntax:
```java
for(initialization; condition; increment/decrement){    
//statement or code to be executed    
}    
```

Example Program :
```java
public class ForExample {  
public static void main(String[] args) {  
    //Code of Java for loop  
    for(int i=1;i<=10;i=i+1){  
        System.out.println(i);  
    } 
}  
}  
```


### while loop:
The while loop is used when the number of iterations is not known beforehand, but a condition needs to be checked before each iteration.
Syntax :
```java
while (boolean condition)
{
    statements...
    incr/decr;
}
```
Example Program :
```java
public class WhileExample {  
public static void main(String[] args) {  
    int i=10;  
    while(i>=1){  
        System.out.println(i);  
    i = i-1;  
    }  
}  
} 
```

### do-while loop:
The do-while loop is similar to the while loop, but the condition is checked after each iteration. This guarantees that the loop will execute at least once.

Syntax:
```java
do{    

//code to be executed / loop body  
//update statement 

}while (condition);    

```

Example Program :
```java
public class DoWhileExample {    
public static void main(String[] args) {    
    int i=1;    
    do{    
        System.out.println(i);    
    i++;    
    }while(i<=10);    
}  
}   
```
 
### Switch Case

The switch case statement in Java is used to execute different blocks of code based on the value of a variable or an expression. It provides an alternative to using multiple if-else statements.

The syntax of the switch case statement is as follows:
```java
switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
}
```
Example:
```java
int day = 4;
switch (day) {
  case 6:
    System.out.println("Today is Saturday");
    break;
  case 7:
    System.out.println("Today is Sunday");
    break;
  default:
    System.out.println("Looking forward to the Weekend");
}
// Outputs "Looking forward to the Weekend"
```

### If-Else Statements

If-else statements in Java are used to make decisions based on certain conditions. They allow the program to execute different blocks of code depending on whether a condition is true or false.

The syntax of an if-else statement is as follows:
```java
if (condition) {
  // block of code to be executed if the condition is true
} 

else {
  // block of code to be executed if the condition is false
}
```
Example:
```java
int time = 20;

if (time < 18) {
  System.out.println("Good day.");
} 

else {
  System.out.println("Good evening.");
}
// Outputs "Good evening."
```


