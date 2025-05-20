a. First N Fibonacci Series

Example:

Enter how many number you want: 8
First 8 Fibonacci series are: 0 1 1 2 3 5 8 13 


import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many number you want: ");
        int n = sc.nextInt();
        int a = 0, b = 1, c;
        System.out.print("First "+n+" Fibonacci series are: " +a + " " + b + " ");
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }
}



b. First n Fibonacci

Given a number n, return an array containing the first n Fibonacci numbers.

Note: The first two numbers of the series are 0 and 1.

Examples:

Input: n = 5
Output: [0, 1, 1, 2, 3]

Input: n = 7
Output: [0, 1, 1, 2, 3, 5, 8]

Input: n = 2
Output: [0, 1]

class Solution {
    public static int[] fibonacciNumbers(int n) {
        int arr[] = new int[n];
        arr[0] = 0;
        if (n == 1) return arr;
        arr[1] = 1;
        if (n == 2) return arr;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        return arr;
    }
}

