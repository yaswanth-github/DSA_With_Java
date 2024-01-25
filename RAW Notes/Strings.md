


Strings in Java :
===============

What is String ?

-> The referenced datatype, is a collection of characters or a sequence of characters placed under double quotes (" ").

 Note :
========
Single quotes(' ') are not allowed to enclose a string in java.


-> In Java, String is also called a object in java.

-> The java.lang.String class is used to create a string object.



     java.lang -> default package

    Object class -> is the default super class for all the classes that you write in java

    toString() method -> default method

  go to your cmd : javap java.lang.Object

  set path = C:\Program Files\Java\jdk-17.0.2\bin




   class A extends Object
   {

   public String toString()
   {

            return "hello";
  }

    public static void main(String[] args)
    {

        A obj = new A();

     Sysout(obj.toString()); // class@hascode

   }
}

 How to create a string object?
=====================
1st way :(using literal)
=======

String s="welcome";  

Each time you create a string literal, the JVM checks the "string constant pool or string pool or string pool area or scp" first. 
If the string already exists in the pool, a reference to the pooled instance is returned.
 If the string doesn't exist in the pool, a new string instance is created and placed in the pool.

String s1="Welcome";  
String s2="Welcome";


Note: 
======

String objects are stored in a special memory area known as the "string constant pool".

-> In SCP, duplicates are not permitted(Error wont be there but it will not consider if we write also) whereas in heap area, duplicates are allowed.

-> Before Java 6, the SCP is part of permanent generation like kind of storage(Method area) but from Java 7, they have placed  SCP in heap area only.

2nd way : By new keyword
=========

String s=new String("Welcome");//creates two objects and one reference variable  

In such case, JVM will create a new string object in normal (non-pool) heap memory, and the literal "Welcome" will be placed in the string constant pool. The variable s will refer to the object in a heap (non-pool).

String s1 = new String("Welcome");
String s2 = new String("Welcome");


3rd way : (using char array)
===========

char ch[]={'s','t','r','i','n','g','s'};    
String s2=new String(ch);//converting char array to string  

Why Java uses the concept of String literal?

To make Java more memory efficient (because no new objects are created if it exists already in the string constant pool).


Types of Strings in java :
======================

1. Immutable Strings : Something that cannot be changed(UnChangeable)

2. Mutable Strings : Something that can be changed(Changeable)

Immutable Strings :
===================

class Testimmutablestring{  
 public static void main(String args[]){  
   String s="Sachin";  
   s.concat(" Tendulkar");//concat() method appends the string at the end  
   System.out.println(s);//will print Sachin because strings are immutable objects  
 }  
}  

Output:

Sachin
 
that two objects are created but s reference variable still refers to "Sachin" not to "Sachin Tendulkar".

But if we explicitly assign it to the reference variable, it will refer to "Sachin Tendulkar" object like below :

class Testimmutablestring1{  
 public static void main(String args[]){  
   String s="Sachin";  
   s=s.concat(" Tendulkar");  
   System.out.println(s);  
 }  
}  

Output :
======

Sachin Tendulkar

In such a case, s points to the "Sachin Tendulkar". Please notice that still Sachin object is not modified.

Why String objects are immutable in Java?
===============================
As Java uses the concept of String literal. Suppose there are 5 reference variables, all refer to one object "Sachin". If one reference variable changes the value of the object, it will be affected by all the reference variables. That is why String objects are immutable in Java.





Why String class is Final in Java?
========================
The reason behind the String class being final is because no one can override the methods of the String class. So that it can provide the same features to the new String objects as well as to the old ones.

Different ways to compare Strings :
===========================

1. ==

2. equals() method

3. equalsIgnoreCase()

4. compareTo()


1) By Using == operator
=======================

The == operator compares references not values.

class Teststringcomparison3{  
 public static void main(String args[]){  
   String s1="Sachin";  
   String s2="Sachin";  
   String s3=new String("Sachin");  
   System.out.println(s1==s2);//true (because both refer to same instance)  
   System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)  
 }  
}  

2) By Using equals() Method :
========================

The String class equals() method compares the original content of the string. It compares values of string for equality

class Teststringcomparison{  
 public static void main(String args[]){  
   String s1="Sachin";  
   String s2="Sachin";  
   String s3=new String("Sachin");  
   String s4="Saurav";  
   System.out.println(s1.equals(s2));//true  
   System.out.println(s1.equals(s3));//true  
   System.out.println(s1.equals(s4));//false  
 }  
}  

