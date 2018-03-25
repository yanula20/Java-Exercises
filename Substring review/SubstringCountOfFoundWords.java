import java.util.*;
import java.awt.*;

public class SubstringCountOfFoundWords {
  public static final Scanner console = new Scanner(System.in);
  public static void main(String[] args) {
   
    String str = "A neighbor bring food with death and flowers with sickness. Boo Radley was our neighbor.";
    String word = "neighbor";
    int result = findWord(str, word);

    if(result != 0) {
      System.out.println("Your word " + "\"" + word + "\"" + " was found " + result + " time(s)!");
    }else{
      System.out.println("Your word was not found!");
    }
  }
  
  public static int findWord(String str, String word) {
  int count = 0;
    for(int i = 0; i < str.length()-word.length(); i++){
      String result = str.substring(i, i + word.length());
      if(result.equals(word)) {
        count++;
      }
    }return count;
  }
}