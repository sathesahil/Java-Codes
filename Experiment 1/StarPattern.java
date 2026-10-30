import java.util.Scanner;

class StarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int row = 1; row <= rows; row++) {
            for (int column = 1; column <= row; column++)
                System.out.print("* ");
            System.out.println();
        }

        scanner.close();
    }
}