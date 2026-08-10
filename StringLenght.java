import java.util.Scanner;
 class StringLenght{
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a string");
         String word = sc.nextLine();
         int length = word.length();
         if (length % 2 == 0){
             System.out.println("The string is even");
         } else {
             System.out.println("The string is odd");
         }
         System.out.println("The length of the string is: " + length);
         sc.close();
     }
 }