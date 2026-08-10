import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        String s1 = sc.next();        
        System.out.print("Enter second number: ");
        String s2 = sc.next();        
        System.out.print("Enter operation (+, -, *, /): ");
        String op = sc.next();
        Integer num1 = Integer.valueOf(s1);
        Integer num2 = Integer.valueOf(s2);
        int result = 0;
        if (op.equals("+")) result = num1 + num2;
        else if (op.equals("-")) result = num1 - num2;
        else if (op.equals("*")) result = num1 * num2;
        else if (op.equals("/")) result = num1 / num2;
                System.out.println("Result: " + result);
        
        sc.close();
    }
}