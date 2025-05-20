First N Fibonacci Series

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
