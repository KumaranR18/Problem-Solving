Finding the Nth Prime Number

Example:

Enter which Prime number you want: 5
The 5th prime number is: 11


import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter which Prime number you want: ");
        int n = sc.nextInt();

        int count = 0;
        int num = 2;
        int nthPrime = 0;

        while (count < n) {
            boolean flag = true;

            for (int i = 2; i <= num/2; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                nthPrime = num;
                count++;
            }
            num++;
        }

        System.out.println("The " + n + "th prime number is: " + nthPrime);
    }
}



