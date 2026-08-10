import java.util.Scanner; 
 class CountCharacters{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String word = sc.nextLine();
        int count = 0;
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(ch != ' '){
                count++;
            }
        }
        System.out.println("The number of characters in the string is: " + count);
        sc.close();
    }
 }