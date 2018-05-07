import java.util.*;

public class RockPaperScissors{
  public static void main(String[] args){
  Random r = new Random();
  playGame(r);
  }

  public static void playGame(Random r){
  int player1 = r.nextInt(3);// 1 to 3
  int player2 = r.nextInt(3);// 1 to 3
  int rock = 0;
  int paper = 1;
  int scissors = 2;
  if(player1 == 0){
    System.out.println("Player1 = rock");
  }else if(player1 == 1){
       System.out.println("Player1 = paper");
  }else if(player1 == 2){
       System.out.println("Player1 = scissors");
  }
  
  if(player2 == 0){
    System.out.println("Player2 = rock");
  }else if(player2 == 1){
       System.out.println("Player2 = paper");
  }else if(player2 == 2){
       System.out.println("Player2 = scissors");
  }
  if(player1 == 0 && player2 == 2){//rock beats scissors
   System.out.println("Player1 wins");
  }else if(player1 == 1 && player2 == 0){
    System.out.println("Player1 wins");
  }else if(player1 == 2 && player2 == 1){
    System.out.println("Player1 wins");
  }else if(player1 == player2){
    System.out.println("Tie game!");
  }else{
    System.out.println("Player2 wins");
  }
 
  }
}