import java.util.*;

public class findStringFront {
  public static final Scanner CONSOLE = new Scanner(System.in);
  public static void main(String[] args) {
    int result1 = findString("abc", "a");//returns 0
    System.out.println("Search 1 result: " + result1);
    int result2 = findString("ababcd", "abc");//returns 2
    System.out.println("Search 2 result: " + result2);
    int result3 = findString("abc", "abcd");//returns -1
    System.out.println("Search 3 result: " + result3);
    int result4 = findString("abc", "Abc");//returns -1
    System.out.println("Search 4 result: " + result4);
    int result5 = findString("ababa", "ba");//returns 1
    System.out.println("Search 5 result: " + result5);
  }
  
  public static int findString(String text, String find){
    for(int i = 0 ; i < text.length() - find.length() ; i++){
      String s = text.substring(i, i + find.length());
      if(s.equals(find)){
        return i;
      }
    }//end for loop
     return -1;
  }//end find string
 
}
