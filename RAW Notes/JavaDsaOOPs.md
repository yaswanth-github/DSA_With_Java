




Methods :
-------

A Group of statements in to single logical unit is called as method. 

Methods are used to perform the task.

```java
    main()
   {
    abc();
    abc();
    abc();
    abc();
    abc();

}


  void abc()
   {

       System.out.println("Hello!");
       System.out.println("Welcome!");
       System.out.println("To Java!");

    }


```


   Syntax :
==========

            Access Modifier ReturnType methodName(Method Arguments or Parameters)
            {

               int c = a+b;
                 


           }

     main()
    {
           int a = 10;
           int b = 12;
            int d  = abc(a,b);
            System.out.println(d);
     }

-> Return type can be of primitive or referenced datatype.

-> MethodName -> From second word onwards, 1st letter should be capital and it cannot be a keyword.

-> return statement is optional, if the return type is there than only you should use return statement

-> void is also called as return type but it returns nothing, so when the method returns nothing, then i will use void.

Benefits of methods :

1.)Modularity. ==> dividing into parts

2.)Reusability.==> specific method i will use it again and again.


In java , there exists Two types of methods same like variables :

1.) Instance methods (i can call it through by using object or object reference)

2.) Class Methods or static methods (i can call it through by using directly,classname,object,and objref)



In java, Methods are divided into 4 categories :

1.Methods with arguments and with return value

class A
{

  int addMethod(int a, int b)
 {

    int c = a+b;
    return c; 
 }

  public static void main(String[] args)
  {
     int d = new A().addMethod(12,235);

   Sysout(d);

  }
}
      

 



2.Methods with arguments and without return value

class A
{

  void addMethod(int a, int b)
 {

    int c = a+b;

 }

  public static void main(String[] args)
  {
     int d = new A().addMethod(12,235);

   Sysout(d);

  }
}
      

 







3.Methods without arguements and with return value


class A
{

   int addMethod()
 {

    int c = a+b;
    return c;

 }

  public static void main(String[] args)
  {
     int d = new A().addMethod(12,235);

   Sysout(d);

  }
}
      

 









4.Methods without arguments and without return value
--------------------------------------------------------------------




Syntax :

      Access specifier static return type methodName(arguments or parameters)
       {
            
             //method body
           
             //return statement( if return type is not void)

          }



   String methodName(arguments or parameters)
   {

      method body

     return statement;
   }

 return type can be primitive or referenced types => return statement should be there.

 Another special return type : void(it returns nothing)




       
  class Demo //Without class i cannot create an application
  {

     int addElements(int[] a)
     {

       int total = 0;
       for(int ef : a) 
       {

        total =  total + ef;
       }
    return total;
    }

    public static void main(String[] args) //without main method i cannot run
                                                                       the application.
    {
      int[] x = {1,2,3,4,5};

      Demo d = new Demo();
      int y =d.addElements(x); //Method call statement
      S.O.P(y);
    }
}



2.Methods with arguments and without return value(void) :
-------------------------------------------------------------------

class Demo
{
  static void add(int a, int b)
  {
     int c = a+b;
     System.out.println(c);  
  }


  public static void main(String[] args)
  {
    
     add(3,2); //directly

    Demo.add(3,2); //By using className

   }
}

3.Methods without arguments and with return value :
-----------------------------------------------------------------


class Demo
{
   int[] getElements()
  {
    int[] a = {1,2,3,4,5};

    return a;
  }
    
public static void main(String[] args)
{
   Demo d = new Demo();

  int[] b = d.getElements();

    for(int c : b)
   {

     System.out.println(c);

   }

}

  
}

4.Methods without arguments and without return value :
----------------------------------------------------------------------

   class Demo
 {
    void display()
    {

       System.out.println("welcome");
    }

    public static void main(String[] args)
    {
       Demo d = new Demo();
       d.display();

     }
}

Garbage Collector :
------------------------------

It is a jvm component and it collects the garbage whenever cpu gets free time beacuse Garbage collector priority is latest priority.( Priority ranges from 1 to 10)
 
Our main method priority as 5;

Garbage means unused objects.

It is possible to call to garbage collector manually or explicitly by using gc() method of Java.lang.System class.

How the garbage collector works ???

Let me explain through a program :


class Demo
{
    Demo()
    {

      }
  int x = 5;
  int y=10;
  psvm(String[] args)
  {
    Demo obj = new Demo();
    Demo obj1 = new Demo();
    Demo obj2  = new Demo();
     obj = null;
     obj1 = obj2;

   }
}

Quiz : 1

class A
{
   public static int hello()
   {

      int a = 10;
    S.o.p(a);
    return a;

   }
   psvm(String[] args)
   {
      S.o.P(hello());
    }
}

What is a Array ?

It is a collection of similar data elements or  datatype elements.

The array will store in a contiguous location.

Why we will use arrays ?

variable -- the storage location in the memory where we store values in it.

