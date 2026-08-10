import java.util.Scanner;
 class Sum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string");
        String s = scanner.nextLine();
        System.out.println("You enter another string");
        String s1 = scanner.nextLine();
        Integer Wrapper = Integer.parseInt(s) + Integer.parseInt(s1);
        System.out.println("Sum: " + Wrapper);
        scanner.close();
 }
}