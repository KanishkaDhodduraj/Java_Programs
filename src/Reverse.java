//Problem:
//Given an integer N, reverse the number without converting it to a string.
//
//Example
//
//Input:
//        12345
//Output:
//        54321
//Example
//
//Input:
//        -450
//Output:
//        -54
//Rules
//
//Do not use String, StringBuilder, or arrays.
//Use only arithmetic operators.

import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Enter the elements: ");
            int number = sc.nextInt();

            int reverse = 0;

            while(number != 0) {
                int digit = number % 10;
                reverse = reverse * 10 + digit;
                number = number / 10;


                System.out.println("Reversed : " + reverse);
            }

            sc.close();

    }
}