int a = 10;         Synatx : datatype variablename = some value;
                                          int abc = 100;


int student1 = 101;
int student2 = 102;
int student3 = 103;
int student4= 103;
int student5 = 104;
int student6 = 10000;
int student7 = 105;
--
-
-
int student100 = 1000;


To avoid thse kind of hectic codes and to make our code simple and easy to read , arrays came.

It is a kind easy storage of data. 

int student[100] = {101,102,103,104........,200};
                                     0        1    2     3
We will iterate or to use the elements of an array we will use indexed approach.

array index always start with 0 and ends with (size-1)

System.out.println(student[1]); // if it is a variable value //random

for(int i =0;i<99;i++) //for loop
{
     System.out.println(student[i]);
}

for(int a : student) //for each == > We cannot access random elements
                                                                 We can only access elements in an order.
{
   System.out.println(a);
}


How to declare an array in java ?

In Java , array itself is an object.    Syntax : datatype[] arrayreference = new datatype[size];

int[] arr = new int[size];
int []arr = new int[size];
int arr[] = new int[size];

Quiz - 2 :

how do we create an object ?

class A
{


}

class Main
{
   public static void main(String[] args)
   {
          A onj = new A();
    }
}

In java, Array is an object.

Syntax how to declare an array :

  Dataype ArrayReference[] = new Datatype[size]; // array declaration

  ClassName objectReference = new ClassName(); // object declaration


int n = sc.nextInt();
 int a[] = new int[n];

    

Advantages :
 1. code optimisation

2. Random access through indexed approach.

Disadvantages :

1. multiple datatypes are not allowed

2.size is limited(Once we declare it we cannot change it)

What are the types of arrays in java ?

1 dimension array or single dimension array-- only 1 row and defined columns

int arr[] = new int[10];   


2 dimension array or multi dimension array --
                       muliple rows and multiple colums will be there

    int arr[][] = new int[3][3];
                                       rows cols
   for(int i=0;i<3;i++) //rows
   {
      for(int j=0;j<3;j++) //cols
      {
              System.out.print(arr[i][j]);
       }
     System.out.println();
   }
          

jagged array :


int arr[][] = new int[2][];

arr[0] = new int[4];
arr[1] = new int[2];


in 2d array, columns will be same for each row.

jagged array ---rows will be constant but column size will be keep changing.


for each loop == this is  made exclusively for iterating through arrays

int arr[] = {10,11,12}
for(int a : arr)
{
   System.out.println(a);
}


// Program to demonstrate 2-D jagged array in Java
class Main {
	public static void main(String[] args)
	{
		// Declaring 2-D array with 2 rows
		int arr[][] = new int[2][];

		// Making the above array Jagged

		// First row has 3 columns
		arr[0] = new int[3];

		// Second row has 2 columns
		arr[1] = new int[2];

		// Initializing array
		int count = 0;
		for (int i = 0; i < arr.length; i++) //rows
                                                for (int j = 0; j < arr[i].length; j++) //columns
                                                                              count = count+1;
				arr[i][j] = count;

		// Displaying the values of 2D Jagged array
		System.out.println("Contents of 2D Jagged Array");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}
}

static keyword :
-----------------------

It is called as modifier , because it modifies the behaviour of variable , method, Block and class.



By using static keyword, we can create class variables,class methods,static initialisation blocks,and
nested top level classes.

   static int a = 10;

    static int abc()
   {
    
    }

  static {


   }

Nested top level classes are a one type of inner classes.


Why main method is static ???

If it is not static , we need to create object for main method also. 
since it is static,jvm itself can call the main method when we run the program.

void - returns nothing.


this keyword :
---------------------
It is called as an object reference or reference variable, because it refers an object.


                  A obj = new A();

                  this.abc();

It always refers current object.

It is implicitly present in instance method, initialisation block and constructor    iic

program - 1:
---------------------

class Demo
{
   int x = 5;
  void show(Demo d)
 {
     System.out.println(d.x);

  }  
 public static void main(String[] args)
  {
     Demo d = new Demo();
     d.show(d);    
   }
}



Program 2:
-------------------
class Demo
{
   int x = 5;

  void show()
 {
     System.out.println(d.x);

  }  
 public static void main(String[] args)
  {
     Demo d = new Demo();
     d.show();
    
   }
}

Program 
---------------

class Main
{
   int x = 5;

   Main() //constructor
   {
	   System.out.println("constructor called");
	   System.out.println(x);
   }
   
   {
	   System.out.println("initialisation block called");
	   System.out.println(x); //initialisation block
   }
   
   void show() //instance method
   {
	   System.out.println("Instance method called");
	   System.out.println(x);
   }
   
 public static void main(String[] args)
  {
     Main d = new Main();
     d.show();
    
   }
}

 Program - 3:
---------------------
class Main                       //  5 5    8 5   5 8  8 8   error blank
{
   int x = 5;
void show()
 {
     System.out.println(this.x);
  }  
 public static void main(String[] args)
  {
     Main d = new Main(); 
    Main d1 = new Main(); 
     d1.x = d1.x+3;
     d.show();
     d1.show();    
   }
}

