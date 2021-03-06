import java.util.*;
public class Hailstone {
  public static final Scanner console = new Scanner(System.in);
  public static void main(String[ ] args) {
    System.out.println("This program performs the hailstone calculation.\n");
    
    System.out.print("Enter a hailstone value:  ");
    int value = console.nextInt( );
    
    System.out.print("Enter a hailstone length: ");
    int length = console.nextInt( );
    doHailstoneCalculation(value, length);
    
  }
  
  public static void doHailstoneCalculation(int value, int length) {
    int max = value;
    int min = value;
    int i;
    //first value = user input, so length-1
    System.out.print(value); 
    for (i = 1; i <= length-1; i++) {
      
      if (value%2 == 0) {
        value = value/2;
        System.out.print(", " + value); 
      }else if(value%2 == 1){
        value = 3 * value + 1;
        System.out.print(", " + value);
      }
      
      //max is lowest, bottom value, while min is highest value at top
      if(value > max) {
        max = value;
      } 
      
      if (value < min){
        min = value;
      }
    }System.out.print("\n");
    
    System.out.println("max = : " + max);
    System.out.println("min = : " + min);
    
  }
}