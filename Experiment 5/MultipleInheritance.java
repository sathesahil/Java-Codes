import java.util.Scanner;

class MultipleInheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        student.accept(scanner);
        student.display();

        scanner.close();
    }
}

interface FY {
    void acceptFY(Scanner scanner);
    void displayFY();
}

interface SY {
    void acceptSY(Scanner scanner);
    void displaySY();
}

class Student implements FY, SY {
    int rollNo;
    String name;
    String fyResult;
    String syResult;

    void accept(Scanner scanner) {
        acceptFY(scanner);
        acceptSY(scanner);
    }

    void display() {
        System.out.println("\nStudent Details:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("FY Result: " + fyResult);
        System.out.println("SY Result: " + syResult);
    }

    public void acceptFY(Scanner scanner) {
        System.out.print("Roll No: ");
        rollNo = Integer.parseInt(scanner.nextLine());
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("FY Result: ");
        fyResult = scanner.nextLine();
    }

    public void displayFY() {
        System.out.println("\nFY Details:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Result: " + fyResult);
    }

    public void acceptSY(Scanner scanner) {
        System.out.print("SY Result: ");
        syResult = scanner.nextLine();
    }

    public void displaySY() {
        System.out.println("SY Result: " + syResult);
    }
}