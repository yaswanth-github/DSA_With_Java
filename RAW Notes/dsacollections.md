Data Structures :
   -> What is a data structure ?
   -> What are the types of Data structures that are there in java ?
   -> What are linear data structures ?
   ->What are non-linear data structures ?
   -> Linear Data structures :
    Array 
    Linked List 
    Stack 
    Queue
    
MySQL Introduction

JDBC Application development
 
What is a Data Structure ?
=======================

Data Structure is a way to store and organize data so that the memory can be used efficiently and data can be accessed effectively.

The data structure name indicates itself that organizing the data in memory.

There are many ways of organizing the data in the memory as we have already seen one of the data structures, i.e., array in Java language. 


int a = 12;

int b = 13;


int a[] = {12,13};

int a[] = new int[7];

a[0] = 123;









Array is a collection of memory elements in which data is stored sequentially, i.e., one after another. In other words, we can say that array stores the elements in a continuous manner.

This organization of data is done with the help of an array of data structures. There are also other ways to organize the data in memory. 

Let's see the different types of data structures.

The data structure is not any programming language like C, C++, java, etc. It is a set of algorithms that we can use in any programming language to structure the data in the memory.

To structure the data in memory, 'n' number of algorithms were proposed, and all these algorithms are known as Abstract data types. These abstract data types are the set of rules.

Types of Data Structures :
==================

1.Primitive data structure => That hold a single value
2.Non-primitive data structure - that can hold many values
                                                       Linear and non linear data structures.


Primitive Data structure
====================

The primitive data structures are primitive data types. The int, char, float, double, and pointer are the primitive data structures that can hold a single value.

Non-Primitive Data structure
=======================

The non-primitive data structure is divided into two types:

1.Linear data structure
2.Non-linear data structure

Linear Data Structure :
==================

The arrangement of data is done in a sequential manner is known as a linear data structure.

The data structures used for this purpose are Arrays, Linked list, Stacks, and Queues.

In these data structures, one element is connected to only one another element in a linear form.

Non Linear Data Structure :
========================

When one element is connected to the 'n' number of elements is known as a non-linear data structure. 

The best example is trees and graphs.

 In this case, the elements are arranged in a random manner.


Data structures can also be classified based on the memory allocation as:

Static data structure: alloted at compile time

 It is a type of data structure where the size is allocated at the compile time. Therefore, the maximum size is fixed.

Dynamic data structure: alloted at run time

It is a type of data structure where the size is allocated at the run time. Therefore, the maximum size is flexible.

Major Operations that are performed on data structures
===============================================

Searching: We can search for any element in a data structure.
Sorting: We can sort the elements of a data structure either in an ascending or descending order.
Insertion: We can also insert the new element in a data structure.
Updation: We can also update the element, i.e., we can replace the element with another element.
Deletion: We can also perform the delete operation to remove the element from the data structure.


Advantages of Data structures
=============================
The following are the advantages of a data structure:

Efficiency: If the choice of a data structure for implementing a particular ADT is proper, it makes the program very efficient in terms of time and space.

Reusability: The data structure provides reusability means that multiple client programs can use the data structure.

Abstraction: The data structure specified by an ADT also provides the level of abstraction. The client cannot see the internal working of the data structure, so it does not have to worry about the implementation part. The client can only see the interface

Linked list :
===========

Linked list is a linear data structure that includes a series of connected nodes. 

Linked list can be defined as the nodes that are randomly stored in the memory. 

A node in the linked list contains two parts, i.e., first is the data part and second is the address part. The last node of the list contains a pointer to the null. 

After array, linked list is the second most used data structure. In a linked list, every link contains a connection to another link.

Representation of a Linked list
=========================

Show diagram 


Why use linked list over array?
========================

Linked list is a data structure that overcomes the limitations of arrays. Let's first see some of the limitations of arrays -

The size of the array must be known in advance before using it in the program.

Increasing the size of the array is a time taking process. It is almost impossible to expand the size of the array at run time.

All the elements in the array need to be contiguously stored in the memory. Inserting an element in the array needs shifting of all its predecessors.

Linked list is useful because -
======================

It allocates the memory dynamically. All the nodes of the linked list are non-contiguously stored in the memory and linked together with the help of pointers.

In linked list, size is no longer a problem since we do not need to define its size at the time of declaration. List grows as per the program's demand and limited to the available memory space.

Types of Linked list
=================

Linked list is classified into the following types -

Singly-linked list - Singly linked list can be defined as the collection of an ordered set of elements. A node in the singly linked list consists of two parts: data part and link part. Data part of the node stores actual information that is to be represented by the node, while the link part of the node stores the address of its immediate successor.

Doubly linked list - Doubly linked list is a complex type of linked list in which a node contains a pointer to the previous as well as the next node in the sequence. Therefore, in a doubly-linked list, a node consists of three parts: node data, pointer to the next node in sequence (next pointer), and pointer to the previous node (previous pointer).

Circular singly linked list - In a circular singly linked list, the last node of the list contains a pointer to the first node of the list. We can have circular singly linked list as well as circular doubly linked list.

