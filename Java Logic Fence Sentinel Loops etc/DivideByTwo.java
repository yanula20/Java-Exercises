import java.util.*;

public class DivideByTwo {
  public static void main(String[] args) {
    printDivBy2Result(200);
    printDivBy2Result(400);
  }
  
  //method takes a max input number and divides by 2 until 0 is reached, use while loop
  public static void printDivBy2Result (int max) {
    while(max > 0) {
    max = max/2;
      System.out.print(max + " ");
    }System.out.println();
  }
}