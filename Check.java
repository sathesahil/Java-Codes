import java.util.Scanner;
 class Check{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        String s = scanner.nextLine();
        Integer Wrapper = Integer.parseInt(s);
        if(Wrapper % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
        scanner.close();
    }
        
 }