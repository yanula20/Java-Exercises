import java.util.*;

public class SwitchCases {
  public static final Scanner CONSOLE = new Scanner(System.in);
  public static void main(String[] args) {
    getUserInput();
  }
  
  public static void getUserInput() {
    System.out.print("Enter a line of text: ");
    String str = CONSOLE.nextLine( );
    System.out.println();
    String result = swapCases(str);
    System.out.println(result);
  }
  
  public static String swapCases(String str) {
    String result = "";
    for (int i = 0; i < str.length( ); i++) {
      char c = str.charAt(i);
      if (c == Character.toUpperCase(c)) {
        c = Character.toLowerCase(c);
        result = result + c;
      } else if (c == Character.toLowerCase(c)){
        c = Character.toUpperCase(c);
        result = result + c;
      }
    }return result ;
  } 
}  

