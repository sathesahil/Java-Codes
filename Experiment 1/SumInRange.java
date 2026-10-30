import java.util.Scanner;

class SumInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start of range: ");
        int start = scanner.nextInt();

        System.out.print("Enter end of range: ");
        int end = scanner.nextInt();

        if (start <= end) {
            int sum = 0;
            for (int number = start; number <= end; number++)
                sum += number;

            System.out.println("Sum = " + sum);
        } else {
            System.out.println("Invalid range.");
        }

        scanner.close();
    }
}