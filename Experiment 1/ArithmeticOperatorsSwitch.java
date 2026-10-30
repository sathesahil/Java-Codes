import java.util.Scanner;

class ArithmeticOperatorsSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter operator (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Result = " + (firstNumber + secondNumber));
                break;
            case '-':
                System.out.println("Result = " + (firstNumber - secondNumber));
                break;
            case '*':
                System.out.println("Result = " + (firstNumber * secondNumber));
                break;
            case '/':
                if (secondNumber != 0)
                    System.out.println("Result = " + (firstNumber / secondNumber));
                else
                    System.out.println("Division by zero is not allowed.");
                break;
            case '%':
                if (secondNumber != 0)
                    System.out.println("Result = " + (firstNumber % secondNumber));
                else
                    System.out.println("Modulo by zero is not allowed.");
                break;
            default:
                System.out.println("Invalid operator.");
        }

        scanner.close();
    }
}