this keyword explicitly required to access an instance variable 
                              whenever both instance variable and local variable names are same.


program 4:
--------------

class Main
{
   int x = 5;
void show() 10 10  5 5 10 5 5 10 error blank
 {
	  int x = 10;
	  
    System.out.println(x);
     System.out.println(x);  }  
 public static void main(String[] args)
  {
     Main d = new Main();
      d.show();
    
    
   }
}



program 5:
--------------
class Main
{
   int x = 5;

  void show()
 {
	  int x = 10;
	  
      System.out.println(x); 
     System.out.println(this.x);

  }  
 public static void main(String[] args)
  {
     Main d = new Main();
    

     d.show();
    
    
   }
}

static method does not refer this keyword in any way(either implicitly or explicitly).
 
program - 6:
---------------------

class Main
{
   int x = 5;
   static void show()
 {
 System.out.println(x); //this is not applicable here
  }  
 public static void main(String[] args)
  {
     Main d = new Main();
     this.show();
   }
}

program - 7:
-----------------------
class Main
{
   int x = 5;

   static void show()
 {

     System.out.println(this.x); //this is not applicable here

  }  
 public static void main(String[] args)
  {
     Main d = new Main();
     this.show(); //this is not applicable here 
   }
}

program - 8
---------------------

class Main
{
   int x = 5;

   static void show()
 {
    int x = 10;
     
     System.out.println(x);
     System.out.println(this.x); //this is not applicable here

  }  
 public static void main(String[] args)
  {
     Main d = new Main();
     show(); 
   }
}


   variables, methods

  this keyword and access specifiers











Access Modifiers :
-------------------------

Access modifiers are also called as access specifiers 
because they specify access permissions to variables ,methods,classes, interfaces,e.t.c..,

There are 4 access modifiers in java :
---------------------------------------
1.private
2.protected
3.public
4.No name(default)(No access modifier)


private : (only within the same class i can access )
--------------
This access modifier is specified to access only within the class.


class A
{
   private int a = 10;
   private int b  = 20;

  private void show()
  {
     System.out.println("Welcome");
   }

   System.out.println(a);
}

class B
{

}

Note : we cannot declare a top-level class as private.

  
public : (i can access anywhere)
------------

This access modifier has no access restriction means anywhere i can access. ( No restrictive access)

default :(No name or  no access modifier)
------------
This access modifier is used to specify access only with in the package.


package : in the package we have sub packages, classes and interfaces.

import java.util.Scanner;

import java.util.*;

how to create the package : package packagename;

package abc;

class A
{
  int a = 10;
  int b = 20;
}

class B
{

}

interface A
{

}

interface B
{
  int a = 10;
}

package bcd;

class A
{

}

class B
{

}

protected :
------------------

This access modifier is used to specify access with in package and outside package only subclasses.

package abc;

class A
{
   protected int a = 10;
   int b = 20;
}

class B
{

}


class C

{
  int a = 10;
}

package bcd;

class D extends A
{

}

class E extends B
{

} 

Note : we cannot declare a top-level(outside class) class as private or protected. 

No name(default) is a default access modifier in a class.

public is a default access modifier in an interface.

No name(default) is a  default access modifier inside a package.


More restrictive access to Less restrictive access  order :

private ---> default ---> protected ----> public

less                                                                      more


So, first of all what is a constructor ?
----------------------------------------------

A constructor is a special method that has same name has that of class name
 and it is implicitly called when the object is created.

It is also called as special type of method which is used to initialize the object(initialising the instance                                                                                                                                    variables)


class Abc
{
     Abc()
    {

   }

}

It calls a default constructor if there is no constructor available in the class by implicit. 
In such case, Java compiler provides a default constructor by default.

Rules for creating Java constructor :
------------------------------------------------

There are three rules defined for the constructor :

1.) Constructor name must be the same as its class name                                    
2.) A Constructor must have no explicit return type(should not have any return type)
3.) A Java constructor cannot be abstract, static, final, and synchronized

Note : The main purpose of constructor is to initialise the instance variables



class A
{

    static int a;

   psvm()
   {

     sysout(a); //0

    }
}








int a; //declaration

int a = 10; //initialisation

int a;

a= 10; //assignment


The default value for any instance variable is 0

Program 1 :
class Demo
{
   int a;
   int b;
    Demo()
    {
        this.a = 0;
        this.b  = 0;
    }
     
 psvm(String[] args)
 {
      new Demo();  //unreferenced or anonymous object
  }
}

Program - 2 :
class Main
{
   int x ;
   
   Main()
   {
	   int x = 10;
	    System.out.println(this.x);
   }

  
 public static void main(String[] args)
  {
     Main d = new Main();
    
    System.out.println(d.x);
  
    
    
   }
}

Program - 3 :

