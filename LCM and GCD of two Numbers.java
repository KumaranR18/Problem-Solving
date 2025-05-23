a. LCM of two Numbers

Example:

Enter the Number 1: 6
Enter the Number 2: 2
LCM: 6


import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter the Number 2: ");
        int b = sc.nextInt();
        int greater = a>b ? a:b;
        while(true){
            if (greater % a == 0 && greater % b == 0){
                System.out.println("LCM: " + greater);
                break;
            }
            greater++;
        }
    }
}



b. GCD of two Numbers

Example:

Enter the Number 1: 6
Enter the Number 2: 2
GCD: 2

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter the Number 2: ");
        int b = sc.nextInt();
        int lesser = a<b ? a:b;
        while(true){
            if (a % lesser == 0 && b % lesser == 0){
                System.out.println("GCD: " + lesser);
                break;
            }
            lesser--;
        }
    }
}