Circular doubly linked list - Circular doubly linked list is a more complex type of data structure in which a node contains pointers to its previous node as well as the next node. Circular doubly linked list doesn't contain NULL in any of the nodes. The last node of the list contains the address of the first node of the list. The first node of the list also contains the address of the last node in its previous pointer.


Advantages of Linked list
==========================
The advantages of using the Linked list are given as follows -

Dynamic data structure - The size of the linked list may vary according to the requirements. Linked list does not have a fixed size.

Insertion and deletion - Unlike arrays, insertion, and deletion in linked list is easier. Array elements are stored in the consecutive location, whereas the elements in the linked list are stored at a random location. To insert or delete an element in an array, we have to shift the elements for creating the space. Whereas, in linked list, instead of shifting, we just have to update the address of the pointer of the node.

Memory efficient - The size of a linked list can grow or shrink according to the requirements, so memory consumption in linked list is efficient.

Implementation - We can implement both stacks and queues using linked list.

Disadvantages of Linked list
=======================
The limitations of using the Linked list are given as follows -

Memory usage - In linked list, node occupies more memory than array. Each node of the linked list occupies two types of variables, i.e., one is a simple variable, and another one is the pointer variable.

Traversal - Traversal is not easy in the linked list. If we have to access an element in the linked list, we cannot access it randomly, while in case of array we can randomly access it by index. For example, if we want to access the 3rd node, then we need to traverse all the nodes before it. So, the time required to access a particular node is large.

Reverse traversing - Backtracking or reverse traversing is difficult in a linked list. In a doubly-linked list, it is easier but requires more memory to store the back pointer

Applications of Linked list
========================
The applications of the Linked list are given as follows -

With the help of a linked list, the polynomials can be represented as well as we can perform the operations on the polynomial.

A linked list can be used to represent the sparse matrix.

The various operations like student's details, employee's details, or product details can be implemented using the linked list as the linked list uses the structure data type that can hold different data types.

Using linked list, we can implement stack, queue, tree, and other various data structures.

The graph is a collection of edges and vertices, and the graph can be represented as an adjacency matrix and adjacency list. 

If we want to represent the graph as an adjacency matrix, then it can be implemented as an array. If we want to represent the graph as an adjacency list, then it can be implemented as a linked list.

A linked list can be used to implement dynamic memory allocation. The dynamic memory allocation is the memory allocation done at the run-time.

Operations performed on Linked list
==============================
The basic operations that are supported by a list are mentioned as follows -


Insertion - This operation is performed to add an element into the list.
Deletion - It is performed to delete an operation from the list.
Display - It is performed to display the elements of the list.
Search - It is performed to search an element from the list using the given key.

Complexity of Linked list
Now, let's see the time and space complexity of the linked list for the operations search, insert, and delete.

1. Time Complexity
==================
Operations	Average case time complexity	Worst-case time complexity
Insertion	O(1)	                                                O(1)
Deletion	O(1)	                                                O(1)
Search	O(n)	                                                 O(n)
Where 'n' is the number of nodes in the given tree.

The space complexity of linked list is O(n).

Singly Linked list
===============

It is the commonly used linked list in programs.
 
If we are talking about the linked list, it means it is a singly linked list.
 
The singly linked list is a data structure that contains two parts, i.e., one is the data part, and the other one is the address part, which contains the address of the next or the successor node. The address part in a node is also known as a pointer.


In a singly linked list, we could traverse only in one direction, because each node contains address of the next node and it doesn't have any record of its previous nodes.

 However, doubly linked list overcome this limitation of singly linked list. Due to the fact that, each node of the list contains the address of its previous node, we can find all the details about the previous node as well by using the previous address stored inside the previous part of each node.

Doubly Linked List :
===============

Memory Representation of a doubly linked list


Memory Representation of a doubly linked list is shown in the following image. 
Generally, doubly linked list consumes more space for every node and therefore, causes more expansive basic operations such as insertion and deletion. 
However, we can easily manipulate the elements of the list since the list maintains pointers in both the directions (forward and backward).

Circular Singly Linked List :
=====================

In a circular Singly linked list, the last node of the list contains a pointer to the first node of the list. We can have circular singly linked list as well as circular doubly linked list.

We traverse a circular singly linked list until we reach the same node where we started. The circular singly liked list has no beginning and no ending. There is no null value present in the next part of any of the nodes.


Circular Doubly Linked List
=======================

Circular doubly linked list is a more complexed type of data structure in which a node contain pointers to its previous node as well as the next node.

 Circular doubly linked list doesn't contain NULL in any of the node.

 The last node of the list contains the address of the first node of the list.

 Due to the fact that a circular doubly linked list contains three parts in its structure therefore, it demands more space per node and more expensive basic operations. 

However, a circular doubly linked list provides easy manipulation of the pointers and the searching becomes twice as efficient.

 The first node of the list also contain address of the last node in its previous pointer.


Today's Agenda :
============

Revise Arraylist and LinkedList
Stack 
     What is Stack ?
     What are the operations that are performed on the Stack?
      What are the applications of Stack ?
      What are the predefined methods that are there in the Stack ?
       And Programs related to Stack ?   

Queue.

        What is Queue ?
        What are the operations that are performed on the Queue ?
        What are the applications of Queue ?
         What are the types of Queues ?
         What are the predefined methods that are there in Queue ?
          And Programs related to Queues ?










