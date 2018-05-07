/* Activity: InitializeandShowDoubleArray
 Write a program that inputs the length of a double array 
 from the user and a value for initializing the array.  
 One loop should assign the value to each element of the array.  
 A second loop should print the values of the array with 
 spaces between the values.*/

import java.util.*;
import java.util.Arrays;
public class InitializeandShowDoubleArray{
  public static final  Scanner console = new Scanner(System.in);
  public static void main(String[] args){
    boolean continueLoop = true;
    double num = 0;
    double trash;
    while(continueLoop){
      System.out.print("Enter a (number of elements) length for a DOUBLE array.");
      
      while(!console.hasNextDouble()){
        console.next();//flush buffer
        System.out.print("ERROR. You entered a string. Enter a (number of elements) length for a DOUBLE array.");
      }
      
      num = console.nextDouble();
      if(num <= 0){
        System.out.println("ERROR. You entered a negative number. Please, enter a an length for a DOUBLE array.");
         continueLoop = true;
      }else{
       continueLoop = false;
      }
     
    } //end continueLoop while loop
    double[] array = new double[(int)num];
    for(int i = 0; i < array.length; i++){
      array[i] = i+1;
    }
    
    //[1, 2, 3, 4]
    System.out.print("[");
    for(int j = 0; j < array.length; j++){
      if(j != array.length-1){
        System.out.print(array[j] + ", ");
      }else{
        System.out.print(array[array.length-1] + "]\n");
      }
    }
    //System.out.println(Arrays.toString(array));
    }//end main
}//end program

