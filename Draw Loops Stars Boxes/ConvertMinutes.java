/*Determine the expressions to convert 1000 minutes 
 * into number of hours and the number of minutes leftover.*/

public class ConvertMinutes {
  public static void main(String[] args) {
    System.out.println("Number of hours in 1000 minutes equals " + 1000 / 60);
    System.out.println("The number of minutes left over after calculating hours equals " + 1000 % 60);
  }
}