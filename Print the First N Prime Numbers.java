Print the First N Prime Numbers

Example:

Enter how many numbers you want: 10
The first 10 prime numbers are: 2 3 5 7 11 13 17 19 23 29 


import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers you want: ");
        int n = sc.nextInt();
        System.out.print("The first " + n + " prime numbers are: ");
        
        int count = 0;
        int num = 2;

        while (count < n) {
            boolean flag = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}
