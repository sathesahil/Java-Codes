import java.util.Scanner;

class WrapperEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number as a string: ");
        String numberString = scanner.nextLine();

        Integer numberObject = Integer.valueOf(numberString);

        System.out.println("Number: " + numberObject);
        if (numberObject % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }

        scanner.close();
    }
}
