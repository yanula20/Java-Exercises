/* Technical note: Random method.
 * Here, the nextInt method of the Random class is used 
 * to generate a random int between 0 and 99.  Change 
 * the 100 to a different value if you want a different range. 
 * Each integer between 0 and 99 is equally likely.  51 of these 
 * integers are less than 51 (from 0 to 50), so testing if the 
 * integer is less than 51 means that 51 integers make the test true, 
 * and that 49 integers make the test false, a 51% chance of being true! 
 */

//We need a Java utility (the Scanner class) for keyboard input.
import java.util.*;

//main java program
public class Playoffs{
  
  // set up a class constant named CONSOLE to read from the keyboard  
  public static final Scanner console = new Scanner(System.in);
  
  /* main method of Playoffs program. This method asks the user 
   * for the percent chance that team 1 will a game.  It should ensure that 
   * the user enters an integer between 0 and 100.  This method must use a 
   * while loop to ensure that a valid value has been entered.  After obtaining 
   * a valid value, the main method should construct a Random object. Finally, 
   * the main method should pass the two values (the percent chance and the 
   * Random object) to the third method winnerByTenGames().*/
  public static void main(String[] args) {
    System.out.println("Lab 6 written by Don Moore, UTSA ID: qxv177");
    
    //print info about the Playoff program for the user
    printProgramInfo();
    
    //default value to enter flow control of while loop below
    int chanceThatTeamOneWins = 100;
    
    //while loop to ensure that a valid value has been entered for percent chance that team one wins.
    while(chanceThatTeamOneWins < 0 || chanceThatTeamOneWins > 99){
      System.out.print("Enter the percent chance that Team 1 will win the game: (0 to 99).");
      chanceThatTeamOneWins = console.nextInt();
    }
  
    //create random object to be passed to the winnterByTenGames() method
    Random rand = new Random();

    
    /* This method calculates which team accumulates TEN MORE 7-game series wins
     * than the other team. This method first calls the 7-game series method (playSevenGameSeries)
     * which, in turn calls, the playOneGame() method. The playOneGame() method is called repeatedly until 
     * a winner of a 7-game series is returned. 
     */
    winnerByTenGames(rand, chanceThatTeamOneWins);
  }
  
  //Print brief description of the Playoffs program
  public static void  printProgramInfo() {
    System.out.println("Simulate a best-of-seven games playoff using information supplied by the user.");
    System.out.println("Print information about the result of each simulated playoff");
    System.out.println("and about the result of multiple simulations.");
    System.out.println();
  }
  
  /* This plays a single game and has  two parameters: 
   * the percent chance that Team 1 will win the game, and a Random object.  
   * This method should only generate one random number.  This method should return 
   * one value if Team 1 wins and a different value if Team 1 loses */
  public static int playOneGame(Random rand, int chancesTeamOne) {
    rand = new Random();
    int num1 = rand.nextInt(100);
    if(num1 < chancesTeamOne) {//0 - 50 represents 51% of 0 - 99: A team 1 WIN!
      return 1;
    } else {
      return 0;
    }
  }
  
  /* This method simulates a playoff, that is, to play games until one team wins four games.  
   * This method has two parameters: the percent chance that Team 1 will win the game, and a Random object.  
   * This method should return different values depending on which team wins. */
  public static int playSevenGameSeries(Random rand, int chancesTeamOne) {
    int oneGameResults;//variable stores either 1 or 0, indicating the winner of each game
    int winner;
    int gamesPlayed = 0;
    int teamOneCount = 0;//default value to enter flow control of while loop below
    int teamTwoCount = 0;//default value to enter flow control of while loop below
    
    /* When while fires for the first time, both teamCounts will be 0; 
     * After each game, one (winner) teamCount is incremented by 1 .the other count is not incremented; 
     * Sum of teamCounts increment from 0 to 6, 
     * No one team can win more than four games, 0 allows for a 4 - 0
     * series total;
     * (teamOneCount + teamTwoCount) < 7, or 0 to 6 gives a possibility of 7 games; 
     * The while loop tests teamcounts < 4 or 0,1,2,3 allows for a series sweep, i.e. 
     * 4  to 0 wins or 0 to 4 wins; while loop also exits as false as soon as either team is 
     * greater than team count < 4;
     */
   
    while( (teamOneCount + teamTwoCount) < 7 && teamOneCount < 4 && teamTwoCount < 4){
      
      //the playOneGame() method is called repeatedly until a winner of a 7-game series is decclared
      oneGameResults = playOneGame(rand, chancesTeamOne);
      if(oneGameResults == 1) {
        teamOneCount++;
      }else  {
        teamTwoCount++;
      }
      gamesPlayed++;
    }//end while loop
    
    //determines the winner of 7-game series by tallying game wins
    if(teamOneCount > teamTwoCount ) {
      winner = 1;
    } else{
      winner = 0;
    }
    //The two print lines below are for testing purposes only
    //System.out.println("7-game team1 count:" + teamOneCount + " 7-game team2 count:" + teamTwoCount + " ");
    //System.out.println("games played " + gamesPlayed);
    return winner; 
  }
  
  /* This method calculates the winner of 2 teams that continue to play 7-game series 
   * until one team has one 10 more play-off series wins than the second team.
   * This method has two parameters: the percent chance that Team 1 will win the game,
   * and a Random object.  This method should print a 1 every time team 1 wins, and print 
   * a 2 every time team 2 wins; this should all be on one line.  This method should also print 
   * the final results. 
   */
  public static void winnerByTenGames(Random rand, int chanceThatTeamOneWins) {
    int team1 = 0;
    int team2 = 0;
    int playOffWins;
    String tally = "";
    String tally1;
    String tally2;
    int test = 0;
    
    /* while loop fires at 0 b/c initial the difference between team 1 and team 2 wins is 0. 
     * While loop runs until absolute value of diff of team playoff wins is 10, i.e (test < 10) */
    while(test < 10 ) {
      playOffWins = playSevenGameSeries(rand, chanceThatTeamOneWins);
      if(playOffWins == 1) {
        team1++;
        tally1 = tally + "1 ";
        System.out.print(tally1);
      }else if((playOffWins == 0)){
        team2++;
        tally2 = tally + "2 ";
        System.out.print(tally2);
      }
      test = (int)Math.abs(team1 - team2);//test must be at the end of while loop
    }//end while loop
    System.out.println();//spacing
    System.out.println("Team one won " + team1 + " game(s). " + "Team two won " + team2 + " game(s).");
  }
} 



