import java.util.*;

public class SimpleWhileLoop {
  public static void main(String[] args) {
    //Recall that Math.random() generates a random double between 0 and 1
    double rand = Math.random();
    int count = 0;
    while(rand < 0.5){
      System.out.printf("%3.2f ", rand);//prints rand value outside the while loop
      rand = Math.random();
      count++;
    }
    System.out.printf("%3.2f breaks us out of the while loop!" , rand);
    System.out.println(" The while loop ran " + (count) + " times while random num was less than .5 ."); //end while loop
    
    //Fence post loop after
    int num = 1;
    while (num < 200) {
      System.out.print("|" + num + "| ");//prints int outside of loop, if while loop test is passed
      num *= 2;
    }System.out.println("<--While loop runs while num is less than 200.");//spacing
    
    
//add odd numbers from 10 to 99
    int sum = 0;
    for (int j = 10; j <= 99; j++) {
      if (j % 2 == 1) {
        sum += j;
      }
    }System.out.println("The sum of odd numbers from 10 to 99 is " + sum);
    
//Count the number of blanks in a string.  How many times will this loop be executed?
    String s = "To be or not to be";
    int times = 0;
    for (int k = 0; k < s.length(); k++) {
      if (' ' == s.charAt(k)) {
        times++;
      }
    }System.out.println("The number of spaces in 'To be or not to be' is: " + times);
  }
}