Prime Numbers Up to N

Example:

Enter the number: 40
Prime numbers till 40 : 2 3 5 7 11 13 17 19 23 29 31 37 


import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Prime numbers till " + n + " : " );

        for (int num=1; num<=n; num++) {
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