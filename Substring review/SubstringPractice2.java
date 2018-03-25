import java.util.*;
import java.awt.*;

public class SubstringPractice2 {
  public static final Scanner console = new Scanner(System.in);
  public static void main(String[] args) {
   
    String str = "I slammed the barn door.";
    String word = "door";
    String result = findWord(str, word);
    System.out.println("result = " + result);
    if(result.equals(word)) {
      System.out.println("Your word " + result + " was found!");
    }else{
      System.out.println("Your word was not found!");
    }
  }
  
  public static String findWord(String str, String word) {
    //String answer = "empty";
    for(int i = 0; i < str.length()-word.length(); i++){
      String result = str.substring(i, i + word.length());
      if(result.equals(word)) {
        return word;
      }
    }return "nothing";
  }
}