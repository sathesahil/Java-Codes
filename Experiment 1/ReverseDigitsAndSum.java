import java.util.Scanner;

class ReverseDigitsAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reversedNumber = 0;
        int sumOfDigits = 0;
        int remaining = number;

        while (remaining != 0) {
            int digit = remaining % 10;
            reversedNumber = reversedNumber * 10 + digit;
            sumOfDigits += digit;
            remaining /= 10;
        }

        System.out.println("Reversed number = " + reversedNumber);
        System.out.println("Sum of digits = " + sumOfDigits);
        scanner.close();
    }
}