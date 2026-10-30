import java.util.Scanner;

class EvenOddLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        if (str.length() % 2 == 0)
            System.out.println("String length is Even.");
        else
            System.out.println("String length is Odd.");
        sc.close();
    }
}
