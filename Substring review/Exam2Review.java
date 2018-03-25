import java.util.*;
import java.awt.*;

public class Exam2Review {
  public static final Scanner console = new Scanner (System.in);
  public static void main(String[] args){
    double median = calculateMedian(93,897,67);
    System.out.println(median);
    double lowest = lowestOfThree(1274,350,839);
    System.out.println(lowest);
    int mostFavorite = getInt(console, "Enter your most favorite integer: ");
    System.out.println("Favorite integer " + mostFavorite);
    int leastFavorite = getInt(console, "Enter your least favorite integer: ");
    System.out.println("Least favorite integer " + leastFavorite);
    double inputDouble = getInput(console, "Enter a double please?");
    System.out.println(inputDouble);
  }
  
  public static int getInt(Scanner console, String string) {
  System.out.print(string);
  int response = console.nextInt();
  return (int)response;
  }
  //method overloading?? type and argument
  public static double getInput(Scanner console, String string) {
  System.out.print(string);
  double response = console.nextDouble();
  return response;
  }
  public static double calculateMedian(double a, double b, double c){
    double lower = Math.min(b,c);
    double middle = Math.max(lower,a);
    return middle;
  }
  public static double lowestOfThree(double a, double b, double c){
    double min = c;//think of c as the highest num
    if(b < c) {//min becomes b
      min = b;
      if(a < b) {//contine checking b
       return  min = a;
      }else{
         return min = b;
      }
    }else{//min remains c
      if(a < c ){
      return  min = a;
      } else {
       return min = c;
      }
    }
  }
}