class Demo
{
   
     Demo()
    {
        System.out.println("Welcome");
    }
 psvm(String[] args)
 {
       new Demo().Demo();
       Demo d = new Demo();
        d.Demo();    
  }
}


Note : We cannot call the constructor explicitly.
    Object creation itself calls the construtor implicitly.

Types of Java constructors:
----------------------------------------
There are two types of constructors in Java:

1.) Default constructor (no-arg constructor)
2.) Parameterized constructor

Java Default Constructor
-----------------------------------------
A constructor is called "Default Constructor" when it doesn't have any parameters or arguments.

Syntax of default constructor:
---------------------------------------

<class_name>(){}  

Example of default constructor
----------------------------------------------
In this example, we are creating the no-arg constructor in the Bike class. 
It will be invoked(calling or called) at the time of object creation.
//Java Program to create and call a default constructor  

class Bike1{  
//creating a default constructor  
     Bike1(){
          System.out.println("Bike is created");
        }  
//main method  
         public static void main(String args[]){  
//calling a default constructor  
              Bike1 b=new Bike1();  
}  
}  

What is the purpose of a default constructor?

The default constructor is used to provide the default values to the 
object like 0, null, etc., depending on the type.(initialising the object)

2.)Java Parameterized Constructor
----------------------------------------------
A constructor which has a specific number of parameters 
is called a parameterized constructor.

Syntax of parameterised constructor:
---------------------------------------

<class_name>(args....){}  

Abc(int a, int b)
{

}


Example of parameterized constructor :
--------------------------------------------------
In this example, we have created the constructor of Student class 
that have two parameters. 
We can have any number of parameters in the constructor.

//Java Program to demonstrate the use of the parameterized constructor.  
class Student{  
    int id;  
    String name;  
    //creating a parameterized constructor  
    Student(int i,String n){  
       this.id = i;  
      name = n;  
    }  
    //method to display the values  
    void display(){

       System.out.println(id+" "+name);

    }  
   
    public static void main(String args[]){  
    //creating objects and passing values 
 
    Student s1 = new Student(111,"Karan"); 
 
    Student s2 = new Student(112,"Aryan");  

    //calling method to display the values of object  
    s1.display();  
    s2.display();  
   }  
}  


If there is no explicit parameterised constructor,
 compiler implicitly provides default constructor.
But if there is parameterised constructor explicitly , 
compiler does not provides any default constructor implicitly.

Why use the parameterized constructor? providing different values to objects

The parameterized constructor is used to provide different values to distinct objects. 
However, you can provide the same values also.

Constructor Overloading in Java :
------------------------------------------

Constructor overloading in Java is a technique of having more than one constructor
 with different parameter lists.
 They are arranged in a way that each constructor performs a different task => initialisation 
They are differentiated by the compiler by the number of parameters in the list and 
their types.

overloading : it can same method or constructor name but with different number of parameters or arguments

these parameters or arguments can
1. differ in number of arguments
2. in order of arguments
3. in type of arguments



class A
{
       int x; //instance variable

      A(int a) //1
     {

         this.x = a;
     }


     A(int a, int b,int c) //2
    {
        System.out.println(a+b+c);

     }

     A(int a, float b) //3
     {

      }


      A(float a , int b) //4
      {


       }


       A() //5
       {



          }





      void b()
     {
         System.out.println(this.x);
     }
    public static void main(String[] args)
    {
        int x = 1000; //local

        A obj = new A(454.0);
        
          obj.b();
     }
}


Example of Constructor Overloading :
--------------------------------------------------
//Java program to overload constructors  
class Student5{  
    int id;  
    String name;  
    int age;  
    //creating two arg constructor  
    Student5(int i,String n){  
    id = i;  
    name = n;  
    }  
    //creating three arg constructor  
    Student5(int i,String n,int a){  
    id = i;  
    name = n;  
    age=a;  
    }  
    void display(){System.out.println(id+" "+name+" "+age);}  
   
    public static void main(String args[]){  
    Student5 s1 = new Student5(111,"Karan");  
    Student5 s2 = new Student5(222,"Aryan",25);  
    s1.display();  
    s2.display();  
   }  
}  

class Variable
{
	int id;
	String name;
	
	
	public Variable(int i, String string) {
		// TODO Auto-generated constructor stub
		
		id = i;
		name = string;
	}
	public Variable()
	{
		System.out.println("Welcome");
	}
	
	public Variable(String string , int i)
	{
		id = i;
		name = string;
	}
	
	public Variable(String string, int a, int b)
	{
		System.out.println("My value1 is "+a+"My value2 is "+b+"My value3 is"+string);
	}
	void display()
	{
		System.out.println("My roll no is: "+id+" My name is: "+name);
	}
	
	public static void main(String[] args)
	{
		Variable obj1 = new Variable(111,"Roshith");
		
		Variable obj2 = new Variable("Arya",112);
		
		
		Variable obj3 = new Variable();
		
		Variable obj4 = new Variable("Teja sri", 12, 11);
		
		obj1.display();
		obj2.display();
		
	}	
	
	
}