Stack 
=======

What is a Stack?

A Stack is a linear data structure that follows the LIFO (Last-In-First-Out) principle.

 Stack has one end(top), whereas the Queue has two ends (front and rear).
 
It contains only one pointer top pointer pointing to the topmost element of the stack. 

Whenever an element is added in the stack, it is added on the top of the stack,
 and the element can be deleted only from the top of the  stack.

 In other words, a stack can be defined as a container in which insertion and deletion 
can be done from the one end known as the top of the stack.

Some key points related to stack
========================
It is called as stack because it behaves like a real-world stack, piles of books, etc.

A Stack is an abstract data type with a pre-defined capacity, 
which means that it can store the elements of a limited size.

It is a data structure that follows some order to insert and delete the elements, and 
that order can be LIFO or FILO.

Working of Stack
===========

show diagram 


Standard Stack Operations -push,pop,peek
=========================
The following are some common operations implemented on the stack:

push(): When we insert an element in a stack then the operation is known as a push. If the stack is full then the overflow condition occurs.

pop(): When we delete an element from the stack, the operation is known as a pop. If the stack is empty means that no element exists in the stack, this state is known as an underflow state.

isEmpty(): It determines whether the stack is empty or not.

isFull(): It determines whether the stack is full or not.

peek(): It returns the element at the top position.

count(): It returns the total number of elements available in a stack.

change(): It changes the element at the given position.

display(): It prints all the elements available in the stack.


PUSH operation
===================
The steps involved in the PUSH operation is given below:

Before inserting an element in a stack, we check whether the stack is full.
If we try to insert the element in a stack, and the stack is full, then the overflow condition occurs.
When we initialize a stack, we set the value of top as -1 to check that the stack is empty.
When the new element is pushed in a stack, first, the value of the top gets incremented, i.e., top=top+1, 
and the element will be placed at the new position of the top.
The elements will be inserted until we reach the max size of the stack.


POP operation
===============
The steps involved in the POP operation is given below:

Before deleting the element from the stack, we check whether the stack is empty.
If we try to delete the element from the empty stack, then the underflow condition occurs.
If the stack is not empty, we first access the element which is pointed by the top
Once the pop operation is performed, the top is decremented by 1, i.e., top=top-1.

Applications of Stack
================

String reversal

UNDO/REDO

Recursion

DFS(Depth First Search)

Backtracking

Expression conversion

Memory management

Real time examples are CD Rack, Pile of books.

Stack Implementations :
================

Stack can be implemented through

1.Array

2.Linked List :

Instead of using array, we can also use linked list to implement stack. 
Linked list allocates the memory dynamically. 
However, time complexity in both the scenario is same for all the operations i.e. push, pop and peek.

In linked list implementation of stack, the nodes are maintained non-contiguously in the memory. 
Each node contains a pointer to its immediate successor node in the stack. 
Stack is said to be overflown if the space left in the memory heap is not enough to create a node.

Queue :
========

1. A queue can be defined as an ordered list which enables insert operations to be performed at 
one end called REAR and delete operations to be performed at another end called FRONT.

2. Queue is referred to be as First In First Out list.

3. For example, people waiting in line for a rail ticket form a queue.

Applications of Queue:
==================

Queues are widely used as waiting lists for a single shared resource like printer, disk, CPU.

Queues are used in asynchronous transfer of data (where data is not being transferred at the same rate between two processes) for eg. pipes, file IO, sockets.

Types of Queue
=============

There are four different types of queue that are listed as follows -

Simple Queue or Linear Queue
Circular Queue
Priority Queue
Double Ended Queue (or Deque)

Simple Queue or Linear Queue
=====================

In Linear Queue, an insertion takes place from one end while the deletion occurs from another end. 
The end at which the insertion takes place is known as the rear end, and the end at which the deletion takes place is known as front end. 
It strictly follows the FIFO rule.

Drawback of Linear Queue :
=====================

The major drawback of using a linear Queue is that insertion is done only from the rear end. 
If the first three elements are deleted from the Queue, we cannot insert more elements
 even though the space is available in a Linear Queue. 
In this case, the linear Queue shows the overflow condition 
as the rear is pointing to the last element of the Queue.

Queues are used as buffers in most of the applications like MP3 media player, CD player, etc.

Queue are used to maintain the play list in media players in order to add and remove the songs from the play-list.
Queues are used in operating systems for handling interrupts.

Circular Queue:
===========

In Circular Queue, all the nodes are represented as circular. It is similar to the linear Queue except that the last element of the queue is connected to the first element. 
It is also known as Ring Buffer, as all the ends are connected to another end. 

Advantage of circular queue :
======================
The drawback that occurs in a linear queue is overcome by using the circular queue. If the empty space is available in a circular queue, the new element can be added in an empty space by simply incrementing the value of rear. The main advantage of using the circular queue is better memory utilization.

Priority Queue
==============

It is a special type of queue in which the elements are arranged based on the priority.
 It is a special type of queue data structure in which every element has a priority associated with it. 
Suppose some elements occur with the same priority, they will be arranged according to the FIFO principle. 

