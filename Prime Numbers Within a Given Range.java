Finding Prime Numbers Within a Given Range

Example:

Enter the Starting number: 1
Enter the Ending number: 36
Prime numbers between 1 and 36 are: 2 3 5 7 11 13 17 19 23 29 31 



import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter the Ending number: ");
        int end = sc.nextInt();
        System.out.print("Prime numbers between " + start + " and " + end + " are: ");

        for (int num=start; num<=end; num++) {
            boolean flag = true;
            for (int i=2; i<=num/2; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag && num > 1) {
                System.out.print(num + " ");
            }
        }
    }
}