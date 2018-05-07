import java.util.*;
import java.util.Arrays;

public class MaxMinAvgElementOfArray{
  public static void main(String[] args){
    int max = 0;
    int min = 0;
    int avgCount = 0;
    String avgCountString = "";
    Random rand = new Random();
    int arrayLength = rand.nextInt(10)+1;//+1 ensures that 0 is not selected; outofbounds 
    int[] arr = new int[arrayLength];
    System.out.println("The random array length is: " + arrayLength);
    for(int i = 0; i < arr.length; i++){
      arr[i] = rand.nextInt(100);
    }//end for loop
    
      max = arr[0];
      min = arr[0];
      double avg;
      int sum = 0;
    for(int j = 0; j < arr.length; j++){
      if(arr[j] > max){
        max = arr[j] ;
      }else{
        max = max;
      }
      
     if(arr[j] < min){
        min = arr[j];
      }else{
        min = min;
      } 
      
      sum = sum + arr[j];
      
    }//end for loop
    
    avg = (double)sum/arr.length;
     
      for(int y = 0; y < arr.length; y++){
        if((double)arr[y] > avg){
        avgCount++;
        }
      }//end for loop
      
      int[] aboveAvg = new int[avgCount];
      int z = 0;
      for(int y = 0; y < arr.length; y++){
       
        if((double)arr[y] > avg){
          aboveAvg[z] = arr[y];
          z++;
        }
      }//end for loop
    System.out.println(Arrays.toString(arr));
    System.out.println("The max element of the array is: " + max);
    System.out.println("The min element of the array is: " + min);
    System.out.println("The average of the arrays is: " + avg);
    System.out.println("There were " + avgCount + " elements above the average.");
    System.out.print("Elements above the average: " + Arrays.toString(aboveAvg) );

  }//end main
}//end program