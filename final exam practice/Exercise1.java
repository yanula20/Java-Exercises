//print out 36, 25, 16, 9, 4, 1

import java.util.*;
public class Exercise1 {
  public static void main(String[] args){
    int[] arr = {6, 5, 4, 3, 2, 1};
    for(int i = 6; i >= 1; i--){
      if(i != 1){
      System.out.print(i*i + ", ");
      }else{
      System.out.print(i*i + "\n");
      }
    }
    System.out.println("method 1 above, method 2 below");//spacing
    squareArrayElements(arr);
  }//end main
  public static void squareArrayElements(int[] arr){
    for(int i =  0; i < arr.length; i++){
      int square = (int)Math.pow(arr[i], 2);
      if(i != arr.length - 1){
        System.out.print(square + ", ");
      }else{
        System.out.print(square);
      }
    }
  }
}