3) By using equalsIgnoreCase() Method :
==================================

It compares this string to another string literals or values same like equals() method, but ignores the case.


class Teststringcomparison{  
 public static void main(String args[]){  
   String s1="Sachin";  
   String s2="SACHIN";  
  
   System.out.println(s1.equals(s2));//false  
   System.out.println(s1.equalsIgnoreCase(s2));//true  
 }  
}  

4) By Using compareTo() method :
===========================

  The String class compareTo() method compares values lexicographically and returns an integer value that describes if first string is less than, equal to or    greater than second string.

  Suppose s1 and s2 are two String objects. If:

  s1 == s2 : The method returns 0.
  s1 > s2 : The method returns a positive value.
  s1 < s2 : The method returns a negative value.

  class Teststringcomparison{  
 public static void main(String args[]){  
   String s1="Sehwag"; 101  
   String s2="Saurav";  97
  
   System.out.println(s1.compareTo(s2));+4  
 }  
}  


String Concatination in java :
=======================

String Concatination is nothing but adding multiple strings.

There are 2 ways to concatinate a string :

1. Using concat() method

2. Using + operator

2. ) String Concatenation by + (String concatenation) operator :
===========================================

Java String concatenation operator (+) is used to add strings. 

class TestStringConcatenation{  
 
  public static void main(String args[]){  
   
    String s="Sachin"+" Tendulkar";  
              s = s+"mahi";
   String s2= s+ "mahi";
              s = s+"ravi";
        System.out.println(s);//Sachin Tendulkar 
        
 
}  
}  

The Java compiler transforms above code to this:

String s=(new StringBuilder()).append("Sachin").append(" Tendulkar).toString();  

In Java, String concatenation is implemented through the StringBuilder (or StringBuffer) class and it's append method. String concatenation operator produces a new String by appending the second operand onto the end of the first operand. 

Note :
====

-> The String concatenation operator can concatenate not only String but primitive values also. 

class TestStringConcatenation{  

 public static void main(String args[]){
  
   String s=50+30+"Sachin"+40+40;  
   System.out.println(s);

 }  
}  

1) String Concatenation by concat() method
=================================

The String concat() method concatenates the specified string to the end of current string. 

Syntax:
=======

public String concat(String another)  

class TestStringConcatenation3{  
 public static void main(String args[]){  
   String s1="Sachin ";  
   String s2="Tendulkar";  
    s1=s1.concat(s2);  
   String s3 = "Sachin Tendulkar"; 
   System.out.println(s3); 
   System.out.println(s1);
   System.out.println(s1==s3);

  }  
}  


Substring in Java
============

-> A part of String is called substring.

-> In other words, substring is a subset of another String. 

->Java String class provides the built-in substring() method that extract a substring from the given string by using the index values passed as an argument. 

-> In case of substring() method startIndex is inclusive and endIndex is exclusive.

Note: 
=====
Index starts from 0 also in substring.

public class TestSubstring{   
 
 public static void main(String args[]){ 
   
 String s="SachinTendulkar";
    
 System.out.println("Original String: " + s);  
 System.out.println("Substring starting from index 6: " +s.substring(6));//Tendulkar    
 System.out.println("Substring starting from index 0 to 6: "+s.substring(0,6)); //Sachin  
 }  
}    

Other methods of String class :
========================
1.) 

public class Stringoperation
{  
public static void main(String ar[])  
{  
String s="Sachin";    
System.out.println(s.toUpperCase());//SACHIN    
System.out.println(s.toLowerCase());//sachin    
System.out.println(s);//Sachin(no change in original)    
}  
}  

2.)

public class Stringoperation  
{  
public static void main(String ar[])  
{  
String s="  Sachin  ";    
System.out.println(s);//  Sachin      
System.out.println(s.trim());//Sachin    
}  
}  

The String class trim() method eliminates white spaces before and after the String.

3)

public class Stringoperation  
{  
public static void main(String ar[])  
{  
String s="Sachin";    
 System.out.println(s.startsWith("Sa"));//true    
 System.out.println(s.endsWith("n"));//true    
}  
}  

The method startsWith() checks whether the String starts with the letters passed as arguments and endsWith() method checks whether the String ends with the letters passed as arguments.


4)

public class Stringoperation  
{  
public static void main(String ar[])  
{  
String s="Sachin";    
System.out.println(s.charAt(0));//S    
System.out.println(s.charAt(3));//h    
}  
}  

The String class charAt() method returns a character at specified index.

5)

