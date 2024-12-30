
 # Ternary Operators

Ternary operators are a concise way to write conditional expressions.

They consist of three parts: a condition, a value to return if the condition is true, and a value to return if the condition is false.

 * @param num1 The first number to compare.
 * @param num2 The second number to compare.
 * @return The larger of the two numbers.

```java
public int getMax(int num1, int num2) {
    int max = (num1 > num2) ? num1 : num2;
    return max;
}
```

# Working with Arrays and Strings

- An array is a data structure used to store elements of the same data type.
- In array elements are accessed directly by using its index number.
- Stores multiple items

### Advantages of ARRAYS

1. Code Optimization (less code)
2. Random Access
3. Easy to traverse data
4. Easy to manipulate data
5. Easy to sory data

## Types of Arrays

There are `TWO` Types of Arrays:
1. Single Dimensional Array
3. Multi Dimensional Array

### Single Dimensional Array
It is also called as One-Dimensional-Array

It has singel set of square bracket `[....]`

Example:
```java
// declare an array
int[] age;

// allocate memory for array
age = new int[5];
```

### Multi Dimensional Array

It is also called as rectangular array because it has same length of each row.

It is two or three or more dimensional array

It contains more than one row to store data

To assue or storing the data need to use nested loop

```java
int[][] two_d_array = new int[3][2] // 3 Rows and 2 Columns
```
Example:
```java
int marks[][] = {
    {40,50,40,50,40}
    {36,45,41,39,44}
    {49,47,39,42,40}
}

for (int i=0; i < 3; i++ ){
    for(int j=0; j < 5; j++){
        System.out.println(marks[i][j])
    }
}
```


