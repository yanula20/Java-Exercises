import java.util.*;

public class FibonacciDoWhile {
  public static void main(String[] args){
    printFibonacci();
  }
  
  public static void printFibonacci(){
    int previous = 0;
    int next = 1;
    int fibonacciSum;

    System.out.print(previous + " " + next + " "); // 0 1
    fibonacciSum = previous + next;
     System.out.print(fibonacciSum + " ");// 0 1 1
    do{
      previous = next;
      next = fibonacciSum;
      fibonacciSum = previous + next;
      System.out.print(fibonacciSum  + " ");
      fibonacciSum = previous + next;
    }while(fibonacciSum < 89);
  }
}