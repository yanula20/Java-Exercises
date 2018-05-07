import java.util.*;

public class RockPaperScissors2{
  public static void main(String[] args){
    Random r = new Random();
    playGame(r);
  }

  public static void playGame(Random r){
    int count = 1;
    int test = 0;//prime the loop
    int p1_win = 0;
    int p2_win = 0;
    while(test < 3){
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
        p1_win++;
      }else if(player1 == 1 && player2 == 0){
        System.out.println("Player1 wins");
        p1_win++;
      }else if(player1 == 2 && player2 == 1){
        System.out.println("Player1 wins");
        p1_win++;
      }else if(player1 == player2){
        System.out.println("Tie game!");
      }else{
        System.out.println("Player2 wins");
        p2_win++;
      }
      count++;
      test = Math.abs(p1_win - p2_win);//update the loop
    }System.out.println(count + " games were played before a player won by 5 games");
  }
}