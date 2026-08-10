import java.util.Scanner;
class ReplaceCharacter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String word = sc.nextLine();
        System.out.println("Enter the character to be replaced");
        char oldChar = sc.next().charAt(0);
        System.out.println("Enter the new character");
        char newChar = sc.next().charAt(0);
        String newWord = word.replace(oldChar, newChar);
        System.out.println("The new string is: " + newWord);
        sc.close();
    }
}