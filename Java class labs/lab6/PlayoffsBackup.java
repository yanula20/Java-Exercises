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
public class PlayoffsBackup{
  
  // set up a class constant named CONSOLE to read from the keyboard  
  public static final Scanner console = new Scanner(System.in);
  
  //main method of Playoffs program
  public static void main(String[] args) {
    
    //print info about the Playoff program for the user
    printProgramInfo();
    
    //create random object to be passed to the winnterByTenGames method
    Random rand = new Random();
    
    /* getOneGameParameters() method retrieves the chances that team 1 will win a one game match. 
     * The returned value (tenGameChances) is passed to the winnerByTenGames method()*/
    int tenGameChances = getOneGameParameters(console);
    
    /* This method calculates which team accumulates TEN MORE 7-game series wins
     * than the other team. This method calls calls the 7-game series method (playSevenGameSeries)
     * which, in turn calls, the playOneGame() method which is played repeatedly until 
     * a winner of 7 games is returned. 
     */
    winnerByTenGames(rand, tenGameChances);
  }
  
  //Print brief description of the Playoffs program
  public static void  printProgramInfo() {
    System.out.println("Simulate a best-of-seven games playoff using information supplied by the user.");
    System.out.println("Print information about the result of each simulated playoff");
    System.out.println("and about the result of multiple simulations.");
    System.out.println();
  }
  
  /* get parameter - percent chance of winning for Team 1 in a single game versus Team 2, 
   * validate it with while loop, then return the validated input (chancesTeamOne) to be used
   * as parameter input to winnerByTenGames() method which calls the 7-game series method which 
   * ,in turn, calls the playOneGame() method repeatedly until a 7-game series winner is declared.
   */
  public static int getOneGameParameters(Scanner console) {
    int chancesTeamOne = 100;//default value to enter flow control of while loop below
    
    while(chancesTeamOne < 0 || chancesTeamOne > 99){
      System.out.print("Enter the percent chance that Team 1 will win the game: (0 to 99).");
      chancesTeamOne = console.nextInt();
    }
    return chancesTeamOne;
  }
  
  // Calculate the winner of a single game between teams 1 and 2 
  public static int playOneGame(Random rand, int chancesTeamOne) {
    rand = new Random();
    int num1 = rand.nextInt(100);
    if(num1 < chancesTeamOne) {//0 - 50 represents 51% of 0 - 99: A team 1 WIN!
      return 1;
    } else {
      return 0;
    }
  }
  
  
  
  //Calculate the winner of a 7-game series between teams 1 and 2
  public static int playSevenGameSeries(Random rand, int chancesTeamOne) {
    int oneGameResults = -1;
    int gamesPlayed = 0;
    int teamOneCount = 0;//default value to enter flow control of while loop below
    int teamTwoCount = 0;//default value to enter flow control of while loop below
    int winner = -1;
    
    
    /* When while fires for the first time, one teamCount will be 0; the other must be 1; 
     * teamCounts go from 0 to 6, no one team can win more than four games, 0 allows for a 4 - 0
     * series total;
     * 0 to 7; a team count <3 allows for a series sweep, i.e. 4  to 0 wins or 0 to 4 wins; 
     */
   
    while( (teamOneCount + teamTwoCount) < 7 && (teamOneCount < 4 && teamTwoCount < 4)){
      if(oneGameResults == 1) {
        teamOneCount++;
      }else  {
        teamTwoCount++;
      }
      gamesPlayed++;
      oneGameResults = playOneGame(rand, chancesTeamOne);
    }//end while loop
    
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
   * until one team has one 10 more play-off series wins than the second team.*/
  public static void winnerByTenGames(Random rand, int tenGameChances) {
    int team1 = 0;
    int team2 = 0;
    int playOffWins;
    String tally = "";
    String tally1;
    String tally2;
    int test = 0;
    
    /* while loop fires at 0 b/c initial the difference between team 1 and team 2 wins is 0. While loop runs
     * until abs value of diff of playoff wins is 10, therefore test < 10*/
    while(test < 10 ) {
      playOffWins = playSevenGameSeries(rand, tenGameChances);
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
    System.out.println("Team 1 won " + team1 + " game(s). " + "Team 2 won " + team2 + " game(s).");
  }
} 