insertion in priority queue takes place based on the arrival, while deletion in the priority queue occurs based on the priority. Priority queue is mainly used to implement the CPU scheduling algorithms.

There are two types of priority queue that are discussed as follows -

Ascending priority queue - In ascending priority queue, elements can be inserted in arbitrary order, 
but only smallest can be deleted first. Suppose an array with elements 7, 5, and 3 in the same order, so, insertion can be done with the same sequence, but the order of deleting the elements is 3, 5, 7.

Descending priority queue - In descending priority queue, elements can be inserted in arbitrary order, but only the largest element can be deleted first. Suppose an array with elements 7, 3, and 5 in the same order, so, insertion can be done with the same sequence, but the order of deleting the elements is 7, 5, 3.

Deque (or, Double Ended Queue)
======================

In Deque or Double Ended Queue, insertion and deletion can be done from both ends of the queue 
either from the front or rear. 

It means that we can insert and delete elements from both front and rear ends of the queue. 

Deque can be used as a palindrome checker means that if we read the string from both ends, then the string would be the same.

Deque can be used both as stack and queue as it allows the insertion and deletion operations on both ends. 

Deque can be considered as stack because stack follows the LIFO (Last In First Out) principle in which insertion and deletion both can be performed only from one end.

 And in deque, it is possible to perform both insertion and deletion from one end, and Deque does not follow the FIFO principle.

There are two types of deque that are discussed as follows -

Input restricted deque - As the name implies, in input restricted queue, insertion operation can be 
performed at only one end, while deletion can be performed from both ends.

Output restricted deque - As the name implies, in output restricted queue, deletion operation 
can be performed at only one end, while insertion can be performed from both ends.

Operations performed on queue:
=======================

The fundamental operations that can be performed on queue are listed as follows -

Enqueue: The Enqueue operation is used to insert the element at the rear end of the queue. It returns void.

Dequeue: It performs the deletion from the front-end of the queue. It also returns the element which has been removed from the front-end. It returns an integer value.

Peek: This is the third operation that returns the element, which is pointed by the front pointer in the queue but does not delete it.

Queue overflow (isfull): It shows the overflow condition when the queue is completely full.
Queue underflow (isempty): It shows the underflow condition when the Queue is empty, i.e., no elements are in the Queue.

Ways to implement the queue
====================

There are two ways of implementing the Queue:

Implementation using array: The sequential allocation in a Queue can be implemented using an array.

Implementation using Linked list: The linked list allocation in a Queue can be implemented using a linked list.

Drawback of array implementation
===========================
Although, the technique of creating a queue is easy, but there are some drawbacks of using this technique to implement a queue.

Memory wastage : The space of the array, which is used to store queue elements, can never be reused to store the elements of that queue because the elements can only be inserted at rear end and the value of rear might be so high so that, all the space before that, can never be filled.

Deciding the array size

Linked List representation :
=======================
The storage requirement of linked representation of a queue with n elements is o(n) 
while the time requirement for operations is o(1).

In the linked queue, there are two pointers maintained in the memory i.e. front pointer and rear pointer.
 The front pointer contains the address of the starting element of the queue while the rear pointer contains the address of the last element of the queue.
================================================
Trees
Graphs


Collections or Collection Framework in Java :
================================

1995 -> Beta and Alpha versions of java

 java is open source

  1996 - Java 1.0 or JDK 1.0

              Java 1.1

   Joshwa -> suggested collections feature to sun microsystem -> found out that there is a disadvantage in java that is with arrays like java is facing difficulty whenever we are working with large volume of data in one place and to peform operations on that data is also a big problem for them

  Arrays -> disadvantages -> contiguous memory allocation
                                                   size is also fixed
                                                   Homogeneous data type elements

   -> He came up with API / Heirarchy of different classes called as Collections

   From Java 1.2 => added collection framework into java

   classes -> Mainly 7 classes -> so many ibuilt methods in each class. and we will use them.

  collection framework -> set of classes and interfaces together

  The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.

  Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, updation, and deletion.

  Java Collection means a single unit of objects. Java Collection framework provides many interfaces (Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).

 Note : All the collections are part of java.util package 

 Note : Inside a Collection, each and every data is called as object.

Any group of individual objects which are represented as a single unit is known as a collection of objects. 

What is a Framework?
====================

A framework is a set of classes and interfaces which provide a ready-made architecture. In order to implement a new feature or a class, there is no need to define a framework. However, an optimal object-oriented design always includes a framework with a collection of classes such that all the classes perform the same kind of task. 

What is Collection framework ? ->> java.util;
=========================

The Collection framework represents a unified architecture for storing and manipulating a group of objects. It has:

Interfaces and its implementations, i.e., classes
Algorithm

Collection-Heirarchy - (show image)

*Methods of a collection interface :
============================
 -> the Collection interface builds the foundation on which the collection framework depends.

 -> The Collection interface is the interface which is implemented by all the classes in the collection framework. It declares the methods that every collection will have.


class A
{


}

class B
{


}

interface C
{


}

interface D
{

}

interface C  implements D
{

}

class B implements C extends A

{


}





Iterator interface(java.util)
===============

Iterator interface provides the facility of iterating the elements in a forward direction only.