class Main
{
   int x ;
   String y;
   int z;
   int w;
   
    Main()
    {
    	System.out.println("Welcome");
    }
   
   
    Main(int a, String b)
    {
    	x=a;
    	y=b;
    }
    
    Main(String b, int a )
    {
    	y = b;
    	x = a;
    	
    }
    
    Main(int a, String b , int c)
    {
    	x = a;
    	y= b;
    	z = c;
    	
    }
    
    Main(int a, String b, int c,int d)
    {
    	x = a;
    	y= b;
    	z = c;
    	w = d;
    }
    
  
 public static void main(String[] args)
  {
     
    
     Main d = new Main(2,"Roshith");
     Main d1 = new Main("Sai",2);
     Main d2 = new Main(3,"Nani",5);
     //Main d3 = new Main();
     Main d4 = new Main(3,"demo",5,4);
    
   }
}

Thats all about constructors from my side.

this()
 
---> It calls default constructors of current class

this(args)

--> It calls parameterised constructor of current class.

 Note :
-----------

this() or this(args) must be a first statement in a constructor.



Program - 1:
--------------------

class Main
{
	Main()
	{ 
                                     //this(x);
		System.out.println("Welcome");
	}

	Main(int x)
	{
		//this();
		System.out.println(x);	
	}
	
	public static void main(String[] args)
	{
		new Main(5);
                                    new Main();	
	}
}

program - 2 :
---------------

class Main
{
	Main()
	{
		this(5);
		System.out.println("Welcome");
                                      
	}
	
	Main(int x)
	{
		
		System.out.println(x);	
	}
	
	public static void main(String[] args)
	{
		new Main();	
	}
}

Instance variables initialisation without constructor :
---------------------------------------------------------------

class Emp
{
	int empNo = 101;
	float salary = 5000.0f;
}


class Main
{
	public static void main(String[] args)
	{
		Emp e1 = new Emp();
		Emp e2 = new Emp();
		
		System.out.println(e1.empNo+" "+e1.salary);
		System.out.println(e2.empNo+" "+e2.salary);
	}
}

Instance variables initialisation with constructor :
-----------------------------------------------------------------

class Emp
{
	int empNo ;
	float salary;
	
	Emp(int empNo,float salary)
	{
		this.empNo = empNo;
		this.salary = salary;
	}
}


class Main
{
	public static void main(String[] args)
	{
		Emp e1 = new Emp(101,5000.0f);
		Emp e2 = new Emp(102,10000.0f);
		Emp e3 = new Emp(103,15000.0f);
		Emp e4 = new Emp(104,5000.0f);
		
		System.out.println(e1.empNo+" "+e1.salary);
		System.out.println(e2.empNo+" "+e2.salary);
		System.out.println(e3.empNo+" "+e3.salary);
		System.out.println(e4.empNo+" "+e4.salary);
	}
} 










Object-oriented Principles :
=====================

1. Inheritance

2. Polymorphism

3. Abstarction

4. Encapsulation


Inheritance :
---------------------
Creating a new class(with already existed properties along with new properties)
 from the existing class is called as inheritance.

In Inheritance, existed class is called super class or parent class
 and new class is called sub class or child class.

Adding new functionality to the already existed application is the use of inheritance.

using extends keyword we can acquire the properties from one class to another class.



class CollegeApp1.0
{
  int sRollno;
  String sName;
  String sAddress;
  int sPhoneno;
}

class CollegeApp2.0 extends CollegeApp1.0
{

   String sEmailId;
}




There are types of inheritance in java :
---------------------------------------------

1.Single Inheritance

2.Multiple inheritance

3.Multilevel inheritance

4.Heirarchical Inheritance

5.Multipath inheitance

6.Hybrid inheriance


1.Single Inheritance
-----------------------------

Derivation of a class from only one super class is called as single inheritance.

class A
{

   -----
}

class B extends A
{
  -------
}

2.Muliple inheritance :
-----------------------------

Derivation of a class from more than one super class is called as multiple inheritance.

class A
{

}

class B
{

}

class C extends A,B
{

}

3.Multilevel inheritance:
--------------------------------

Derivation of a class from subclass is called as multilevel inheritance.

class A 
{

}
class B extends A
{

}

class C extends B
{

}

class D extends C
{

}
 
4.Heirarchical inheritance:
-----------------------------------

Derivation of several classes from only one super class 
                                                                    is called as heirarchical inheritance.

class A
{

}

class B extends A
{

}

class C extends A
{

}

class D extends A
{

}

5.Multipath inheritance :(Multiple inheritance + Heirarchical inheritance)
--------------------------------

Derivation of a class from more than one sub class,
 those subclasses get inherited from the same super class is called as multipath inheritance.

class A 
{

}

class B extends A
{

}

class C extends A
{


}

class D extends B,C
{

}

