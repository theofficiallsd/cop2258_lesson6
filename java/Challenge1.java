import java.util.Scanner;

public class Challenge1{

     public static void main(String []args){
         
        Scanner input = new Scanner(System.in);
        
        //This program is designed to have users enter a letter, and the program will return the corresponding 
        // telephone number that letter can be found on
        
        System.out.print("Please enter a letter: ");
        
        String n1 = input.next(); //Read first name
        String n2 = input.next(); //Read middle name
        String n3 = input.next(); //Read last name
        
        System.out.println(n1.toUpperCase() + "'s middle initial is: " + n2.charAt(0));
        
     }
} //End of main
