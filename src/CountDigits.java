import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the digits :");
        int digit = sc.nextInt();

        int count = 0;
        while(digit != 0){
            digit = digit / 10;
            count++;
            }
        System.out.println("Count of Digits :" + count);

        sc.close();

    }
}