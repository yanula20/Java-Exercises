import java.util.*;

public class LeetCharacterSubstitution {
  public static final Scanner CONSOLE = new Scanner(System.in);
  public static void main(String[] args) {
    getUserInput();
  }
  
  public static void getUserInput() {
    System.out.print("Enter a line of text: ");
    String str = CONSOLE.nextLine( );
    System.out.println();
    String result = partialLeet(str);
    System.out.println(result);
  }
  
  public static String partialLeet(String str) {
    String result = "";
    for (int i = 0; i < str.length( ); i++) {
      char c = str.charAt(i);
      if (c == 'e' || c == 'E') {
        c = '3';
      } else if (c == 'l' || c == 'L') {
        c = '1';
      } else if (c == 't' || c == 'T') {
        c = '7';
      }  else if (c == 'z' || c == 'Z') {
        c = '2';
      }  else if (c == 's' || c == 'S') {
        c = '5';
      }
      result = result + c;
    }
    return result;
  }
  
}



