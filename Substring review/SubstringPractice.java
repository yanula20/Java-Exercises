import java.util.*;
import java.awt.*;

public class SubstringPractice {
  public static final Scanner console = new Scanner(System.in);
  public static void main(String[] args) {
    
    System.out.println("Enter some text for analysis,i.e. digits and letters." );
    String str = "The quick brown fox jumped.";
    String word = "fox";
    String result = findWord(str, word);
    System.out.println("result = " + result);
    if(result.equals(word)) {
      System.out.println("Your word " + result + " was found!");
    }else{
      System.out.println("Your word was not found!");
    }
    
  }
  
  public static String findWord(String str, String word) {
    String answer = "empty";
    for(int i = 0; i < str.length()-word.length(); i++){
      String result = str.substring(i, i + word.length());
      System.out.println("result = " + result);
      if(result.equals(word)) {
        answer = result;
      }else {
        answer = answer;
      }
    }return answer;
  }
}