/* Activity: Print Long Array in Brackets Method
 Write a program to print a longer array like:
 int[ ] list = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
 31, 37, 41, 43, 47, 53, 59, 61, 67,
 71, 73, 79, 83, 89, 97};
 in brackets with no more than 10 numbers per line. */
import java.util.*;
import java.util.Arrays;

public class PrintLongArrayInBracketsMethod{
  public static void main(String[] args){
    int i = 0;
    int[ ] list = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
      31, 37, 41, 43, 47, 53, 59, 61, 67,
      71, 73, 79, 83, 89, 97};
    System.out.print("[" + list[i] + ", ");
    for(i = 1; i < list.length; i++){
      //note: list.length - 1 == last index of the array
      if(i%9 != 0 && i != list.length-1 ){//all elements except last in the row and very last element
        System.out.print(list[i] + ", ");
      }else if(i%9 == 0 && i != list.length-1){//last row elements only
               System.out.print(list[i] + ",\n");
      }else {
        System.out.print(list[list.length-1] + "]");//very last element
      }
    }
  }//end main
  
  
}
