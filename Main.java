import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String s = sc.nextLine();

        Integer wrapper = Integer.valueOf(s);
        int primitive = wrapper; 
        System.out.println("String version: " + s);
        System.out.println("Object version: " + wrapper);
        System.out.println("Simple int version: " + primitive);
        
        sc.close();
    }
}