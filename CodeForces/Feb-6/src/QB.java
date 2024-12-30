import java.util.Scanner;

public class QB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases-- > 0) {
            int length = scanner.nextInt();
            int[] trace = new int[length];
            for (int i = 0; i < length; i++) {
                trace[i] = scanner.nextInt();
            }
            System.out.println(reconstructString(length, trace));
        }
        scanner.close();
    }

    public static String reconstructString(int length, int[] trace) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] occurrences = new int[26]; 

        for (int i = 0; i < length; i++) {
           
            int j = 0;
            while (trace[i] != occurrences[j]) {
                j++;
            }
            stringBuilder.append((char) ('a' + j)); 
            occurrences[j]++; 
        }
        return stringBuilder.toString();
    }
}

/*
B. Following the String
time limit per test2 seconds
memory limit per test256 megabytes
inputstandard input
outputstandard output
Polycarp lost the string 𝑠
 of length 𝑛
 consisting of lowercase Latin letters, but he still has its trace.

The trace of the string 𝑠
 is an array 𝑎
 of 𝑛
 integers, where 𝑎𝑖
 is the number of such indices 𝑗
 (𝑗<𝑖
) that 𝑠𝑖=𝑠𝑗
. For example, the trace of the string abracadabra is the array [0,0,0,1,0,2,0,3,1,1,4
].

Given a trace of a string, find any string 𝑠
 from which it could have been obtained. The string 𝑠
 should consist only of lowercase Latin letters a-z.

Input
The first line of the input contains a single integer 𝑡
 (1≤𝑡≤104
) — the number of test cases. Then the descriptions of the test cases follow.

The first line of each test case contains a single integer 𝑛
 (1≤𝑛≤2⋅105
) — the length of the lost string.

The second line of each test case contains 𝑛
 integers 𝑎1,𝑎2,…,𝑎𝑛
 (0≤𝑎𝑖<𝑛
) — the trace of the string. It is guaranteed that for the given trace, there exists a suitable string 𝑠
.

It is guaranteed that the sum of 𝑛
 over all test cases does not exceed 2⋅105
.

Output
For each test case, output a string 𝑠
 that corresponds to the given trace. If there are multiple such strings 𝑠
, then output any of them.

The string 𝑠
 should consist of lowercase Latin letters a-z.

It is guaranteed that for each test case, a valid answer exists.

Example
inputCopy
5
11
0 0 0 1 0 2 0 3 1 1 4
10
0 0 0 0 0 1 0 1 1 0
1
0
8
0 1 2 3 4 5 6 7
8
0 0 0 0 0 0 0 0
outputCopy
abracadabra
codeforces
a
aaaaaaaa
dijkstra
*/