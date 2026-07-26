//Problem Statement
//
//Given an integer N, determine whether it is a Palindrome.
//
//A palindrome number reads the same forwards and backwards.
//
//        Examples
//
//        Input
//
//121
//
//Output
//
//        Palindrome
//
//Input
//
//123
//
//Output
//
//Not Palindrome
//
//Input
//
//-121
//
//Output
//
//Not Palindrome
//Rules
//Do not use String, StringBuilder, or arrays.
//Use only arithmetic operators.
//Use loops.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements : ");
        int number = sc.nextInt();

        int originalNum = number;
        int reverse = 0;


        while (number != 0) {

            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        if (originalNum == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a plaindrome");
        }

        sc.close();
    }
}