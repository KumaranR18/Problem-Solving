Finding the Nth Fibonacci Number

Example:

Enter which Fibonacci number you want: 6
The 6th Fibonacci number is: 5


import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter which Fibonacci number you want: ");
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("The 0th Fibonacci number is: 0");
            return;
        }
        if (n == 1) {
            System.out.println("The 1st Fibonacci number is: 1");
            return;
        }
        int a = 0, b = 1, c = 0;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("The " + n + "th Fibonacci number is: " + c);
    }
}


