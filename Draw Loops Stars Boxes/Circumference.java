public class Circumference {
  public static void main(String[] args) {
    System.out.println("The rounded circumeference of a circle of diameter 10 is " + circumferenceCalculation(10));
    System.out.println("The rounded circumeference of a circle of diameter 35 is " + circumferenceCalculation(35));
  }
  
  public static double circumferenceCalculation(int diameter) {
    return Math.round( Math.PI * diameter);
  }
}