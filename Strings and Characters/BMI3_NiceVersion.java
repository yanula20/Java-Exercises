//This program finds the BIM for two individuals. 

import java.util.*;

public class BMI3_NiceVersion {

  public static void main(String[] args) {
  
    giveIntro();
    Scanner console = new Scanner(System.in);
    double bmi1 = getBMI(console);
    double bmi2 = getBMI(console);
    reportResults(bmi1, bmi2);
  
  }

  public static void giveIntro() {
    System.out.println("This program reads data for two");
    System.out.println("people and computes their body");
    System.out.println("mass index and wight status");
  }
  
  //prompts for one person's stats and returns BMI
  public static double getBMI(Scanner console) {
    System.out.println("Enter the next person's info: ");
    System.out.print("Enter height in inches: ");
    double height = console.nextDouble();
    System.out.print("Enter weight in pounds: ");
    double weight = console.nextDouble();
    double bmi = BMIFor(height, weight);
    System.out.println();
    return bmi;
  }
  
   //this method contains the formula for BMI
  public static double BMIFor(double height, double weight) {
    return weight/ (height * height) * 703;
  }
  
   //this method reports the overal bmi values and weight status
  public static void reportResults(double bmi1, double bmi2) {
    System.out.printf("Person #1 body mass index = %5.2f\n", bmi1);
    reportStatus(bmi1);
    System.out.printf("Person #2 body mass index = %5.2f\n", bmi2);
    reportStatus(bmi2);
  }
  
  //reports the wieight status for a given BMI value
  public static void reportStatus(double bmi) {
    if(bmi < 18.5) {
    System.out.println("Underweight!");
    } else if(bmi < 25) {
    System.out.println("Normal!");
    } else if(bmi < 30) {
     System.out.println("Overweight!");
    } else { // bmi >=30
     System.out.println("Obese!");
    }
  } 
}