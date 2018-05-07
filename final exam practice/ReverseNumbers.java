import java.util.*;
import java.util.Arrays;

public class ReverseNumbers{
  public static final Scanner console = new Scanner(System.in);
  public static void main(String[] args){
    System.out.print("Enter a number to be reversed: ");
    int num = console.nextInt();
    String temp = " ";
    System.out.println(num);
    System.out.println(num%10);
    int numDiv = 1;
    while(numDiv > 0){
      temp =  temp + num%10;
      numDiv = num / 10;
      num = numDiv;
      System.out.println(numDiv);
    
    }//end while
    System.out.println("Your number reversed is: " + temp);
  }
}