public class Stringoperation  
{  
public static void main(String ar[])  
{  
String s="Sachin";    
System.out.println(s.length());//6    
}  
}  

The String class length() method returns length of the specified String.

6)

public class Stringoperation
{  
public static void main(String ar[])  
{  
int a=10;    
String s=String.valueOf(a);    
System.out.println(s+10);    
}  
}  

The String class valueOf() method coverts given type such as int, long, float, double, boolean, char and char array into String.

7)

public class Stringoperation  
{  
public static void main(String ar[])  
{  
String s1="Java is a programming language. Java is a platform. Java is an Island.";      
String replaceString=s1.replace("Java","Kava");//replaces all occurrences of "Java" to "Kava"      
System.out.println(replaceString);    
}  
}     

Agenda :

StringBuffer

StringBuilder

toString() method




Mutable Strings :
===========

StringBuffer Class :
==============

Java StringBuffer class is used to create mutable (modifiable) String objects.

 The StringBuffer class in Java is the same as String class except it is mutable i.e. it can be changed.

Note:

 Java StringBuffer class is thread-safe i.e. multiple threads cannot access it simultaneously. So it is safe and will result in an order.

StringBuffer Class append() Method :
==========================

The append() method concatenates the given argument with this String.

class StringBufferExample{  
public static void main(String args[]){  
StringBuffer sb=new StringBuffer("Hello ");  
sb.append("Java");//now original string is changed  
System.out.println(sb);//prints Hello Java  
}  
}  

StringBuffer insert() Method :
=====================

The insert() method inserts the given String with this string at the given position.

class StringBufferExample{  
public static void main(String args[]){  
StringBuffer sb=new StringBuffer("Hello ");  
sb.insert(1,"Java");//now original string is changed  
System.out.println(sb);//prints HJavaello  
}  
}  

StringBuffer replace() Method :
=======================

The replace() method replaces the given String from the specified beginIndex and endIndex.

class StringBufferExample{  
public static void main(String args[]){  
StringBuffer sb=new StringBuffer("Hello");  
sb.replace(1,3,"Java");  
System.out.println(sb);//prints HJavalo  
}  
}  

StringBuffer delete() Method :
======================

The delete() method of the StringBuffer class deletes the String from the specified beginIndex to endIndex.

class StringBufferExample{  
public static void main(String args[]){  
StringBuffer sb=new StringBuffer("Hello");  
sb.delete(1,3);  
System.out.println(sb);//prints Hlo  
}  
}  

StringBuffer reverse() Method
=======================

The reverse() method of the StringBuilder class reverses the current String.

class StringBufferExample{  
public static void main(String args[]){  
StringBuffer sb=new StringBuffer("Hello");  
sb.reverse();  
System.out.println(sb);//prints olleH  
}  
}  

StringBuffer capacity() Method
======================

The capacity() method of the StringBuffer class returns the current capacity of the buffer. 

The default capacity of the buffer is 16. 

If the number of character increases from its current capacity, it increases the capacity by (oldcapacity*2)+2. For example if your current capacity is 16, it will be (16*2)+2=34.

class StringBufferExample6{  
public static void main(String args[]){  
StringBuffer sb=new StringBuffer();  
System.out.println(sb.capacity());//default 16  
sb.append("Hello");  
System.out.println(sb.capacity());//now 16  
sb.append("java is my favourite language");  
System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
}  
}  

StringBuffer ensureCapacity() Method :
==========================

ensureCapacity(int minCapacity):  ensures that the capacity is at least equal to the specified minimum.

If current capacity is greater than the argument there will be no change in the current capacity.

If current capacity is less than the argument there will be change in the current capacity using below rule.

class TestStringBuffer{
	StringBuffer sb = new StringBuffer();
 
	/**
	 * This method is used to show the use of ensureCapacity() method.
	 * @author w3spoint
	 */
	public void ensureCapacityTest(StringBuffer sb){
		//default capacity.
		System.out.println(sb.capacity());
 
		sb.append("Hello ");
		//current capacity 16.
		System.out.println(sb.capacity());
 
		sb.append("www.w3spoint.com");
		//current capacity (16*2)+2=34 i.e (oldcapacity*2)+2.  
		System.out.println(sb.capacity());
 
		sb.ensureCapacity(10);
		//now no change in capacity because 
                //minimum is already set to 34. 
		System.out.println(sb.capacity());  
 
		sb.ensureCapacity(50);
		//now (34*2)+2 = 70 as 50 is greater than 34.
		System.out.println(sb.capacity());
	}
}
 
