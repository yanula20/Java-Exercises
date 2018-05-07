import java.util.*;

public class SumNumbers {
  
  public static final Scanner CONSOLE = new Scanner(System.in);
  
  public static void main(String[] args) {
    
    System.out.print("Find the sum all numbers between a start and end number.");
    System.out.print("\n");
    System.out.print("Enter start number of sum: ");
    int startNum = CONSOLE.nextInt();
    System.out.print("Enter end number of sum: ");
    int endNum = CONSOLE.nextInt();
    System.out.println("Your sum of all your numbers is " + sumOfAllNumbers(startNum,endNum) + ".");
  }
  
  public static int sumOfAllNumbers(int startNum, int endNum) {
    int sum = 0;
    int i;
    for(i = startNum; i <= endNum; i++) {
      sum += i;
    } return sum;
  }
}