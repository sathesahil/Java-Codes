import java.util.Scanner;

class GreatestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter third number: ");
        int thirdNumber = scanner.nextInt();

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber)
            System.out.println("Greatest number is: " + firstNumber);
        else if (secondNumber >= firstNumber && secondNumber >= thirdNumber)
            System.out.println("Greatest number is: " + secondNumber);
        else
            System.out.println("Greatest number is: " + thirdNumber);

        scanner.close();
    }
}