public class StringBufferEnsureCapacityExample {
	public static void main(String args[]){
		//creating TestStringBuffer object
		TestStringBuffer obj = new TestStringBuffer();
 
		//method call
		obj.ensureCapacityTest();
	}
}

Java StringBuilder Class
==================

Java StringBuilder class is used to create mutable (modifiable) String.

The Java StringBuilder class is same as StringBuffer class except that it is non-synchronized. It is available since JDK 1.5.

Difference between String and StringBuffer
============================

The String class is immutable.	
The StringBuffer class is mutable.

String is slow and consumes more memory when we concatenate too many strings because every time it creates new instance.
StringBuffer is fast and consumes less memory when we concatenate t strings.

String class overrides the equals() method of Object class. So you can compare the contents of two strings by equals() method.	
StringBuffer class doesn't override the equals() method of Object class.
	
String class is slower while performing concatenation operation.	
StringBuffer class is faster while performing concatenation operation.
	

String class uses String constant pool.	
StringBuffer uses Heap memory

Difference between StringBuffer and StringBuilder :
===================================

StringBuffer is synchronized i.e. thread safe. It means two threads can't call the methods of StringBuffer simultaneously.	
StringBuilder is non-synchronized i.e. not thread safe. It means two threads can call the methods of StringBuilder simultaneously.

StringBuffer is less efficient than StringBuilder.	
StringBuilder is more efficient than StringBuffer.
	
StringBuffer was introduced in Java 1.0	
StringBuilder was introduced in Java 1.5

Self-learning :
============

Than how to compare two strings in StringBuffer or StringBuilder to know whether they are equal or not ?

Immutable final class ?

What is a immutable class ?

Java toString() Method :
==================

If you want to represent any object as a string, toString() method comes into existence.

The toString() method returns the String representation of the object.

If you print any object, Java compiler internally invokes the toString() method on the object. So overriding the toString() method, returns the desired output, it can be the state of an object etc. depending on your implementation.

Advantage of Java toString() method
===========================

By overriding the toString() method of the Object class, we can return values of the object, so we don't need to write much code.

Understanding problem without toString() method :
===================================

class Student{  
 int rollno;  
 String name;  
 String city;  
  
 Student(int rollno, String name, String city){  
 this.rollno=rollno;  
 this.name=name;  
 this.city=city;  
 }  
  
 public static void main(String args[]){  
   Student s1=new Student(101,"Raj","lucknow");  
   Student s2=new Student(102,"Vijay","ghaziabad");  
     
   System.out.println(s1);//compiler writes here s1.toString()  
   System.out.println(s2);//compiler writes here s2.toString()  
 }  
}  
Output:

Student@1fee6fc
Student@1eed786

Example of Java toString() method :
===========================

class Student{  
 int rollno;  
 String name;  
 String city;  
  
 Student(int rollno, String name, String city){  
 this.rollno=rollno;  
 this.name=name;  
 this.city=city;  
 }  
   
 public String toString(){//overriding the toString() method  
  return rollno+" "+name+" "+city;  
 }  
 public static void main(String args[]){  
   Student s1=new Student(101,"Raj","lucknow");  
   Student s2=new Student(102,"Vijay","ghaziabad");  
     
   System.out.println(s1);//compiler writes here s1.toString()  
   System.out.println(s2);//compiler writes here s2.toString()  
 }  
}  
Output:

101 Raj lucknow
102 Vijay ghaziabad

In the above program, Java compiler internally calls toString() method, overriding this method will return the specified values of s1 and s2 objects of Student class.

StringTokenizer in Java :
===================

The java.util.StringTokenizer class allows you to break a String into tokens. It is simple way to break a String. 

It is a legacy class of Java.

Constructor	                                                                             Description
StringTokenizer(String str)	                                                          It creates StringTokenizer with specified string.
StringTokenizer(String str, String delim)	                                       It creates StringTokenizer with specified string and delimiter.


Example of StringTokenizer Class :
========================

import java.util.StringTokenizer;  
public class Simple{  
 public static void main(String args[]){  
   StringTokenizer st = new StringTokenizer("my name is khan"," ");  
     while (st.hasMoreTokens()) {  
         System.out.println(st.nextToken());  
     }  
   }  
}  

Note: The StringTokenizer class is deprecated now.

Assignment :
==========

1.) WAP to copy one string to another string.

2.) WAP to convert string to upper case.

3.) WAP to reverse string without using inbuilt reverse method.

4.) WAP to check whether given string is parlindrome or not.




