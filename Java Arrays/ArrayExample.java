import java.util.*;
public class ArrayExample {
  public static void main(String[] args) {
    int[] array1 = {1,2,3};
    int[] array2 = {3,4};
    int[] array3 = array1;//array3 stores ref that points to array1,[1,2,3]
    int[] array4 = array2;//array4 stores ref that points to array2, [3,4]
    System.out.println(Arrays.toString(array1)+Arrays.toString(array2));//[1,2,3][3,4]
    array3[0] = 5;//output of array1 and array3: [5,2,3]
    array4[1] = 7; //output of array2 and array4: [3,7]
    System.out.println(Arrays.toString(array1)+Arrays.toString(array2));//[5,2,3][3,7]
    array1 = array4; //output of array1 and array4 and array2: {3,7}
    System.out.println(Arrays.toString(array1)+Arrays.toString(array2));//output [3,7][3,7]
    System.out.println(Arrays.toString(array3));
  }
}
/* 
 * How many integer array variables does this program have? 4
 * How many integer array objects does this program have? 2
 * What is printed by this program?
 * After the first line is printed, how many arrays (vs pointers) can this program access? 
 * After the last line is printed, how many arrays can this program access? 2
 * Suppose we add the line:
   array3 = array1; //output of array1 and array4, aand array3,  array2: {3,7}
 * at the end of the program. How many arrays (vs pointers) can this program now access? 1
*/