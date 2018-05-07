import java.util.*;

public class IndexOf {
  
  public static final Scanner CONSOLE = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.print("Please type a message");
    String message = CONSOLE.nextLine();
    
    System.out.print("Enter a character to search for: ");
    char ch = CONSOLE.next().charAt(0);
    
    if(indexOf(message, ch) == -1) {
      System.out.println("Your character was not found.");
    } else {
       System.out.println("Your character was found at index " + indexOf(message, ch));
    }
  }
  
  public static int indexOf(String message, char ch) {
    for(int i = 0; i < message.length(); i++) {
      if(message.charAt(i) == ch) {
       return i;
      }
    }
    return -1;
  }
}