import java.util.*;

public class PercentCorrect_PrePostCondition {
  public static final Scanner console = new Scanner (System.in);
  public static void main(String[] args) {
 
  getIntro();
  double totalQuestions = numberOfQuestions(console); 
  double correct = correctAnswers(console);
  reportPercentCorrect(correct, totalQuestions );
  
  }
  
  public static void getIntro() {
    System.out.println("This program calculates your class grade.");
  }
  
  public static double numberOfQuestions(Scanner console) {
    System.out.print("Enter the number of questions on the test.");
    double questions = console.nextDouble();
    return questions;
  }
  
  public static double correctAnswers(Scanner console) {
    System.out.print("Enter the number of correct answers.");
    double answers = console.nextDouble();
    return answers;
  }
  
  public static void reportPercentCorrect(double correct, double totalQuestions) {
    double grade = (correct/totalQuestions) * 100;
   System.out.printf("Your grade on the test is %3.2f%%\n", grade);
  }
}