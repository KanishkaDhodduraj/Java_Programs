//Problem Statement
//
//Given an integer N, check whether it is an Armstrong number.
//
//An Armstrong number is a number that is equal to the sum of the cubes of its digits.
//
//Example 1
//
//Input
//
//153
//
//Output
//
//Armstrong Number
//
//Explanation:
//
//        1³ + 5³ + 3³
//        = 1 + 125 + 27
//        = 153
//Example 2
//
//Input
//
//123
//
//Output
//
//Not an Armstrong Number
//
//Explanation:
//
//        1³ + 2³ + 3³
//        = 1 + 8 + 27
//        = 36
//Rules
//Do not use String, arrays, or Math.pow().
//         Use only arithmetic operators.
//         Use loops.

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements :");
        int num = sc.nextInt();

        int originalNum = num;

        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum = sum + (digit * digit * digit);
            num = num / 10;
        }

        if (sum == originalNum) {
            System.out.println("Armstrong Number.");
        } else {
            System.out.println("Not an Armstrong Number.");
        }
        sc.close();
    }
}