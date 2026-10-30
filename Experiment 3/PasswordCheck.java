import java.util.Scanner;

class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = "Java123";

        System.out.print("Enter Password: ");
        String input = sc.nextLine();

        if (password.equals(input))
            System.out.println("Password Correct");
        else
            System.out.println("Incorrect Password");
        sc.close();
    }
}