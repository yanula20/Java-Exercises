// We need a Java utility (the Scanner class) for keyboard input.
import java.util.*;

public class BMI1 {
    // set up a class constant named CONSOLE to read from the keyboard
    public static final Scanner CONSOLE = new Scanner(System.in);

    public static void main(String[] args) {
        // declare variables
        double height;
        double weight;
        double bmi;

        // get values from keyboard, store them in variables
        System.out.println("Enter height:");
        height = CONSOLE.nextDouble();
        System.out.println("Enter weight:");
        weight = CONSOLE.nextDouble();

        // compute BMI and store it in a variable
        bmi = weight / (height * height) * 703;

        // Print values and BMI
        System.out.println("Height is " + height);
        System.out.println("Weight is " + weight);
        System.out.println("BMI is " + bmi);
    }
}