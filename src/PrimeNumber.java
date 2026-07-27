//Problem Statement
//
//Given an integer N, determine whether it is a Prime Number.
//
//A prime number is a number that has exactly two factors:
//
//        1
//Itself
//Example 1
//
//Input
//
//7
//
//Output
//
//Prime Number
//Example 2
//
//Input
//
//10
//
//Output
//
//Not a Prime Number
//Example 3
//
//Input
//
//1
//
//Output
//
//Not a Prime Number
//Rules
//Do not use any built-in prime functions.
//Use loops.
//        Use arithmetic operators only.
//

import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int num = sc.nextInt();

        boolean isPrime = true;

        if (num <= 1) {
            System.out.println("Not Prime");
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }

        sc.close();
    }
}