6.Hybrid inheritance
--------------------------

Derivation of a class, involving more than one form of inheritance is called as hybrid inheriatnce.

Class A
{

}

class B extends A
{

}

class C
{

}

class D extends B,C
{

}

Note :
------------

Multipath inheritance is also one example of hybrid inheritance.

Java does not support 
                   multiple inheritance, multipath inheritance and hybrid inheritance.

Note2 :
--------------

Java does not support multiple inheritance because of ambiguity to call.

class A
{

    show();
}

class B
{
   show();
}
class C extends A,B
{


      C obj = new C();
      obj.show();


}


Note :
==========

Super class reference can refer both super class object and sub class class object, 
but it can access only super class members only.


class A
{

 int a;
show();


}


class B extends A
{
   int b;

   get();
psvm()
{

   B obj = new B();



}






        A obj1 = ____________; (new A() or new B())

class A //super class
{
	int x = 10;
	void show()
	{
		System.out.println("Class A");
	}
}

class B extends A
{
	int y = 11;
	void print()
	{
		System.out.println("Class B");
		
	}
	
	public static void main(String[] args)
	{
		A obj = new A();
		
		System.out.println(obj.x);
		System.out.println(obj.y); //Not valid
		obj.show();
		obj.print(); //Not Valid
		
				
	}
}

Sub class reference can refer only subclass object 
but it can access both super class and sub class members.

      B obj1 = new B();


Example program for notes below :
-----------------------------------------

class A //super class
{
	int x = 10;
	void show()
	{
		System.out.println("Class A");
	}
}

class B extends A
{
	int y = 11;
	void print()
	{
		System.out.println("Class B");
		
	}
	
	public static void main(String[] args)
	{
		B obj = new B();
		
		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.show();
		obj.print();
		
				
	}
}



this -> obj ref  IIC => instance method, initialisation block and constructor, when i wanted to access instance variable or method of current class or same class

Super keyword :
-------------------

It is also called as object reference or reference variable because it refers super class memory.

Super keyword explicitly required to access super class member whenever, 
both super class member and sub class member names are same.

Member can be variable or method.

class A
{
	int x = 10;
	
	void show()
	{
		System.out.println("Welcome");
	}
}

class Main extends A
{
	int x = 20;

              Main()
              {

              }
	
	void print()
	{
		int x = 30;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
		super.show();
	}
	
	public static void main(String[] args)
	{
		Main obj = new Main();
		obj.print();

		
	}
}

Note :
----------
static method does not refer this and super keywords in anyways.

super():
--------------
It calls default constructor of super class.

It is implicitly present as a first statement in every constructor.


super(args)
----------------

It calls parameterised constructor of super class.

Note :
-----------

this() , or this(args) or super() or super(args) must  be a first statement in a constructor.

program - 1
--------------------

class A
{
	A()
	{
		System.out.println("A class");
	}
}

class Main extends A
{
	Main()
	{
                                    
		System.out.println("Main class");
	}
	
	public static void main(String[] args)
	{
		new Main();
	}
}

Program - 2:
-------------------

class A
{
	A()
	{
		System.out.println("welcome");
	}
	A(int x)
	{
		this();
		System.out.println(x);
	}
}

class Main extends A
{
	Main(int y)
	{
	    super(20);
	    System.out.println(y);
	}
	
	public static void main(String[] args)
	{
		new Main(10);
	}
}

Polymorphism :
-------------------------

The ability to take more than one form is called as polymorphism.

Poly means "many", morphism means forms and polymorphism means many forms.

There are two types of polymorphism in java :
-------------------------------------------------------

1.) Compile-time polymorphism

2.) Run-time polymorphism


1. Compile - time polymorphism :
----------------------------------------

Binding of method call statement with method definition is done at compile time is known as compile time polymorphism.

Example of compile time polymorphism is : Method Overloading.

Method Overloading :
--------------------------

If two or more methods with the same name and with different parameters list, then it is said to method overloading. 

void A()
{

}
void A(int a, int b, int c)
{


}

void A(int a, int b)
{

}

void A(int a, float b)
{


}

int A(float a, int b)
{

}

main()

{

  A();
}
In method overloading, parameters can be different in number of arguments , datatypes and order of arguments.

In method overloading, return type can same or different.

Program - 1:
------------------
class Main
{
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	private void add(int b, int a, int c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args)
	{
                     Main obj = new Main();
                      obj.add(35,23,13); //method call statement
                      obj.add(12, 15);			
	}
}

2.)Runtime Polymorphism :
---------------------------------
Binding of method call Statement with method definition is done at runtime(execution) is called as runtime polymorphism.

The example of runtime polymorphism is Method Overriding

Method Overriding :
----------------------------

If two or more methods with the same name and with same parameters list, then it is said to be method overriding.

Note :
======
**Methods cannot be overridden in the same class.

Methods can be overridden only with inheritance.

