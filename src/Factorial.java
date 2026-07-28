//Problem Statement
//
//        Given an integer N, find the factorial of the number.
//
//        If N is negative, print "Invalid Input".
//
//        Input 1
//        5
//        Output 1
//        120
//        Input 2
//        0
//        Output 2
//        1
//        Input 3
//        -3
//        Output 3
//        Invalid Input
//        Constraints
//        0 ≤ N ≤ 20
//        Instructions
//        Use Java.
//        Do not use recursion.
//        Use a loop.

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        if(num <= 0){
            System.out.println("Invalid Input");
        }

        long fact = 1;
        for(int i = 1 ; i <= num; i++){
            fact = fact * i;
        }

        System.out.println("Factorial is :" + fact);

        sc.close();

        }
}