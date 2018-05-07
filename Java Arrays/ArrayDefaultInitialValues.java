import java.util.*;
import java.util.Arrays;
public class ArrayDefaultInitialValues{
  public static final  Scanner console = new Scanner(System.in);
  public static void main(String[] args){
    createArrayOfDoubles(console, "Please enter the number elements for an array of doubles (positive integer)");
    createArrayOfStrings(console, "Please enter the number elements for an array of strings (positive integer)");
  }
  
  public static void createArrayOfDoubles(Scanner console, String str){
    double num = 0.0;//default for array elements
    double value = 0.0;
  
    while(num <= 0.0){
        System.out.print(str);
        num = console.nextDouble();
    }
    
    double []arrayDouble = new double[(int)num];
    System.out.println(Arrays.toString(arrayDouble));
    for(int i = 0; i < arrayDouble.length; i++){
      System.out.print("Please enter an array value (double)");
      
      while(!console.hasNextDouble()){
        System.out.print("Please enter an array value (double)");
        String trash = console.next();//flush buffer
      }
      value = console.nextDouble();
      arrayDouble[i] = value;
    }//end for loop
    
    System.out.println(Arrays.toString(arrayDouble));
  }
  
  public static void createArrayOfStrings(Scanner console, String str){
    int num = 0;

    while(num <= 0){
      System.out.print(str);
      num = console.nextInt();
    }//end while
    
    String[] arrayStrings = new String[num];
    System.out.println(Arrays.toString(arrayStrings));
    for(int j = 0; j < arrayStrings.length; j++){
      String val = "";
      while(val == ""){
        System.out.print("Please enter an element for the string array");
        val = console.next();
      }//end while
      arrayStrings[j] = val;
    }//end for loop
    
    System.out.println(Arrays.toString(arrayStrings));
  }
}//end program


