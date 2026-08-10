import java.util.Scanner;

public class ReverseAndSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int original = num;   // store original number
        int reverse = 0;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;   // get last digit

            reverse = (reverse * 10) + digit;  // build reversed number
            sum = sum + digit;                 // add digit to sum

            num = num / 10;   // remove last digit
        }

        System.out.println("Original Number : " + original);
        System.out.println("Reversed Number : " + reverse);
        System.out.println("Sum of Digits   : " + sum);

        sc.close();
    }
    
}