import java.util.Scanner;

class WrapperLargestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number as a string: ");
        String firstString = scanner.nextLine();
        System.out.print("Enter second number as a string: ");
        String secondString = scanner.nextLine();
        System.out.print("Enter third number as a string: ");
        String thirdString = scanner.nextLine();

        Integer firstNumber = Integer.valueOf(firstString);
        Integer secondNumber = Integer.valueOf(secondString);
        Integer thirdNumber = Integer.valueOf(thirdString);

        Integer largest = firstNumber;
        if (secondNumber > largest) {
            largest = secondNumber;
        }
        if (thirdNumber > largest) {
            largest = thirdNumber;
        }

        System.out.println("First Number: " + firstNumber);
        System.out.println("Second Number: " + secondNumber);
        System.out.println("Third Number: " + thirdNumber);
        System.out.println("Largest Number: " + largest);

        scanner.close();
    }
}