Methods of Iterator interface
=========================

There are only three methods in the Iterator interface. They are:

No.	Method	                                       Description
1	public boolean hasNext()	It returns true if the iterator has more elements otherwise it returns false.
2	public Object next()	                   It returns the element and moves the cursor pointer to the next element.
3	public void remove()	                   It removes the last elements returned by the iterator. It is less used.

Iterable Interface (java.lang)
===============

-> The Iterable interface is the root interface for all the collection classes. 
-> The Collection interface extends the Iterable interface and therefore all the subclasses of Collection interface also implement the Iterable interface.

It contains only one abstract method. i.e.,

Iterator<T> iterator()  
It returns the iterator over the elements of type T.

7 Classes :
===========

   1.) ArrayList

    2.) LinkedList

     3.) ArrayDeque
    
     4.) PriorityQueue
      
      5.) TreeSet

      6.) HashSet

      7.) LinkedHashSet

1.) Arraylist
============

-> Arraylist functionality is same like an array.

-> It internally makes use of dynamic Array Data Structure.

-> It implements List Interface.

 -> This ArrayList will grow or shrink at rear end based on the number of elements.

 -> Mixture(Heterogeneous type- Any type of data can be stored) of data can be stored.  

  -> retains order of insertion. 

  -> It is also based on indexed approach

 -> Duplicates are allowed in ArrayList.

  -> index based approach in ArrayList is not recommended since shifting of elements is time consuming.

Program :
=========

import java.util.ArrayList;


public class LaunchArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		ArrayList ar = new ArrayList();    
		
		ar.add(12);
		ar.add("LPU");
		ar.add('B');
		ar.add(25.5);
		
		System.out.println(ar.toString());
		
		ArrayList ar2 = new ArrayList();
		
		ar2.add(10);
		ar2.add(12);
		ar2.add(16);
		
		System.out.println(ar2);
		
		ar.addAll(ar2);
		
		System.out.println(ar);
		
		boolean b = ar2.contains(12);
		
		System.out.println(b);
		
		Object o = ar.get(2);
		
		System.out.println(o);
		
		int c = ar.size();
		
		System.out.println(c);
		
		
//		ArrayList ar3 = new ArrayList();
//		
//		ar3.add(1, 100);
//		
//		System.out.println(ar3); exception
		
		System.out.println(ar.getClass());
		
		ar2.ensureCapacity(5);
		
		System.out.println(ar2);
		
		System.out.println(ar2.size());
		
		ar2.trimToSize();
		
    //assigment for today : Practice other methods
		
		
	}

}

Why to use Array over ArrayList ?
==============================

=> Array is faster than ArrayList and also efficient Whenever size/capacity is known already

=> In our aplication, if only one type of data is generated.

=> If i wanted to store primitives.

  When ArrayList is required ?
=============================
   
When we want to use dynamic data and Heterogeneous Data.




    Iterable

    Collection

    List

     ArrayList

      -Dynamic Array Data Structure
      - Homogeneous and Hetergeneous type of data
      - Insertion order is maintained(at the rear end)
      -Duplicates are allowed
      -Null values are also allowed
      -Index based accessing is allowed but not recommended because of shifting of elements
      

     LinkedList

     - Doubly Linked List Data Structure
     -Homogeneous and Hetergeneous type of data
     -Insertion order is maintained(at the rear end)
      -Duplicates are allowed
      -Null values are also allowed
      -Index based accessing is allowed and it is recommended because no shifting of elements will happen
     - Searching operation is time consuming in the case of linked list.

     Vector

      Stack

    Queue

     PriorityQueue

    Deque
     
     LinkedList

      ArrayDeque

    Set

      HastSet

      LinkedHashSet

    SortedSet

       TreeSet















2. LinkedList
================

-> This LinkedList in collection internally uses Doubly Linked List Data structure.

 -> It implements both List and Dequeue Intefaces.

1. Single Linked List

2. Double Linked List

3. Circular Linked List.

-> It makes use of Disperse Memory locations in RAM

-> Stores both homogeneous and heterogeneous type of data.

-> We can add one collection to another using addAll() method.

-> Order of insertion is maintained.

-> Duplicates are allowed in linked list.

-> In LinkedList , Shifting of elements will not happen.

-> So, Index based approach is recommended

-> We can conclude that we can add elements at frontend, at rearend, at middlend or at any position using index.

-> No demand of contiguous memory allocation.

Note: All the Node creation and address maintainence is totally manged by JVM since java does not support the concept of pointers for programmers this only is the reason to say is "abstract high level language"(No worry of internal details).

Program :
==========


import java.util.ArrayList;
import java.util.LinkedList;


public class LaunchArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		LinkedList ll1 = new LinkedList();
		
		ll1.add(10);
		
		ll1.add(100);
		
		ll1.add("Roshith");
		
		ll1.add("LPU");
		
		ll1.add('A');
		
		System.out.println(ll1);
		
		ll1.addFirst(12);
		
		ll1.addLast(10);
		
		System.out.println(ll1);
		
		ArrayList ar1 = new ArrayList();
		
		ar1.add(1000);
		
		ar1.add(2000);
		
		ar1.add(3000);
		
		
		ll1.addAll(ar1);
		
		
		System.out.println(ll1);
		
		ll1.add(1, 11);
		
		System.out.println(ll1);
		
		LinkedList ll2 = new LinkedList();
		
		ll2.add(10);
		
		ll2.offer(11);
		
		System.out.println(ll2);			
		
		
	}

}



   Difference between add() and offer() :
