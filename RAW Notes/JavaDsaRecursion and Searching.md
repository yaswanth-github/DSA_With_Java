Recursion :
===========
Normal way of calling a function :
=======================
A()
{

}

main()
{
   A();
   A();
   A();
  S.O.P("hi");

  
}
=====================

-> A function calling itself directly or indirectly is called as Recursion


-> Without recursion complete understanding, we cannot solve binary trees, Graphs and Backtracking Problems.


A()
{


   A(); // recursive call statement.

}

main()
{

  A();

  S.O.P("hi");

}

Program Example :
==============

public class Main {

	
	static void A()
	{
		A();
		System.out.println("Welcome to java");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		A();
		System.out.println("From Innomatics");
	}

}


Output : StackOverflow error because of infinite recursive calls.

-> To stop this infinite recursive calls, we have to write the base condition logic.

-> Base condition means we are stopping the recursive call execution and we start returning the values to the statements after the recursive call.

-> Every recursive function call will be stored in the stack only.






public class Main {

	               //5
	static void A(int sum)
	{
		if(sum == 5)
		{	
			return;
		}
		  
		A(sum+1);
		System.out.println(n);
			
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		A(1);				
	}

}

Basic Classical Exmple of Recursion :
==========================

Factorial Problem :
===============

  5! = 5*4*3*2*1 = 120

  6! = 6*5*4*3*2*1 = 720

   2! = 2*1 = 2


Program :
============

public class Main {

	               //   1
	static int fact(int n)
	{
		if(n <= 1)
		{	
			return 1;
		}
		else
		{          
			return n*fact(n-1);
		}
		
			
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int output = fact(5);	
		
		System.out.println(output);
		
	}

}


Complex recursion cases :
=================

Recursion inside loops :
=====================

public void recursionInLoop()
{
  for(int i =0;i<size;i++)
  {
      recursionInLoop(); 
   }
}

Application : permutations in a string 

Two recursive calls within itself :
=========================

public void recursionExample()
{

    recursionExample();
    recursionExample();
}

Application : Binary Trees Problems 

Multiple recursion calls within itself :
==============================

public void recursionExample()
{

    recursionExample();
    recursionExample();
    recursionExample();
    recursionExample();
    recursionExample();
    
}

Application : Backtracking Problems

Problem-1:
========

You are given a string and you are supposed to print all the distinct permutations of the string

A B C ->

             A B C, A C B, B A C, B C A, C A B, C B A

Solution:
=======


private void permute(String word, int start, int end) 
    { 
        if (start == end) 
            System.out.println(str); 
        else { 
            for (int i = start; i <= end; i++) { 
                 word = swap(word, start, i); 
                permute(str, start + 1, end); 
                word = swap(word, start, i); 
            } 
        } 
    } 
              
  Implement swap method logic here ?

 Assignment:
=============


1.
Problem Statement :
================

Given n pairs of parenthesis, write a function to generate all combination of well formed parenthesis [Asked in Amazon, walmart labs]

Input :

N = 2 => { }

                  { }

 Solution/output :   {{ }} , { } { } => balanced Parenthesis
                                 
                                  } { { }, } {} { => Unbalanced Parenthesis

Hint : Recursively form all the comnbinations of parenthesis and among all the combinations you need to write the logic in such a way that you need to            choose the balanced parenthesis combinations only.



Algorithm:
===========

I will take one array and firstly I will count no. of openbraces and close braces

if(no. of openbraces > no. of closebraces) -> I will insert 1 close brace in array and call recursively the same function.

if(no. of openbraces > N) -> I will insert 1 open brace in array and call recursively the same function.

if(close brace == N) -> print the array accordingly.


2. 
Problem Statement:
====================

Given a set of array numbers (without duplicates) and a target number (target), find all unique combinations in the array where the numbers sum to target.

The same repeated number may be chosen from array unlimited number of times.

Note:

All numbers (including target) will be positive integers.
The solution set must not contain duplicate combinations.


  4 -> 1 1 1 1     1 1 2     1 3       1 2            2 2


Searching Algorithms :
==================

It is a method or technique or procedure to search an element inside a data structure.

There were 2 searching algorithms :

1. Linear Search

It is a technique where we compare each and every element in a iterative way until it is found. If it is found, we return true otherwise we return false.

Program :
===========


public class LinearSearch {

	public int search(int[] arr,int n, int x)
	{
		for(int i=0;i<n;i++)
		{
			if(arr[i]==x)
			{
				return i;
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[] = {5,1,9,2,10,15,20};
      LinearSearch ls = new LinearSearch();
      System.out.println(ls.search(arr,arr.length, 21));
	}

}


2. Binary Search
=================

In this technique, we are going to find out the mid element. If the searching element is lesser than the mid element than we go and search in the first half elements before the mid element. If the searching element is greater than the mid element, we go and search in the second half elements after the mid element.
Like this we follow the same thing in are recursive way( We repeat the process again and again). 

-> There is always a brute-force approach with high space and Time Complexity

-> But using this, we can make the solution more optimized.

Unsorted -> we can search sequentially.

Sorted -> Best approach is Binary search array.

O(logn) > O(n)

if its Binary tree, then Binary tree search.


In these Following cases, we will use these:

1. If array is sorted

2. If array is increasing and decreasing

3. Sorted array is rotated and then given as input.

4. Array is given as zigzag format.

    arr[] = 2 3 4 5 6 7 8 9 10

Program  using while loop :
====================


public class BinarySearch {
	
	
	public int search(int[] arr,int x)
	{
		int low = 0; 
		int high = arr.length-1; 
		while(low<=high)
		{
			int mid = (high+low);
			if(arr[mid]==x)
			{
				return mid;
			}
			if(x < arr[mid])
			{
				high = mid-1;
			}
			else
			{
				low = mid+1;
			}
		}
		return -1;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,1,9,2,10,12,15};
		
		BinarySearch bs = new BinarySearch();
		
		System.out.println(bs.search(arr, 10));		
		

	}

}

Sorting Algorithms
=================

There are many like merge sort, Quick sort, Heap sort, Counting sort, Insertion sort, Selection sort,....etc

Merge sort we will mostly use in our problems because of O(nlogn).            


