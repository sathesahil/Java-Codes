import java.util.Scanner;
class Greatest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        String a = scanner.nextLine();
        System.out.println("Enter second number: ");
        String b = scanner.nextLine();
        System.out.println("Enter third number: ");
        String c = scanner.nextLine();
        Integer WrapperA = Integer.parseInt(a);
        Integer WrapperB = Integer.parseInt(b);
        Integer WrapperC = Integer.parseInt(c);
        if(WrapperA > WrapperB && WrapperA > WrapperC) {
            System.out.println("The greatest number is: " + WrapperA);
        } else if(WrapperB > WrapperA && WrapperB > WrapperC) {
            System.out.println("The greatest number is: " + WrapperB);
        } else {
            System.out.println("The greatest number is: " + WrapperC);
        }
        scanner.close();
    }
}