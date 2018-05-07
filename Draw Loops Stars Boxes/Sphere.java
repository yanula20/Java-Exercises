//Java utility that includes the Scanner package
import java.util.*;

//Sphere.java program
public class Sphere {
  //class constant for the user's input CONSOLE
  public static final Scanner CONSOLE = new Scanner(System.in);
  
  //class constant for PI
  public static final double PI = 3.14;
  
  public static void main(String[] args) {
    //User input for diameter
    System.out.print("Enter the diameter of the sphere: ");
    double diameter = CONSOLE.nextDouble();
    
    //calculation for the circumference
    double circumference = diameter * PI;
    
    //output statement for the diameter that the user provided
    System.out.println("The diameter of the sphere equals " + diameter);
    
    //spacing
    System.out.println();
    
    //calculation of the radius based on user's diameter
    double radius = diameter / 2;
    
    //output statement for the calculated circumference
    System.out.println("The circumference of your sphere is " + circumference);
    
    //spacing
    System.out.println();
    
    //Output statement with calculated Volume of sphere
    System.out.println("The volume of your sphere is " + ((4 / 3 * PI) * ((double)Math.pow(radius, 3)))); 
  }
}