import java.util.Scanner;

class WrapperSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number as a string: ");
        String firstString = scanner.nextLine();
        System.out.print("Enter second number as a string: ");
        String secondString = scanner.nextLine();

        Integer firstNumber = Integer.valueOf(firstString);
        Integer secondNumber = Integer.valueOf(secondString);
        int sum = firstNumber + secondNumber;

        System.out.println("First Number: " + firstNumber);
        System.out.println("Second Number: " + secondNumber);
        System.out.println("Sum: " + sum);

        scanner.close();
    }
}
