BufferedInputStream :
=====================

Java BufferedInputStream class is used to read information from stream. It internally uses buffer mechanism to make the performance fast.

The important points about BufferedInputStream are:

When the bytes from the stream are skipped or read, the internal buffer automatically refilled from the contained input stream, many bytes at a time.
When a BufferedInputStream is created, an internal buffer array is created.

Example of Java BufferedInputStream
Let's see the simple example to read data of file using BufferedInputStream:


import java.io.*;  
public class BufferedInputStreamExample{    
 public static void main(String args[]){    
  try{    
    FileInputStream fin=new FileInputStream("D:\\testout.txt");    
    BufferedInputStream bin=new BufferedInputStream(fin);    
    int i;    
    while((i=bin.read())!=-1){    
     System.out.print((char)i);    
    }    
    bin.close();    
    fin.close();    
  }catch(Exception e){System.out.println(e);}    
 }    
}  




Time complexity and Space Complexity 
========================================

This is used for understanding the Problems Complexity.

Time Complexity : 
===================

It is the time taken by code or a program to execute based on the input given.



Space Complexity :
====================

The amount of space taken by a program to run based on the input given.



depends upon : Hardware, Processer, OS. However, we can't or will not consider while analysing algosrithms because we do not know the physical
config. of machines where we are using our product.


Big O Notation : 
==================

-> It is the language to analyse time and space complexity.

-> It tells how long a program takes to run.

-> How quickly it grows relative to the input.


 Example :
=============
  
            Time                 Space              
  
   O(1)   Constant time         Constant Space

   O(n)   Linear Time           Linear Space


 How to calculate Time and Space complexity in a program :
==========================================================

1.)

for(int i=0;i<n;i++)    1+3+20+100+1000+1000----------n
{

  S.O.P("welcome");
}


Time Complexity : O(n)


2.) 

for(int i=0;i<n;i=i+2) 10=> 5,50 => 25 , 100 => 50, n=> n/2--------n/2
{
  
  S.O.P("welcome");

}

O(n/2) => O(n)

for(int i=0;i<n;i+10) 1+1+1+-------n/10 
{

   S.o.p("welcome");
}

O(n/10) => O(n)

  
3.)

for(int i=0;i<n+1;i++)  //5 => 6, 9=> 10, 100 => 101 , n=> n+1
{
  for(int j=0;j<n;j++) 5 => 5,9=> 9 , 100 => 100 => n= n
  {

     S.O.P("welcome");
   }
}

Time Complexity : (n+1)(n) => n^2+n => O(n^2) 


4.)

for(int i=0;i<n;i++)  10 => 10, 5=> 5 .... n
{
  for(int j=0;j<i;j++)  1+2+3+4+5+6+7+8+9 =>9 , 5=> 4....... n=> n-1
  {

     S.O.P("welcome");
   }
}

Time Complexity : n(n-1) = n^2 - n => O(n^2)


5.) for(int i=1;i<n; i=i*2) => 1*2 , (2^1*2), (2^2*2), (2^3*2)
    {

        S.O.P("welcome");
    }

Time Complexity : 2^k = n -> k = logn -> O(logn)

Space Complexity :
=======================

Exmaples :
============

1.) int sum(int x, int y, int z)
    {
       int r = x+y+z;
       return r;
    } //16 bytes

Space Complexity : O(1) 

( In this Program, only 4 variables will be there, and therefore size will be constant through out the program)


2.) 

void logical(array, n)
{
  int i,j = 10;

  for(i=0;i<j;i++)
  {

     array[i] = 0;
   }
}

Space Complexity: O(1) ( Since variables are constant)


3.) 
    void abc(array, n)
    {

      int i;
      int arr[n];
      int arr[n][n]; 5*5 => 25, 10 => n*n => n^2 Space Complexity : O(n^2)

      for(int i=0;i<n;i++)
      {
         arr[i] = i;
       }
   }

    psvm(String[] args)
    {

      int arr1[] = new int[10];

      abc(arr1, 100);
    }


   Space Complexity : O(n)






