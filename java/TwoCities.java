import java.util.Scanner;

public class TwoCities {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // Prompt the user to enter two cities
    System.out.print("\nEnter the first city and the second city (separated by a space): ");
    String cities = input.nextLine();

    int c1 = cities.indexOf(' ');
    
    String city1 = cities.substring(0, c1);
    String city2 = cities.substring(c1 + 1);
    
    System.out.println("\nThe first city enter is: " + city1);
    System.out.println("The second city enter is: " + city2);
    
    if (city1.compareTo(city2) < 0)
      System.out.println("\nThe cities in alphabetical order are " +
         city1 + " " + city2);
    else
      System.out.println("\nThe cities in alphabetical order are " +
          city2 + " " + city1);
  }//end of main
  
}//end of class