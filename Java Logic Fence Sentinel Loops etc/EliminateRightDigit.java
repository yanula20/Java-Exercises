import java.util.*;

public class EliminateRightDigit {
  public static void main(String[] args) {
    System.out.println("This program eliminates the far right digit of 1048576");
    System.out.println("The program prints the remaing digits as each right-most");
    System.out.println("is deleted.");
    killRightDigit(1048576);
    killRightDigit(274849473);
  }
  public static void killRightDigit(int num) {
    //while loop is primed from killRightDigit parameter.
    while (num != 0){
      num = num/10;
      System.out.print(num + " ");
    }
    System.out.println();
  }
}
