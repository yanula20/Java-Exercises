/* This Star Wars program takes user input and applies the following rules
 * in order to generate a Star Wars' Universe FIRST NAME, LAST NAME, AND PLAENT.
 * The rules applied to user input are as follows:
 * 1) For the FIRST NAME, use: the first 3 characters of the user's real first name, 
 * concatenated with the first 2 characters of the user's real last name.
 * 2) For the LAST NAME, use: the first 2 characters of the user's mother's madien name,
 * concatenated with the first 3 characters of the user's city of birth.
 * 3) The user's Star Wars PLANET, use: The last 2 characters of the user's last name, 
 * concatenated with the user's car.
 * Test info below: 
 * Enter your first name: Portia
 * Enter your last name: DeRossi
 * Enter your mother's maiden name: Lee
 * Enter the city where you were born: Horsham
 * Enter the first car your drove: Maserati
 * You are PORDE LEHOR of SIMASERATI
 */

//We need a Java utility (the Scanner class) for keyboard input.
import java.util.*;

//StarWarsName.java program
public class StarWarsName {
  
// set up a class constant named CONSOLE to read from the keyboard  
  public static final Scanner CONSOLE = new Scanner(System.in);
  
  //Star Wars' Program main method
  public static void main(String[] args) {
    System.out.println("Lab 4 written by Donald A. Moore, UTSAID: qxv177");
    //Program TITLE: Star Wars Program
    System.out.println("Star Wars Program");
    //spacing after program TITLE
    System.out.println();
    
    //Prompt user for last name, store input in lastName variable 
    String firstName = promptString("Enter your first name :");
    
    String lastName = promptString("Enter your last name: ");
    /*(optional) enhance your program by doubling the user's input;
     for example, treating the last name "Xu" as "XuXu" */
    lastName += lastName;
 
    //Prompt user for mother's maiden name, store input in momMaidenName variable 
    String momMaidenName = promptString("Enter your mother's maiden name: ");
    
    //Prompt user for birth city, store input in birthCity variable 
    String birthCity = promptString("Enter the city where you were born: ");
    
    //Prompt user for his/her veicle, store input in yourCar variable 
    String yourCar = promptString("Enter the first car you drove: ");
    
    /* method takes all promptString results as arguments, then calls printStarWarsName method
    which calculates and prints the user's Star Wars name */
    printStarWarsName(firstName, lastName, momMaidenName, birthCity, yourCar);
  }
  
  //promptString method with String <return type> recieves all user imput as strings and returns Star Wars galaxy info
  public static String promptString(String prompt) {
    String userInputForStarWarsName;
    System.out.print(prompt);
    userInputForStarWarsName = CONSOLE.nextLine();
    return userInputForStarWarsName;
  }
  
  /* method takes all user input, i.e. first name, last name, mom's maiden name, birth city, and car to create/print a 
  Star Wars Universe name for the user */
  public static void printStarWarsName(String firstName, String lastName, String momMaidenName, String birthCity, String yourCar) {
    System.out.print("You are " + firstName.trim().toUpperCase().substring(0,3)); 
    System.out.print(lastName.trim().toUpperCase().substring(0,2) + " ");
    System.out.print(momMaidenName.trim().toUpperCase().substring(0,2));
    System.out.print(birthCity.trim().toUpperCase().substring(0,3) + " of ");
    System.out.print(lastName.trim().toUpperCase().substring(lastName.length()-2, lastName.length()));
    System.out.println(yourCar.trim().toUpperCase());
  }
}
