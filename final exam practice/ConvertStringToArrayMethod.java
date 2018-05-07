import java.util.*;
import java.util.Arrays;

public class ConvertStringToArrayMethod{
  public static void main(String[] args){
    String s = "Convert a string to an array of strings";
    int len = s.length();
    char[] arr = new char[len];
    for(int i = 0; i < s.length(); i++){
      arr[i] = s.charAt(i);
    }//end for loop
    
    System.out.println(Arrays.toString(arr));
    //[1, 2, 3, 4, 5]
    System.out.print("[" + arr[0]);
    for(int j = 1; j < arr.length; j++){
        if(j != arr.length -1){
          System.out.print(", " + arr[j]);
        }else{
          System.out.print(", " + arr[arr.length -1] + "]");
        }
    }
  }
}