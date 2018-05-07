public class RectangleArea {
  public static void main(String[] args) {
    System.out.println("The area of a square with side 28 is " + rectangleAreaCalculation(28));
    System.out.println("The area of a square with side 13 is " + rectangleAreaCalculation(13));
  }
  
  public static double rectangleAreaCalculation(int side) {
    return Math.pow(side, 2);
  }
}