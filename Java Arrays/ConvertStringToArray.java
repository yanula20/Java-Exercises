import java.util.*;
import java.util.Arrays;

public class ConvertStringToArray{
  public static void main(String[] args){
    char[] stringInArray = toCharArray("This is a test");
    System.out.println(Arrays.toString(stringInArray));
  }
  
  //note: return type will be char for function when string is segmented for the array
  public static char[ ] toCharArray(String str) {   
    char[ ] elements = new char[str.length( )];
    for (int i = 0; i < str.length( ); i++) {
      elements[i] = str.charAt(i);
    }
    return elements;
  }
}