Program - 1:
--------------------
class A
{
	void show()
	{
		System.out.println("A class");
	}
	
	void print()
	{
		System.out.println("print() method");
	}
}


class Main extends A
{
	void show()
	{
		System.out.println("Main class");
	}
	
	void display()
	{
		System.out.println("display() method");
	}
	
	public static void main(String[] args)
	{
		A obj = new Main();
		obj.show();
		obj.print();
		//obj.display();
		
	}
}

Program - 2:
-------------------
class A
{
	void show()
	{
		System.out.println("A class");
	}
	
	void print()
	{
		System.out.println("print() method");
	}
}


class Main extends A
{
	void show()
	{
		System.out.println("Main class");
	}
	
	void display()
	{
		System.out.println("display() method");
	}
	
	public static void main(String[] args)
	{
	   Main obj = new Main();
		obj.show();
		obj.print();
		obj.display();
		
	}
}

Program - 3:
--------------------
class A
{
	private void show()
	{
		System.out.println("A class");
	}
	
	void print()
	{
		System.out.println("print() method");
	}
}


class Main extends A
{
	  void show()
	{
		System.out.println("Main class");
	}
	
	void display()
	{
		System.out.println("display() method");
	}
	
	public static void main(String[] args)
	{
	   Main obj = new Main();
		obj.show();
		obj.print();
		//obj.display();
		
	}
}

(tomorrow 7am)
Assignment 3 : Perform method overriding with parameters 
Self learning-1 : Can I perform inheritance for a static or class method ? Why static methods cannot be overridden ?
Self learning-2 : Can private methods be inherited ?


Differences between Method Overloading and Method Overriding :
------------------------------------------------------------------------------
Method Overloading                                         Method Overriding
-----------------------------------------------------------------------------------
1. If two or more methods with same name and with different parameters list .Then it is said to be method overloading

1. If two or more methods with same name and with same parameters list .Then it is said to be method overriding

2.In method overloading, return type can be same or different.

2.In method overriding , return type must be same,except covariant return type.

3.Methods can be overloaded in the same class

3.Methods cannot be overrided in the same class because of ambiguity to call

4.Method can be overloaded in inheritance also

4. Methods can be overridded only in inheritance.

5.Final methods can be overloaded.

final void A(int a, int b)

final void A(float a, float b)

5.Final methods cannot be overridden because final keyword used to prevent method overriding.

6.Static methods can be overloaded

6. Static methods cannot be overridden because static methods are not a part of an object. 

7.In method overloading, Access modifiers can be same or different.

7. In method overridding, method can have same access modifier or less restrictive access modifier.

private -> default -> protected -> public
more                                                    less

class A
{
   void abc(int a, int b)
  {

  }
}


class B extends A
{
  protected void abc(int a, int b)
   {


    }
}

8.Private methods can be overloaded.

8.Private methods cannot be overridden because private members cannot be inherited(because scope is within the class only).

Co-variant return type :
-------------------------------

Java permits sub class type as a return type while overriding a method. This is covariant return type.

Class A
{

}
class B extends A
{

}

class C extends B
{
     B hello()
    {

    }
}

class D extends C
{
   C hello()
  {
    
   }
}

class E extends D
{
    D hello()
    {

     }
}

=================================================

Abstraction :
----------------------

Providing neccessary information and hiding uneccessary information is called as abstraction.
                                                                        (or)
Providing neccessary information without disclosing(including) background details.

In java, abstraction can be implemented using abstract classes and interfaces.

Abstract class :
---------------------

A class that is declared with abstract keyword is called as abstract class.

abstract class A
{
   abstract void show();
   void print()
   {
     //set of statements

   }
}

A abstract class can have only abstract methods, only non - abstract methods or abstract and non - abstract methods.

Non- abstract methods are also called as concrete methods.

Abstract method :
---------------------

A method that has no body is called a abstract method.

Abstract method must be declared with abstract keyword in java, otherwise compile-time error occurs.

abstract void show(); // abstract method declaration.

Non-abstract method  or concrete method:
-----------------------------------------------

A method that has a body is called as an concrete method.

void show()
{

}

If the class contains an abstract method, then the class must be declared with abstract keyword, otherwise compile time error occurs.

1.) 
 abstract class A
{

   void show()
   {
      
   }

    abstract void print();
    

}

    

2.)

abstract class B
{

   void show();
   void print();
} //NOt Valid - compile-time error

3.)
abstract class C
{

  abstract void show();
  abstract void set();
  void print()
  {

   }
   void display()
   {

   }
} //valid

abstract class D extends C
{
  abstract void show();

   void set()
  {

   }
}

 class E extends D
{
     void show()
   {

   }
}



Abstract classes cannot be instantiated.instantiation means object creation.

Abstract classes can be inherited into another class by using "extends" keyword.

Whenever abstract class is inherited then, all the abstract methods of an abstract class must be overridden in the sub class or the sub class must be declared with abstract keyword otherwise compile-time error occurs.

Program - 1:
-----------------

