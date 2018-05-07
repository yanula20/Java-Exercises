import java.util.*;

public class CharReverse {
   public static final Scanner CONSOLE = new Scanner(System.in);
 
  
  public static void main(String[] args) {
    System.out.print("Please type a message");
    String message = CONSOLE.nextLine();
    System.out.println("Your message in reverse is " + reverse(message));
   
  }
  
  public static String reverse(String message) {
    String result = "";
    System.out.println(message.length());
    int i;
    for(i = 0; i < message.length(); i++) {
      result = message.charAt(i) + result;
    } return result;
  }
}