===============================

  If you use add() method -> That object will be added definently into our collection.


   If you use offer() method -> The object may or may not be added into our collection. It purely depends upon                                                     memory availability. 
=================================================================================

3. ArrayDequeue :
===============

-> It follows Double ended Queue Data Structure.

-> It implements Deque Interface.

-> Duplicates are allowed

-> We can insert or delete the elements from rear end and front end only but not at the middle end or at a specific position.

-> Here index based accessing is not allowed. 

 -> Order of insertion is maintained.
-> Null values are not allowed.

Program :
========

import java.util.ArrayDeque;

public class LaunchArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		ArrayDeque ad = new ArrayDeque();
		
		ad.add(10);
		
		ad.add(100);
		
		ad.add("IT");
		
		ad.add("IT");
		
		ad.addFirst(100);
		
		ad.addLast(2000);
		
		System.out.println(ad);
				
	}

}

PriorityQueue :
============

-> It implements Queue Interface.

-> In the backend it is based on Minimum Heap Data Structure.

-> Where highest Priority element is readily avaiable at the front of the collection.

-> Since order of insertion is not retained, index based approach is not possible.(is not allowed).

-> Duplicates are also allowed.

-> Contiguous Memory Allocation will be there.

-> Null values are not allowed.


Program :
======

import java.util.*;


public class LaunchArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    PriorityQueue pr = new PriorityQueue(); 
    
    
    //min heap data structure.
    
    pr.add(1000);
    pr.add(100);
    pr.add(250);
    pr.add(1250);
    pr.add(750);
    pr.add(750);
    
    System.out.println(pr);		
	}

}

O/P : [100, 750, 250, 1250, 1000, 750]



TreeSet :
===========

-> It implements Set Interface.

-> Actually, in a Set , Duplicates are not allowed. So, In TreeSet also, duplicates are not allowed.

-> In the backend, it is based out of or it follows Balanced Search Tree Data Structure ( It also internally follows Red- Black Algorithm and in-order traversal) 

Assignment : Practice PreOrder and PostOrder Traversal

-> It gives the output in the sorted i.e., ascending order.

-> Index based accessing is not allowed.

-> Null values are not allowed.

Program :
==========

import java.util.*;


public class LaunchArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TreeSet ts = new TreeSet();
      
      ts.add(100);
      ts.add(50);
      ts.add(150);
      ts.add(25);
      ts.add(75);
      ts.add(125);
      ts.add(175);
      
      System.out.println(ts);		
	
        }

}

Output : [25, 50, 75, 100, 125, 150, 175]

Some Important TreeSet Methods
===================================

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
	TreeSet tr = new TreeSet();
	
	tr.add(0);
	tr.add(150);
	tr.add(100);
	tr.add(20);
	tr.add(15);
	tr.add(801);
	
	//System.out.println(tr);
	
    System.out.println(tr.higher(21));
	
	System.out.println(tr.ceiling(21)); //celing - top  flooring - down
	
	System.out.println(tr.lower(21));
	
	System.out.println(tr.floor(21));
			
		
	}
}

Higher Method : 
===============

It will retrieve the next higher value nearest to the specified object in the collection irrespective
of the presence of the object in collection.


Ceiling Method :
===================

It will give the nearest higher object only if the specified object is not present, if its present, 
it will just give the same value.


Same like these only but opposite , there were Lower and floor methods were there.

Assignment2 : Write the differences for higher(), ceiling(), lower(), floor().


Searching operation will be better when compared to before collection classes i.e., O(logn) when 
it is only balanced binary search tree. If it is skewed tree time complexity will be higher i.e., O(n).

Assignment3 : Practice methods of ArrayDeque, PriorityQueue, TreeSet


HashSet and LinkedHashSet :
=============================

-> These two classes implements Set Interface.

-> Internally these both classes uses HashTable (HashFunction) that is backed by Hashing algorithm.

-> General view of working of Hashing Technique :

They will write formula in HashFunction, so that each element goes and sit in the HashTable at a specified
bucket( but only 1 data in one bucket).

-> During searching operation also, it searches only one bucket based on the formula, so searching will
    be faster and Time Complexity is O(1).

-> In HashSet insertion order is not maintained whereas in LinkedHashSet insertion order is maintained. 

Assignment-1: Read out hashing algorithm and know the differences between HashSet and LinkedHashSet


Program :
==========

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
	LinkedHashSet hs = new LinkedHashSet();
	
	hs.add(121);
	hs.add(100);
	hs.add(200);
	hs.add(20);
	hs.add(12);
	
	System.out.println(hs);
	
	if(hs.contains(121))
	{
	    System.out.println("It is there");
	}
		
	}
}


List l = new ArrayList();

LinkedList l = new LinkedList();

  Different ways of accessing the data :
=================================

-> How to iterate or how to access the objects inside a collection ?

