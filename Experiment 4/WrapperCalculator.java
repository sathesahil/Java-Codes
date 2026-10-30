import java.util.Scanner;

class WrapperCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number as a string: ");
        String firstString = scanner.nextLine();
        System.out.print("Enter second number as a string: ");
        String secondString = scanner.nextLine();
        System.out.print("Enter operation (+, -, *, /): ");
        String operation = scanner.nextLine();

        Integer firstNumber = Integer.valueOf(firstString);
        Integer secondNumber = Integer.valueOf(secondString);
        int result;

        switch (operation) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                if (secondNumber == 0) {
                    System.out.println("Division by zero is not allowed.");
                    scanner.close();
                    return;
                }
                result = firstNumber / secondNumber;
                break;
            default:
                System.out.println("Invalid operation.");
                scanner.close();
                return;
        }

        System.out.println("First Number: " + firstNumber);
        System.out.println("Second Number: " + secondNumber);
        System.out.println("Result: " + result);

        scanner.close();
    }
}
