//Problem Statement
//
//Given an integer N, find the sum of its digits.
//
//        Input
//1234
//Output
//10
//
//Explanation:
//
//        1 + 2 + 3 + 4 = 10
//Example 2
//
//Input:
//
//        987
//
//Output:
//
//        24

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the digits : ");
        int digit = sc.nextInt();

        int sum = 0;
        while(digit != 0) {
            int lastDigit = digit % 10;
            sum += lastDigit;
            digit = digit / 10;

        }

    System.out.println("Sum of Digits :" + sum);
        sc.close();
    }
}