There are 3 ways :   for, foreach, iterator


for  loop:
============
 retrieval inside a collection is possible only when index based accessing is there.

-> ArrayList and LinkedList will only support for loop retrieval.

enhanced for loop or foreach :
====================

It is supported by every collection class.

for(int a: hs)
{
    Sysout(a);
}

iterator() method :
==============

-> This is supported by every collection class since Iterable is the top interface for every collection class.

-> iterator() method iterates the objects in forward direction.

->listIterator() method iterates the objects in reverse direction.

->descendingIterator() method also does the same thing(reverse order) but it is only present in LinkedList, ArrayDeque, TreeSet.

Program :
===========

import java.util.*;


public class LaunchArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList al = new ArrayList();
      
      al.add(1000);
      al.add(150);
      al.add(2000);
      al.add(300);
      al.add(400);
      al.add(500);
      al.add("LPU");
      al.add("punjab");
      
      
	  //for loop
//      for(int i=0;i<al.size();i++)
//      {
//    	  System.out.println(al.get(i));
//      }
      
      System.out.println("********");
      
      for(Object o : al)
      {
    	  System.out.println(o);
      }
      
      System.out.println("*****");
      
      Iterator itr = al.iterator();
      
      while(itr.hasNext())
      {
    	  System.out.println(itr.next());
      }
      
      System.out.println("******");
      
     ListIterator litr =al.listIterator(al.size());
     
     while(litr.hasPrevious())
     {
    	 System.out.println(litr.previous());
     }
      
      
     LinkedList ll = new LinkedList();
     
     ll.add(1000);
     ll.add(150);
     ll.add(2000);
     ll.add(300);
     ll.add(400);
     ll.add(500);
     ll.add("LPU");
     ll.add("punjab");
     
     Iterator idtr1 = ll.descendingIterator(); //LinkedList, ArrayDeque,
      
     System.out.println("It is descending iterator");       //TrreSet
     
     while(idtr1.hasNext())
     {
    	 System.out.println(idtr1.next());
     }
      		
		
	}

}

Legacy classes : (JDK 1.0)
=============

Vector == ArrayList
==================

-> Vector is a special type of ArrayList that defines a dynamic array. 
-> ArrayList is not synchronized while vector is synchronized. The vector class has several legacy methods that are not present in the collection framework. 
-> Vector implements Iterable after the release of JDK 5 that defines the vector is fully compatible with collections, and vector elements can be iterated by the for-each loop.

Dictionary

Stack
==========

Stack class extends Vector class, which follows the LIFO(LAST IN FIRST OUT) principal for its elements. 
The stack implementation has only one default constructor, i.e., Stack().

 Stack() : It is used to create a stack without having any elements.

There are the following methods can be used with Stack class:

The push() method is used to add an object to the stack. It adds an element at the top of the stack.
The pop() method is used to get or remove the top element of the stack.
The peek() method is similar to the pop() method, but it can't remove the stack's top element using it.
The empty() method is used to check the emptiness of the stack. It returns true when the stack has no elements in it.
The search() method is used to ensure whether the specified object exists on the stack or not.

These all legacy classes were synchronised, means multithreading wont be there and all also all will have different functionality.

How to iterate over the elements over the leagcy class instead of iterator :
===================================================

-> Enumeration Interface is like iterator in a legacy class performs same functionality.

public class LaunchArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v = new Vector();
		
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		
		Enumeration e = v.elements();
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
			
		
	}

}

Map(I) :
======
    Key     Value
   10 Rajesh -> Entry

    11 Sunil

    12 Roshith

-> The Map is not a part of Collection. This has seperate heirarchy.

Map 
=== 
=> It is not a child interface of Collection.
=> If we want to represent group of Objects as key-value pair then we need to go  for Map. 
=> Both keys and values are Objects only 
=> Duplicate keys are not allowed but values are allowed. 
=> Key-value pair is called as "Entry". 
refer: MapHierarchy.png 
Map methods 
------------------- 
1. It contains 12 methods which is common for all the implementation Map Objects 

a. Object put(Object key,Object value) // To add key,value pair

 b. void putAll(Map m) // To add another map 

c. Object get(Object key) // To get the value based on key 

d. Object remove(Object key) //To remove an entry based on key 

e. boolean containsKey(Object key) //Check whether it contains key or not 

f. boolean containsValue(Object value)//Check whether it contains value or not 

g. boolean isEmpty() //To check wheter the Map is empty or not 

h. int size() //To get the size of a Map 

i. void clear() //To remove all Entry from a map 
views of a Map 

j.Set keySet() //Convert the key's of Map into Set for reading purpose 

k.Collection values() //Convert the values of Map into Collection for reading purpose 

l.Set entrySet() // Convert whole Entry of Map into Set for reading purpose. 

Entry(I) 
======= 
 1. Each key-value pair is called Entry. 
 2. Without existence of Map,there can't be existence of Entry Object. 
 3. Interface entry is defined inside Map interface. 

interface Map{ 
interface Entry{ 
Object getKey(); //To get the key using Map.Entry Object 
Object getValue();//To get the value using Map.Entry Object 
Object setValue(Object newValue);//To update the value Using Map.Entry  Object 
} 
} 

