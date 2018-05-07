/* 150 5
 5.1 3.5 1.4 0.2  1
 4.9 3.0 1.4 0.2  1
 4.7 3.2 1.3 0.2  1
 4.6 3.1 1.5 0.2  1
 5.0 3.6 1.4 0.2  1 */
import java.util.*;
import java.util.Arrays;
import java.io.*;

public class MultidimensionalArray{
  public static void main(String[] args)throws FileNotFoundException{
    Scanner input = new Scanner(new File("iris.txt"));
    
    int rows = 150;
    int cols = 5;
    int max;
    double[][] iris = new double[rows][cols];
    // This assignment also initializes the new array with zeroes.
    int sum = 0;
    int[ ] counts = new int[80];
    int[] totals = new int[80];
    for (int row = 0; row < rows; row++) {
      for (int col = 0; col < cols; col++) {
        int timesTen = (int) Math.round(10 * iris[row][col]);
       sum = sum + counts[timesTen]++;
       
      }
    }
    System.out.println("The total of the elements " + sum);
    
    
    
    for (int row = 0; row < rows; row++){
      for(int col = 0; col < cols; col++){
        iris[row][col] = input.nextDouble();
        
      }
    }
    
    for (int row = 0; row < rows; row++){
      for(int col = 0; col < cols; col++){
       System.out.print(iris[row][col] + ", ");
      }
    }
    
    for (int row = 0; row < rows; row++){
      //System.out.println(Arrays.toString(iris[row]));
    }
    // System.out.println(Arrays.toString(iris));//[D@6465d570; these are pointers to the array objects
    //System.out.println(Arrays.toString(iris[0]));
    
  }
}

