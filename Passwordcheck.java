import java.util.Scanner;
 class Passwordcheck{
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        String setpassword="1234";
        System.out.println("Enter your password:");
        String userpassword=sc.nextLine();
        if(userpassword.equals(setpassword)){
            System.out.println("Password is correct");
        }
        else{
            System.out.println("Password is incorrect");
        }
    }
 }