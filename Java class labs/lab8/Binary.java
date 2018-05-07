//We need a Java utility (the Scanner class) for keyboard input.
import java.util.*;

//Java utility for working with Arrays
import java.util.Arrays;

//Java program name: Binary
public class Binary {
  //class constant console, used to read user input
  public static final Scanner console = new Scanner(System.in);
  
  //Binary program's main method
  public static void main(String[] args) {
    System.out.println("Lab 8 written by Donald Moore, ABC123: qxv177");
    System.out.println();//spacing
    
    //this method prints basic info about the Binary java program
    getIntro();
    
    /* this method starts the program by calling the getInt() method, performing input validation,
     * printing results, and asking the user whether or not to run the decimal to binary conversion
     again. The conversions will continue until the user responds with "no".*/
    startProgram();
    
  }//end main
  
  /* this method retrieves the user's response for whehter or not to continue
  the decimal to binary conversion program */
  public static int playAgain(){
    String again = "maybe"; //default empty string, prime the while loop below
    while(again.equals("maybe") ){
      System.out.print("Do you want to continue (yes or no)?");
      again = console.next();//nextLine()DOESN'T WORK; ASK PROF
    }//end while
    
    if(again.toLowerCase().trim().equals("yes")){
      return 1;
    }else{
      return 0;
    }
  }
  
  /* This method starts the decimal conversion program. It contains a while loop test (keepGoing)
  that will contine running the program until the user answers 'no'. */
  public static void startProgram(){
    int keepGoing = 1;
    while(keepGoing == 1){
      int decimal  = getInt(console, "Enter a positive integer: ");//getInt() contains while loop test for strings
      while(decimal <= 0){//test for 0 or negative number
        System.out.println("Not positive. Try again.");
        decimal = getInt(console, "Enter a positive integer: ");//getInt() contains while loop test for strings
      }
      
      /* printBinaryArray() method undoes the reverse order of the binary array and, then,
       * prints the final result. */ 
      printBinaryArray(decimal, convertToBinary(decimal));
      
      /* This method asks whether the user would like to continue converting decimals 
       * to binary. The playAgain() method returns a 1 (continue) or 0 (end program) that is 
       * used in a while loop for determining continuous play. */
      keepGoing = playAgain();
      
    }//end while loop
    System.out.println("You answered no. Have a nice day.");
  }
  
  //this method prints basic info about the Binary java program
  public static void getIntro(){
    System.out.println("The program should allow the user to convert decimal numbers");
    System.out.println("to binary numbers as long as the user desires.");
    System.out.println("You should implement two methods: one for converting decimal numbers to binary numbers,");
    System.out.println("and another for printing binary numbers. ");
    System.out.println();
  }
  
  //prompts until a valid number is entered
  public static int getInt(Scanner console, String prompt){
    System.out.print(prompt);
    while(!console.hasNextInt()){//if strings are entered
      console.next();//discard input, flush buffer
      System.out.println("Not an integer; try again.");
      System.out.print(prompt);
    }//end while loop
    return console.nextInt();
  }
  
  /* this method converts the decimal to binary and stores it in an array named binary. 
   * Note: The stored binary is in reverse order */
  public static int[] convertToBinary(int decimal){
    int decimalCopy = decimal;//create copy of method parameter: decimal
    int len = 0;
    while(decimal > 0) {
      decimal = decimal/2;
      len++;
    }
    
    //back to original method parameter
    decimal = decimalCopy;
    
    //create a integer array with variable binary 
    int[] binary = new int[len];
    
    /* variable j = 0 represents the 0 index of the array which will be incremented 
     * as decimal parity bits are added to the array */
    int j = 0;
    while(decimal > 0){
      if(decimal%2 == 1){
        binary[j] = 1;
        j++;//increment the array index to move to next element
      }else{
        binary[j] = 0;
        j++;//increment the array index to move to next element
      }
      decimal = decimal/2;
    }
    return binary;
  }
  
  /*this method prints the final conversion of the decimal to a binary number
  by printing the elements of the binary array in reverse order*/
  public static void printBinaryArray(int decimal, int[] binary){
    System.out.print(decimal + " decimal is equal to ");
    //binary.length - 1 equals the index of last element of the array
    for (int i = binary.length - 1; i >= 0; i--) {
      System.out.print(binary[i]);
    }
    System.out.print(" binary.\n");
  }
}