import java.util.*;

public class SentinelLoops2 {
  //class constant for user input
  public static final Scanner console = new Scanner(System.in);
  public static void main(String[] args){
    System.out.print("Enter a word to be printed or goodbye to quit.");
    String value = console.nextLine();
    sentinelGoodbye(console, value);
  }
  
  public static void sentinelGoodbye(Scanner console, String value){
    String longest = value.toLowerCase();//invariant, longest word seen so far
    String next = "";
    System.out.println("The longest word so far is " + longest + ".");
    while(!longest.equals("goodbye") && !next.equals("goodbye")){
      System.out.print("Enter a word to be printed or goodbye to quit.");
      next = console.nextLine().toLowerCase();
      if(next.length() > longest.length() && !next.equals("goodbye")){
        longest = next;
      }
    }System.out.println("COMPLETE. The longest word that you entered was " + longest + ".");
  }
}