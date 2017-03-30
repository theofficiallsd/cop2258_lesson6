import java.util.Scanner;

public class StringDemo{

     public static void main(String []args){
         
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nPlease enter your full name: ");
        
        String n1 = input.next(); //Read first name
        String n2 = input.next(); //Read middle name
        String n3 = input.next(); //Read last name
        
        System.out.println(n1.toUpperCase() + "'s middle initial is: " + n2);
        
        
        System.out.println("\nYour first name in all uppper case is: " + n1.toUpperCase());
        System.out.println("Your middle name in all upper case is: " + n2.toUpperCase());
        System.out.println("Your last name in all upper case is: " + n3.toUpperCase());
        
        System.out.println("\nConcatenate your first name with your last name is: " + n1.concat(n2));
        System.out.println("Length of n2 is: " + n2.length());
     }
} //End of main
