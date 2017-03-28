import java.util.Scanner;

public class pandora
{
    public static void main(String[] args )
    {
        //Declare variables and crete new Scanner object
        Scanner input = new Scanner (System.in);
        
        //Variables
        int channel=0;
        String name ="", lname ="";
        String menuSelection ="";
        String channelName ="";
        
        //Display welcome menu
        System.out.println("**************** WELCOME TO PANDORA ******************************");
        System.out.println(""); //Blank line
        System.out.println("PANDORA MENU:");
        System.out.println("1 - Create New Pandora Channel");       //Center all text in welcome menu
        System.out.println("2 - Play Pandora Channel");             //Center all text in welcome menu
        System.out.println("3 - Exit Pandora");
        System.out.println(""); //Blank line
        System.out.println("******************************************************************");
        System.out.println(""); //Blank line
        System.out.println("Please enter your last name followed by your Menu Choice: "); //User enters 1, 2, or 3 from welcome menu
        
        lname = input.next(); //Read last name from keyboard
        //lname = name.toUpperCase(); //Makes name all caps
        menuSelection = input.next();
        System.out.println("Hello, " + lname); //Should be displayed in all caps
        
        
        
        
        //switch statements
        switch (menuSelection) {
            case "1" : //Menu #1
            
                System.out.println("You have selected the CREATE NEW PANDORA CHANNEL menu item!");
                System.out.println("Please enter the name of your new channel: ");
                
                channelName = input.next();
                
                System.out.println("You have successfully created the following Pandora channel: " + channelName); //Print channel name in all caps
                System.out.println(""); //Blank line
                System.out.println(lname + " Thank you for being a valued listener!");
                break;
            
            case "2" : //Menu #2
            
                System.out.println("You have selected the PLAY PANDORA CHANNEL menu item!");
                System.out.println(""); //Blank line
                System.out.println("The user: " + lname + " currently has created the following channels: "); //lname needs to be displayed and capitalized
                System.out.println("1. Logic");
                System.out.println("2. August Burns Red");
                System.out.println("3. Kanye West");
                System.out.println("4. Drake");
                System.out.println("5. Rich Homie Quan");
                
                System.out.println("Which cannel would you like to listen to? (Enter 1, 2, 3, 4, or 5): ");
                channel = input.nextInt(); //Read user's channel input
                    
                    switch (channel) {
                        case 1 :
                            System.out.println("You are now listening to: LOGIC");
                            break;
                        
                        case 2 :
                            System.out.println("You are now listening to: AUGUST BURNS RED");
                            break;
                        
                        case 3 : 
                            System.out.println("You are now listening to: KANYE WEST");
                            break;
                            
                        case 4 :
                            System.out.println("You are now listening to: DRAKE");
                            break;
                        
                        case 5 :
                            System.out.println("You are now listening to: RICH HOMIE QUAN");
                            break;
                        
                    } //End of channel switch
                    
                System.out.println("Thank you " + lname + " for being a valued listener");
                break;
                
            case "3" : //Menu #3
                System.out.println("You have selected the EXIT PANDORA menu item");
                break;
        } //End of menu switch statement
        
        
        System.out.println("****************************GOODBYE PANDORA LISTENER************************"); //Closing message
        
    }//End of main
}//End of program


//Extra credit opportunity
// For menu item #2, add at least TEN channels the user can choose from to listen to.