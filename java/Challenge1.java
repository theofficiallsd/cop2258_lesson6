import java.util.Scanner;

public class Challenge1{

     public static void main(String []args){
         
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nPlease enter your full name: ");
        
        String n1 = input.next(); //Read first name
        String n2 = input.next(); //Read middle name
        String n3 = input.next(); //Read last name
        
        System.out.println(n1.toUpperCase() + "'s middle initial is: " + n2.charAt(0));
        
     }
} //End of main
