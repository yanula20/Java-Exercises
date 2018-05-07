//three solutions to print the following: 1, 2, 3, 4, 5
import java.util.*;
public class ThreeFencePostLoops{
     //class constant
   public static final int MAX_NUMBER = 5;
  public static void main(String[] args){
    fencePostSolution1();
    System.out.println();
    fencePostSolution2();
    System.out.println();
    fencePostSolution3();
  }
  public static void fencePostSolution1(){
    System.out.print(1);
    for(int i = 2; i <= MAX_NUMBER; i++){
     System.out.print(", " + i);
    }
  }
  // 1, 2, 3, 4, 5
    public static void fencePostSolution2(){
    for(int i = 1; i <= MAX_NUMBER -1 ; i++){
      System.out.print(i + ", " );
    }
    System.out.println(MAX_NUMBER);
  }
    
    // 1, 2, 3, 4, 5
    public static void fencePostSolution3(){
    for(int i = 1; i <= MAX_NUMBER; i++){
     
      if(i != MAX_NUMBER) {
       System.out.print(i + ", " );
      }else {
        System.out.println(i);
      }
    }
  } 
}