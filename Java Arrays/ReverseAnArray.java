import java.util.*;
import java.util.Arrays;

public class ReverseAnArray{
  public static final Scanner console = new Scanner(System.in);
  public static void main(String[] args){
    System.out.print("Enter the size of your array");
    int len = console.nextInt();
    
    //initialized to all zeros by default
    int[] arr = new int[len];
    
    //user provides input for array elements
    //alternatively: (int i = 0; i < arr.length; i++)
    //alternatively: (int i = 0; i <= array.length-1; i++)
    for(int i = 0; i <= len - 1; i++) {
      arr[i] = console.nextInt();
    }
    
    int temp;
    int start = 0;
    int end = arr.length - 1;//note: for arrays, arr.length() is wrong; no "()" needed
    while(start < end){
      temp = arr[start];//copy of first array element
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }//end while loop
    System.out.println(Arrays.toString(arr));
  }//end main
}//end program