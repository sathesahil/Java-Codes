import java.util.Scanner;

class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        System.out.print("Enter Position (0-based): ");
        int pos = sc.nextInt();

        System.out.print("Enter New Character: ");
        char ch = sc.next().charAt(0);

        String result = str.substring(0, pos) + ch + str.substring(pos + 1);

        System.out.println("Updated String: " + result);
        sc.close();
    }
}
