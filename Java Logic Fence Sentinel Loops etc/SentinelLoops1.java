import java.util.*;

public class SentinelLoops1 {
  //class constant for user input
  public static final Scanner console = new Scanner(System.in);
  public static void main(String[] args){
  
  System.out.print("Enter a sentinel value-->");
  int sentinel = console.nextInt();
  sentinelSum(sentinel, console);
  }

  public static void sentinelSum(int sentinel, Scanner console){
    int sum = 0;
    System.out.print("Enter a number for the loop--> ");
    int value = console.nextInt();
    while(value != sentinel){
    System.out.print("Enter a number for addition or " + sentinel + " to quit adding.");
    value = console.nextInt();
    sum = sum + value;
    }
    System.out.println("Your sum is " + sum);
  }
}