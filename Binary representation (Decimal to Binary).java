Binary representation (Decimal to Binary)

You are given an integer n, you need to return its binary representation in the form of a string.
Note: String must contain 32 bits.

Examples:

Input: n = 2
Output: 00000000000000000000000000000010
Explanation: The binary representation of 2 is '10', so it can be represent as 00000000000000000000000000000010 in 32 bits.

Input: n = 5
Output: 00000000000000000000000000000101
Explanation: The binary representation of 5 is '101', so it can be represent as 00000000000000000000000000000101 in 32 bits.


Approach 1: 

class Solution {
    static String getBinaryRep(int n) {
        int rem;
        String binary = "";
        while (n > 0) {
            rem = n % 2;
            binary = rem + binary;
            n /= 2;
        }
        while (binary.length() < 32) {
            binary = "0" + binary;
        }
        return binary;
    }
}


Approach 2:

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String binary = Integer.toBinaryString(num);
        while (binary.length() < 32) {
            binary = "0" + binary;
        }
        System.out.print(binary);
    }
}


