/* Write and test a method to print an array like:
[2 -4 6 -8 1 -3 5] */
import java.util.*;
import java.util.Arrays;

public class PrintArrayInBracketsMethod{
  public static void main(String[] args){
    int i = 0;
    int[] array = {2, -4, 6, -8, 1, -3, 5};
    System.out.print("[" + array[i] + " ");
    for(i = 1; i < array.length; i++){
      //note: array.length - 1 == last index of the array
      if(i != array.length-1){
          System.out.print(array[i] + " ");
      }else{
      System.out.print(array[array.length-1] + "]");
      }
    }
  }
}

