import java.util.Scanner;

public class pandora
{
    public static void main(String[] args )
    {
        //Declare variables and crete new Scanner object
        Scanner input = new Scanner (System.in);
        
        //Variables
        String name ="", lname ="";
        String menuSelection ="";
        String channel="";
        
        
        
        //Display welcome menu
        System.out.println("**************** WELCOME TO PANDORA ******************************");
        System.out.println(""); //Blank line
        System.out.println("PANDORA MENU:");
        System.out.println("1 - Create New Pandora Channel");       //Center all text in welcome menu
        System.out.println("2 - Play Pandora Channel");             //Center all text in welcome menu
        System.out.println("3 - Exit Pandora");
        System.out.println(""); //Blank line
        System.out.println("******************************************************************");
        
        System.out.println("Please enter your last name followed by your Menu Choice: "); //User enters 1,2, or 3 from welcome menu
        
        lname = input.next(); //Read last name from keyboard
        lname = name.toUpperCase(); //Change name to upper case
        
        //Pandora Menu Option #1
        System.out.println("You have selected the CREATE NEW PANDORA CHANNEL menu item!"); //Welcome message 
        System.out.println("Please enter the name of your new channel: "); // Display channel name in all caps
        
        
        
        System.out.println("You have succesfully created the following channel: " + name ); //Display channel name in all caps
        System.out.println( lname + " Thank you for being a valued listener!"); //Display user's last name in all caps
        
        
        

        
      
        //Pandora Menu Option #2
        System.out.println("You have selected the PLAY PANDORA CHANNEL menu item!");
        System.out.println("The user: " + lname + " currently has created the following channels:");
                                //lname  ^^^^^ needs to be in all caps
        System.out.println("Which chanel would you like to listen to? (Enter 1, 2, 3, 4, or 5): ");
        System.out.println("You are now listening to " + channel); //Display the chanel the user has selected
        
        //Pandora Menu Option #3
        System.out.println("You have selected the EXIT PANDORA menu item!");
        
        
        
        
        
        
        
        
        System.out.println("****************************GOODBYE PANDORA LISTENER************************"); //Closing message
        
    }//End of main
}//End of program


//Extra credit opportunity
// For menu item #2, add at least TEN channels the user can choose from to listen to.