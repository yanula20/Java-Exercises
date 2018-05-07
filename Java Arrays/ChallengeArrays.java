import java.util.*;
public class ChallengeArrays{
  public static final  Scanner console = new Scanner(System.in);
  public static void main(String[] args){
  boolean continueLoop = true;
  double sum = 0;
  int count = 0;
  double temp = 0;
   while(continueLoop){
     System.out.print("Enter a temperature reading (enter -999 when done).");
     temp = console.nextDouble();
     if(temp != -999){
        count++;
        sum = sum + temp;
     }else{
       continueLoop = false;
     }
   }
   double average = sum / count;
   System.out.println("Sum of " + count + " temp readings is " + sum + ". The avg temp is " + average);
  }
}