HashMap 
======= 
 Underlying DataStructure: Hashtable 
 insertion order : not preserved 
 duplicate keys : not allowed
 duplicate values : allowed 
 Heterogenous objects : allowed 
 null insertion : for keys allowed only once,but for values can be any no. 
 implementation interface: Serializable,Cloneable. 


Difference b/w HashMap(c) and Hashtable(c) 
====================================== 
 HashMap => All the methods are not synchronized. 
 Hashtable => All the methods are synchronzied. 
 HashMap => At a time multiple threads can operate on a Object, so it is not  ThreadSafe. 
 Hashtable => At a time only one Thread can operate on a Object, so it is  ThreadSafe. 
 HashMap => Pefromance is high. 
 Hashtable => Performance is low. 
 HashMap => null is allowed for both keys and values. 
 Hashtable => null is not allowed for both keys and values,it would result in  NullPointerException. 
 HashMap => Introduced in 1.2v 
 Hashtable => Introduced in 1.0v 
Constructors 
============ 
 1. HashMap hm=new HashMap() 
 //default capacity => 16, loadfactor => 0.75(upon increase of data by  75% automatically 
 size of HashMap will be doubled) 
 2. Hashmap hm=new HashMap(int capacity); 
  
 3. HashMap hm=new HashMap(int capacity,float fillratio); 
 4. HashMap hm=new HashMap(Map m); 
eg#1. 
eg#1. 
import java.util.*; 
class Test  
{ 
public static void main(String[] args)  
{ 
HashMap hm = new HashMap(); 
hm.put(10,"sachin"); 
hm.put(7,"dhoni"); 
hm.put(18,"kohli"); 
hm.put(45,"rohith"); 
System.out.println(hm);//hm.toString() will be called 
Set s = hm.keySet();//To get the keys from Map 
System.out.println(s); 
System.out.println(s.getClass().getName()); 
System.out.println();
Collection c = hm.values();//To get the values from Map 
System.out.println(c); 
System.out.println(c.getClass().getName()); 
System.out.println(); 
Set mapData = hm.entrySet();//To get the K,V from Map as Set 
System.out.println(mapData); 
System.out.println(mapData.getClass().getName()); 
System.out.println(); 
Iterator itr = mapData.iterator(); 
while(itr.hasNext()){ 
//Object is return type of next(), i am converting to Map.Entry  Object to call methods of Entry interface 
// The data of Map.Entry is stored as object 
Map.Entry data =(Map.Entry)itr.next(); 
System.out.println(data.getClass().getName()); 
System.out.println(data.getKey() + ": " + data.getValue()); 
if (data.getKey().equals(10)) 
{ 
data.setValue("SRT"); 
} 
} 
System.out.println(); 
System.out.println(hm); 
} 
} 
LinkedHashMap 
============= 
 => It is the child class of HashMap. 
 => It is same as HashMap,but with the following difference 
 HashMap => underlying datastructure is hashtable.  LinkedHashMap => underlying datastructure is LinkedList + hashtable. 
 HashMap => insertion order not preserved. 
 LinkedHashMap => insertion order preserved. 
 HashMap => introduced in 1.2v 
 LinkedHashMap => introduced in 1.4v 
eg#1. 
import java.util.*; 
class Test  
{ 
public static void main(String[] args)  
{ 
LinkedHashMap hm = new LinkedHashMap(); 
hm.put(10,"sachin"); 
hm.put(7,"dhoni"); 
hm.put(18,"kohli"); 
hm.put(45,"rohith"); 
System.out.println(hm);//hm.toString() will be called 
System.out.println();
Set s = hm.keySet();//To get the keys from Map 
System.out.println(s); 
System.out.println(s.getClass().getName()); 
System.out.println(); 
Collection c = hm.values();//To get the values from Map 
System.out.println(c); 
System.out.println(c.getClass().getName()); 
System.out.println(); 
Set mapData = hm.entrySet();//To get the K,V from Map as Set System.out.println(mapData); 
System.out.println(mapData.getClass().getName()); 
System.out.println(); 
Iterator itr = mapData.iterator(); 
while(itr.hasNext()){ 
Map.Entry data =(Map.Entry)itr.next(); 
System.out.println(data.getKey() + ": " + data.getValue()); 

if (data.getKey().equals(10)) 
{ 
data.setValue("SRT"); 
} 
} 
System.out.println(); 
System.out.println(hm); 
} 
} 
import java.util.*; 
class Test  
{ 
public static void main(String[] args)  
{ 
HashMap h = new HashMap(); 
//Creating a key 
Integer i1= new Integer(10); 
Integer i2= new Integer(10); 
//Adding the data to HashMap 
h.put(i1,"sachin"); 
h.put(i2,"Messi"); 
System.out.println(h);//{10=Messi} 
} 
} 
IdentityHashMap 
=============== 
 It is same as HashMap, with the following differences 
a. In case of HashMap,jvm will use equals() to check whether the keys are 
duplicated or not. 
 equals() => meant for ContentComparison. 
b. In case of IdentityHashMap,jvm wil use == operator to identify whether the keys  are duplicated. 
 or not. 

Difference between Collection and collections ? -> Self learning

