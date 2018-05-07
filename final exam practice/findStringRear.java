import java.util.*;

public class findStringRear {
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
    int result5 = findString("ababa", "ba");//returns 3
    System.out.println("Search 5 result: " + result5);
  }
  //returns the index in the first String (text) of the last occurrence of the second word
  public static int findString(String text, String find){
    for(int i = text.length()-find.length(); i >= 0; i--){
      String s = text.substring(i, i + find.length());//from rear move into text; look backwards with fin length
      if(s.equals(find)){
        return i;
      }
    }//end for loop
     return -1;
  }//end find string
 
}
