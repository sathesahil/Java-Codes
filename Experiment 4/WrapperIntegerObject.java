import java.util.Scanner;

class WrapperIntegerObject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer as a string: ");
        String numberString = scanner.nextLine();

        Integer wrapperObject = Integer.valueOf(numberString);
        int primitiveValue = wrapperObject.intValue();

        System.out.println("Original String: " + numberString);
        System.out.println("Wrapper Object: " + wrapperObject);
        System.out.println("Primitive Value: " + primitiveValue);

        scanner.close();
    }
}
