/* 
A. Make it White

time limit per test2 seconds
memory limit per test256 megabytes
inputstandard input
outputstandard output
You have a horizontal strip of 𝑛
 cells. Each cell is either white or black.

You can choose a continuous segment of cells once and paint them all white. After this action, all the black cells in this segment will become white, and the white ones will remain white.

What is the minimum length of the segment that needs to be painted white in order for all 𝑛
 cells to become white?

Input
The first line of the input contains a single integer 𝑡
 (1≤𝑡≤104
) — the number of test cases. The descriptions of the test cases follow.

The first line of each test case contains a single integer 𝑛
 (1≤𝑛≤10
) — the length of the strip.

The second line of each test case contains a string 𝑠
, consisting of 𝑛
 characters, each of which is either 'W' or 'B'. The symbol 'W' denotes a white cell, and 'B' — a black one. It is guaranteed that at least one cell of the given strip is black.

Output
For each test case, output a single number — the minimum length of a continuous segment of cells that needs to be painted white in order for the entire strip to become white.

Example
inputCopy
8
6
WBBWBW
1
B
2
WB
3
BBW
4
BWWB
6
BWBWWB
6
WWBBWB
9
WBWBWWWBW
outputCopy
4
1
1
2
4
6
4
7
Note
In the first test case of the example for the strip "WBBWBW", the minimum length of the segment to be repainted white is 4
. It is necessary to repaint to white the segment from the 2
-nd to the 5
-th cell (the cells are numbered from 1
 from left to right).
*/

import java.util.Scanner;

public class QA {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int testCases = scanner.nextInt();
            while (testCases-- > 0) {
                int length = scanner.nextInt();
                String sequence = scanner.next();
                System.out.println(findWidth(length, sequence));
            }
        }
    }

    public static int findWidth(int length, String sequence) {
        int left = 0;
        int right = length - 1;
        while (left <= right) {
            if (sequence.charAt(left) == 'W') {
                left++;
            }
            if (sequence.charAt(right) == 'W') {
                right--;
            }

            if (sequence.charAt(left) == 'B' && sequence.charAt(right) == 'B') {
                break;
            }
        }
        return right - left + 1;
    }
}
