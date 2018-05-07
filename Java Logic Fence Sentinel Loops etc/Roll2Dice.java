import java.util.*;
public class Roll2Dice {
  public static void main(String[] args) {
    Random rand = new Random();
    rollDice(rand);
  }
  public static void rollDice(Random rand){
    int sum = 0;
    while (sum != 7) {
      int roll1 = 1 + rand.nextInt(6);
      int roll2 = 1 + rand.nextInt(6);
      System.out.println("The dice are " + roll1 + " and " + roll2);
      sum = roll1 + roll2;
    }
  }
}