abstract class A
{
	abstract void show();
	
	
	
	void print()
	{
		System.out.println("print() method");
	}
}

 class Main extends A
{
	 void show()
	{
		System.out.println("show() method");
	}
	 
	void display()
	{
		System.out.println("display() method");
	}
	public static void main(String[] args)
	{
	
	    Main obj = new Main();
	    obj.show();
	    obj.display();
	    obj.print();
	    
	}
}

program - 2 :
----------------
abstract class A
{
	abstract void show();
	
	abstract void give();
	
	void print()
	{
		System.out.println("print() method");
	}
}

 abstract class Main extends A
{
	 void show()
	{
		System.out.println("show() method");
	}
	 
	 abstract void give();
}


class D extends Main()
{
	void give()
                  {
                       System.out.println("give() method");
                   }


        
	void display()
	{
		System.out.println("display() method");
	}
	public static void main(String[] args)
	{
	    D obj = new D();
	    obj.show();
	    obj.display();
	    obj.print();
                        obj.get();
	    
	}
}

Note :
-------------

Abstract methods cannot be final.

Abstract methods cannot be static.

Abstract methods cannot be private.

Abstract classes can have constructors and those constructors are called whenever the object of the sub classes are created.

abstract class A
{
	A()
	{
		System.out.println("constructor");
	}
}

class Main extends A
{
	Main() //implicitly present
	{
		super(); //This will be there implicitly.
	}
	public static void main(String[] args)
	{
		new Main();
	}
}

Abstract class can have static members.

abstract class A
{
	static void show()
	{
		System.out.println("show() method");
	}
}

class Main extends A
{
	
	public static void main(String[] args)
	{
		Main.show();
	}
}

abstract class can have main method also.

abstract class Main
{
	
	public static void main(String[] args)
	{
	 System.out.println("welcome");
	}
}

Interfaces :
---------------

An interface is a collection of public static final variables
                                                                            and public abstract methods.

In an interface, all variables are implicitly public static final and 
all methods are implicitly public abstract.

Interface itself impilcitly abstract.

Interfaces also cannot be instantiated.Instantiation means object creation.

interface A
{
   int a ;
   
   void show();
   void give();
}

Interface can be inherited into a class by using implements keyword.  

Interface can also be inherited into another interface by using extends keyword.


class cannot inherit the inteface.

Whenever interface is inherited into a class 
all the abstract methods must be overridden in the sub class , 
if not declare sub class with abstract keyword otherwise compile time error occurs.

.Class file will also be generated for every interface.

Program -1:
--------------------
interface A
{
	 int a = 5;
	void show();
}

class Main implements A
{
	int b = 10;
	
     public void show()
	{
		System.out.println("show() method");
	}
     
    void print()
    {
    	System.out.println("Print() method");
    }
    
    
    public static void main(String[] args)
    {
    	Main obj = new Main();
    	obj.show();
    	obj.print();
    	System.out.println(A.a);
    	System.out.println(obj.b);
    }

}

Program-2 :
-------------------

interface A
{
	int a = 5;
	void show();
}

class Main implements A
{
	int b = 10;
	
     public void show()
	{
		System.out.println("show() method");
	}
     
    void print()
    {
    	System.out.println("Print() method");
    }
    
    
    public static void main(String[] args)
    {
    	A obj = new Main();
    	obj.show();
    	//obj.print();
    	System.out.println(A.a);
    	//System.out.println(obj.b);
    }

}

Intefaces are introduced in java is to achieve multiple inheritance.

class A{}
class B{}
interface C{}
interface D{}

class Main extends A,B{} //Not Valid

class Main1 implements C,D{} //Valid

class Demo extends A implements C{} //valid

class Demo1 extends A implements C,D{} //valid

interface S extends C,D{} //valid

interface E extends A,B{} //Not valid

One interface inheriting two or more classes is not valid.


Abstract class supports 0-100 % abstraction whereas 
interfaces support only 100% abstraction. 

This is about the interfaces.

Encapsulation :
-------------------------

What is   En-capsule-ation ?

Encapsulation in java is a process 
of wrapping code(methods) and data(variables)
 together into a single unit like a capsule.

                                                                                  (or)

Binding of variables and methods into a single unit and
 those methods(getters and setters) are operating on the same variables. 
This is known as encapsulation.

 To perform encapsulation there are some rules we need to follow :

1. in a specific class(Java Bean), the variables declared must be private.

2. To access those private variables we need getter and setter methods 
that must be declared as public.


The java bean class is the example of fully encapsulated class.  

setter method is used for setting the value of private variable.

getter method is used for getting/returning the value of private variable.

Note : The setters and getters are used only for 
accessing the private data or variables outside another class.

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

In the above Program, age variable is bounded with setAge() and getAge() methods
 and these methods are operating on age variable. This is known as Encapsulation. 

Application of Encapsulation :
-----------------------------------

Encapsulation is used for data(variables) hiding.