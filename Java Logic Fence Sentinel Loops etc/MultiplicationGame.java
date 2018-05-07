import java.util.*;

public class MultiplicationGame{
  
  public static void main(String[] args){
    playGame();
  }
  public static void playGame(){
    Scanner console = new Scanner(System.in);
    System.out.println("Goal: Answer 3 multiplication problems correctly.");
    Random r = new Random();
    int answer;
    int response = 0;
    int a = r.nextInt(20)+1;
    int b = r.nextInt(20)+1;
    answer = a * b;
    while(response != answer){

      System.out.print("What is the answer to the problem " + a + " x " + b + "?");
      if(!console.hasNextInt()){
      System.out.println("Invalid response. Try again!");
      console.next();//flush buffer
      }else {
       response = console.nextInt();
      }
     
      if(answer == response){
        System.out.println("Correct!");
      }else{
        System.out.println("Sorry. Inorrect!");
      }
    }
  }
}