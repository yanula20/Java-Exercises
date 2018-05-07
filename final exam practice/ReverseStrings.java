import java.util.*;
import java.util.Arrays;

public class ReverseStrings{
  public static final Scanner console = new Scanner(System.in);
  public static void main(String[] args){
    System.out.print("Enter a string to be reversed: ");
    String str = console.next();
    int end = str.length() - 1;
    String temp = " ";
    System.out.println(str);
    for(int i = end; i >= 0; i--){
      temp = temp + str.charAt(i);
    }//enf for loop
    System.out.println("Your string is:" + temp);
  }//end main
}
