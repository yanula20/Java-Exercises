/* Write a program that inputs the length of a int array from the user and 
 * assigns 1 at index 0, assigns 2 at index 1, assigns 3 at index 2, and so on.  
 * One loop should assign values to each element of the array.  
 * A second loop should print the values of the array with spaces between the values.*/
import java.util.*;
import java.util.Arrays;
public class InitializeandShowIntegerArray{
  public static final  Scanner console = new Scanner(System.in);
  public static void main(String[] args){
    boolean continueLoop = true;
    int num = 0;
    
    while(continueLoop){
      System.out.print("Enter a (number of elements) length for an array.");
      while(!console.hasNextInt()){
      console.next();//flush buffer with erroneous string
      System.out.print("ERROR. You entered a string. Enter a (number of elements) length for an array.");
      }
      num = console.nextInt();
      if(num <= 0 ){
        System.out.println("ERROR. You entred a negative number.");
        continueLoop = true;//go back to while loop above
      }else{
        continueLoop = false;
      }
    }//end while
    int[] array = new int[num];
    for(int i = 0; i < array.length; i++){
      array[i] = i+1;
    }
    //[1, 2, 3, 4, 5]
    System.out.print("[");
    for(int j = 0; j < array.length; j++){
      if(j != array.length-1){
        System.out.print(array[j] + ", ");
      }else{
        System.out.print(array[array.length-1] + "]\n");
      }
    }
    //System.out.println(Arrays.toString(array));
  }
}