//We need a Java utility (the Scanner class) for keyboard input.
import java.util.*;

//java utility for input and output
import java.io.*;

//Java utility for the Drawing panel
import java.awt.*;

//Main program - Survivor III
public class SurvivorIII {
  //class constant for user input
  public static final Scanner console = new Scanner(System.in);
  
  //class constant that fixes runner, chaser, and zombie size to 10 pixels
  public static final int PLAYER_SIZE = 10;
  
  //program's main method
public static void main(String[] args) throws FileNotFoundException {
    System.out.println("Project 3 written by Donald Moore, ABC123: qxv177");
    
    File infile = new File("gameInput.txt");
    Scanner input = new Scanner(infile);
    
    System.out.print("Enter the number of zombies, box size, move size, and sleep time: ");
    
    int numZombies = input.nextInt();//1
    int boxSize = input.nextInt();//760
    int moveSize = input.nextInt();//10
    int sleepTime = input.nextInt();//100
    
    //this method prints general info about the Survivor I
    getIntro();
    // Initialize positions of runner, chasers, and zombies.
    Random random = new Random();
    Point runner = new Point(200, 400);
    Point chaser = new Point(600,400);
    Point zombie;
    
    // use a boolean to indicate when the game is lost
    boolean lost = false;
    
    boolean gameOver = false;
    
    boolean continueLoop = true;


    // Create DrawingPanel and draw a box in the panel.
    //int boxSize = 760;
    DrawingPanel panel = new DrawingPanel(boxSize + 40, boxSize + 40);
    Graphics g = panel.getGraphics();
    g.fillRect(10, 10, 10, boxSize + 20);
    g.fillRect(10, 10, boxSize + 20, 10);
    g.fillRect(boxSize + 20, 10, 10, boxSize + 20);
    g.fillRect(10, boxSize + 20, boxSize + 20, 10);
    
    System.out.print(numZombies + " " + boxSize + " " + moveSize + " " + sleepTime );
    
    //create an array zombies with the length of input, numZombies
    Point[] zombies = new Point[numZombies];
    
    /* The X and Y coordinates for each zombie should be random values between 30 and 770. */
    for(int j = 0; j < zombies.length; j++){
      do{
        zombie = new Point(random.nextInt(770) + 30,random.nextInt(770) + 30);
        zombies[j] = zombie;
      }while(!isZombieCreatedInbounds(zombie) || createdZombieSingleCollision(runner, zombie));
    }
    
    System.out.println(Arrays.toString(zombies));
    
    /*create an array deadZombies to track which ones have been killed by the 
     all elements are initialized as false by default in boolean arrays */
    boolean [] deadZombies = new boolean[numZombies];
    
    // Need boolean to keep track of whether zombie is caught
    boolean eliminated = false;
    
    // Variable for input from user to move runner.
    char keyInput = ' ';
    
    // Display players using Color.GREEN and Color.RED  and Color.BLUE (or whatever colors you want).
    displayPlayers(panel, runner, chaser, zombies, deadZombies);
    
    // Wait one second before start of game.
    panel.sleep(1000);
    
    // Wait until a character is entered
    keyInput = panel.getKeyChar();
    while (keyInput == 0) {
      keyInput = panel.getKeyChar();
    }
    

    while (continueLoop) {
      
      // Erase players from the panel using Color.WHITE.
      erasePlayers(panel, runner, chaser, zombies);
      
      // Get input from user if any.
      char newKeyInput = panel.getKeyChar();
      if (newKeyInput == 'w' || newKeyInput == 'a' || newKeyInput == 's' || newKeyInput == 'd') {
        keyInput = newKeyInput;
      }
      
      // Move the players according to parameters.
      movePlayers(runner, chaser, zombies, eliminated,
                  keyInput, boxSize, moveSize, g);
      
      // Display players using Color.GREEN and Color.RED (or whatever colors you want).
      displayPlayers(panel, runner, chaser, zombies, deadZombies);
      
      // Game is over if the runner collides with chaser or zombie.
      
      if (collision(runner, chaser)) {
        runnerDies(runner, panel, g);
        erasePlayers(panel, runner, chaser, zombies);
        g.setColor(Color.RED);
        g.drawString("GAME OVER!",375,200);
        System.out.println("YOU LOST!!!");
        lost = true;
        break;
      }
      
      for (int i = 0; i < deadZombies.length; i++) {
        if (collision(runner, zombies[i]) && deadZombies[i] != true) {
          deadZombies[i] = true;
          displayZombie(g,zombies[i]);
          
          if(areAllZombiesDead(deadZombies)){
            gameOver = true;
            lost = false;
            continueLoop = false;
            erasePlayers(panel, runner, chaser, zombies);
          }
        }
      }
      
      if (lost) break;
      
      // Wait sleepTime ms between moves.
      panel.sleep(sleepTime);
    }//end game while loop
    
    System.out.println(Arrays.toString(deadZombies));
    if (gameOver) {
      g.setColor(Color.RED);
      g.drawString("GAME OVER!",375,200);
      System.out.println("YOU WON!!!");
    }
  }
  
  //this method provides basic game/program information to the user
  public static void getIntro() {
    System.out.println("This game has a runner, a chaser, and zombies. A zombie moves in one of four");
    System.out.println("random dirctions (up, down, left, or right). The object of the game is for the runner to eliminate");
    System.out.println("all the zombies (by colliding with them) and to avoid being caught by the chaser.");
    System.out.println("The runner wins when all the zombies are eliminated.");
    System.out.println("The runner loses if the chaser catches the runner before all the zombies have been eliminated.");
  }
  
  
  public static boolean areAllZombiesDead(boolean[] deadZombies){
    for(int d = 0; d < deadZombies.length; d++){
      if(deadZombies[d] == false){
        //the first element of the deadZombies array with a false value will end the for loop
        return false;
      }
    }//end for loop
    
    //if we reach this point, the deadZombies array does not contain any false values
    return true;
  }
  
  /* This method is used at zombie creation and is one of two tests to determine whether a VALID zombie is created.
   * In the program's main method, zombie points are created one at a time in a do while loop. 
   * The method tests whether a zombie is created INBOUNDS, i.e. within 30 - 770 pixels (non-inclusive) 
   * in BOTH the vertical and horizontal directions.  All valid-created zombies are 
   * added to the zombie array for tracking throughout the game.
   */
  
  public static boolean isZombieCreatedInbounds(Point zombie){
    if(30 < (int)zombie.getX() && (int)zombie.getX() < 770 
         && 30 < (int)zombie.getY() && (int)zombie.getY() < 770 ){
      
      return true;
    }
    return false;
  }
  
  /* This method is used at zombie creation and is one of two tests to determine whether a VALID zombie is created.
   * In the program's main method, zombie points are created one at a time in a do while loop. 
   * This method ensures that, at a zombie does not collide with the runner AT ITS CREATION. 
   * That is, we will not create a zombie on top of our runner. All validly-created zombies are 
   * added to the zombie array for tracking throughout the game.
   */
  public static boolean createdZombieSingleCollision(Point runner, Point zombie) {
    
    double collide = Math.sqrt(Math.pow(Math.abs((zombie.getY())-(runner.getY())),2) 
                                 +  Math.pow( Math.abs((zombie.getX())-(runner.getX())),2));
    
    if(collide <= PLAYER_SIZE){
      return true;
    }
    //if code reaches this point, the runner has not collided with a zombie
    return false;
  }
  //this method is used to draw the runner, chaser, and zombies
  public static void displayPlayers(DrawingPanel panel, Point runner, Point chaser, 
                                    Point[] zombies, boolean[] deadZombies) {
    Graphics g = panel.getGraphics();
    g.setColor(Color.GREEN);
    g.fillRect((int)runner.getX() - PLAYER_SIZE / 2, (int)runner.getY() - PLAYER_SIZE / 2, PLAYER_SIZE, PLAYER_SIZE);
    
    g.setColor(Color.RED);
    g.fillRect((int)chaser.getX() - PLAYER_SIZE / 2, (int)chaser.getY() - PLAYER_SIZE / 2, PLAYER_SIZE, PLAYER_SIZE);
    
    Random random = new Random();
    for(int i = 0; i < zombies.length;i++){
      if(deadZombies[i] != true){
        g.setColor(Color.BLUE); 
        g.fillRect((int)zombies[i].getX() -  PLAYER_SIZE/2, (int)zombies[i].getY() -  PLAYER_SIZE/2, PLAYER_SIZE, PLAYER_SIZE);
        float r = random.nextFloat(); // 0 to 1;
        float y = random.nextFloat(); 
        float b = random.nextFloat();
        Color randomColor = new Color(r,y,b);
        g.setColor(randomColor);
        g.fillRect((int)zombies[i].getX() - 3, (int)zombies[i].getY() - 3, 6, 6);
      }
    }
  } 
  public static void erasePlayers(DrawingPanel panel, Point runner, Point chaser, Point[] zombies) {
    Graphics g = panel.getGraphics();
    // erase runner
    g.setColor(Color.WHITE);
    g.fillRect((int)runner.getX() - PLAYER_SIZE / 2, (int)runner.getY() - PLAYER_SIZE / 2, PLAYER_SIZE, PLAYER_SIZE);
    
    //erase chaser
    g.setColor(Color.WHITE);
    g.fillRect((int)chaser.getX() - PLAYER_SIZE / 2, (int)chaser.getY() - PLAYER_SIZE / 2, PLAYER_SIZE, PLAYER_SIZE);
    
    // erase zombie
    for(int z = 0; z < zombies.length; z++){
      g.setColor(Color.WHITE);
      g.fillRect((int)zombies[z].getX() - PLAYER_SIZE / 2, (int)zombies[z].getY() - PLAYER_SIZE / 2, PLAYER_SIZE, PLAYER_SIZE);
    }
  }
  
  /* This method calculates the best move for the chaser by calculating its four hypothetical moves (top, bottom, left, or right) and, then, checking which out of the
   * four moves is the closest to the runner. The closest move returns an integer that is passed to the movePlayers() method.
   * Note: calculations are done from the center(s) of the runner and chaser */
  public static int bestMoveChaser(Point runner, Point chaser, char keyInput, int boxSize, int moveSize) {
    double chaseLeft = distance(runner, chaser, moveSize, 0);
    double chaseRight = distance(runner, chaser, -moveSize, 0);
    double chaseTop = distance(runner, chaser, moveSize, 0);
    double chaseBottom = distance(runner, chaser, -moveSize, 0);
    
    if(chaseLeft <= chaseRight && chaseLeft <= chaseTop && chaseLeft <= chaseBottom) {
      return 0;
    }else if(chaseRight <= chaseLeft && chaseRight <= chaseTop && chaseRight <= chaseBottom) {
      return 2;
    }else if(chaseTop <= chaseLeft && chaseTop <= chaseRight && chaseTop <= chaseBottom) {
      return 1;
    } else{
      return 3;
    }
  }
  public static void movePlayers(Point runner, Point chaser,
                                 Point[] zombies, boolean legal,
                                 char keyInput, int boxSize, int moveSize, Graphics g) {
    
    boolean  chaserLegalCheck = legal(chaser, moveSize, moveSize, boxSize);
    
    moveZombie(zombies, false, boxSize, moveSize, g);
    
    processKeyInput(runner, keyInput, boxSize, moveSize);
    
    int chaseDirection = moveChaser(runner, chaser, zombies, legal, boxSize, moveSize);
    
    /* short-circuit, if legal move checks are false control statements go to last 
     condition of no movment, i.e. translate(0, 0) */
    if(chaserLegalCheck && chaseDirection == 0) {
      chaser.translate(-(moveSize-1),0);//left
    }else if (chaserLegalCheck && chaseDirection == 1  ) {
      chaser.translate(0,-(moveSize - 1));//chase up
    }else if (chaserLegalCheck && chaseDirection == 2 ) {
      chaser.translate((moveSize - 1), 0);//chase right
    }else if (chaserLegalCheck && chaseDirection == 3) {
      chaser.translate(0,(moveSize - 1));//chase down
    }else {
      chaser.translate(0, 0); //else: do nothing
    }
  }
  
  public static boolean legal(Point p, int dx, int dy, int boxSize) {
    return p.getX() + dx + PLAYER_SIZE / 2 < 780 
      && p.getX() + dx - PLAYER_SIZE / 2 > 20 
      && p.getY() + dy + PLAYER_SIZE / 2 < 780 
      && p.getY() + dy - PLAYER_SIZE / 2 > 20;
  }
  
  public static double distance(Point p1, Point p2) {
    return Math.sqrt( (p1.getX()- p2.getX()) * (p1.getX() - p2.getX())
                       + (p1.getY() - p2.getY()) * (p1.getY() - p2.getY()) );
  }
  
  
  public static double distance(Point p1, Point p2, int dx, int dy) {
    return Math.sqrt( (p1.getX()- p2.getX() - dx) * (p1.getX() - p2.getX() - dx)
                       + (p1.getY() - p2.getY() - dy) * (p1.getY() - p2.getY() - dy) );
  }
  public static void displayZombie(Graphics g, Point z){
    g.setColor(Color.WHITE);
    g.fillRect((int)z.getX() - PLAYER_SIZE / 2, (int)z.getY() - PLAYER_SIZE / 2, PLAYER_SIZE, PLAYER_SIZE);
  }
  
  public static void moveZombie(Point[] zombies, boolean eliminated, int boxSize, int moveSize, Graphics g) {
    int[] dxs = { 0, 0, moveSize, -moveSize };
    int[] dys = { moveSize, -moveSize, 0, 0 };
    Random random = new Random();
    for(int z = 0; z < zombies.length; z++){
      if (! eliminated) {
        int di = random.nextInt(4);
        int dx = dxs[di];
        int dy = dys[di];
        if (legal(zombies[z], dx, dy, boxSize)) {
          zombies[z].translate(dx, dy);
        }
      }
    }//end for loop
    
  }
  
  //this method moves the chaser by finding the best direction to catch the runner
  public static int moveChaser(Point runner, Point chaser, Point[] zombies, boolean legal,
                               int boxSize, int moveSize) {
    double distLeft =  Math.sqrt(Math.pow(Math.abs((chaser.getY()+5)-(runner.getY()+5)),2) +  Math.pow(Math.abs((chaser.getX()+5-(moveSize-1))-(runner.getX()+5)),2));
    double distRight = Math.sqrt(Math.pow(Math.abs((chaser.getY()+5)-(runner.getY()+5)),2) +  Math.pow(Math.abs((chaser.getX()+5+(moveSize-1))-(runner.getX()+5)),2));
    double distTop = Math.sqrt(Math.pow(Math.abs((chaser.getY()+5-(moveSize-1))-(runner.getY()+5)),2) +  Math.pow(Math.abs((chaser.getX()+5)-(runner.getX()+5)),2));
    double distBottom = Math.sqrt(Math.pow(Math.abs((chaser.getY()+5+(moveSize-1))-(runner.getY()+5)),2) +  Math.pow(Math.abs((chaser.getX()+5)-(runner.getX()+5)),2));
    if(distLeft <= distRight && distLeft <= distTop && distLeft <= distBottom) {
      return 0;
    }else if(distRight <= distLeft && distRight <= distTop && distRight <= distBottom) {
      return 2;
    }else if(distTop <= distLeft && distTop <= distRight && distTop <= distBottom) {
      return 1;
    } else{
      return 3;
    }
  }
  
  //this method processes key input for the movement of the runner AND whether the move is legal
  public static void processKeyInput(Point runner, char keyInput, int boxSize, int moveSize) {
    int[] dxs = { 0, 0, moveSize, -moveSize };
    int[] dys = { moveSize, -moveSize, 0, 0 };
    char[] keys = { 's', 'w', 'd', 'a' };
    
    for (int i = 0; i < dxs.length; i++) {
      int dx = dxs[i];
      int dy = dys[i];
      char key = keys[i];
      if (keyInput == key && legal(runner, dx, dy, boxSize)) {
        runner.translate(dx, dy);
      }
    }
  }
  
  //this method tests whether a collision has occured between the runner and chaser
  public static boolean collision(Point runner, Point chaser) {
    return Math.max( Math.abs(runner.getX() - chaser.getX()),
                    Math.abs(runner.getY() - chaser.getY())) <= PLAYER_SIZE;
  }
  
  //this method adds animation for the death of the runner after a collision with a zombie
  public static void runnerDies(Point runner, DrawingPanel panel, Graphics g) {
    double x = runner.getX();
    double y = runner.getY();
    
    int delta = -1;
    int shrink = 40;
    for(int j = 1; j <= 10; j++) {
      shrink = shrink-j;
      
      panel.sleep(100);
      g.setColor(Color.WHITE);
      g.drawString("AAAAARGGH",(int)x,(int)y);
      g.setColor(Color.WHITE);
      g.fillRect((int)runner.getX(),(int)runner.getY(),shrink,shrink);
      
      panel.sleep(100);
      g.setColor(Color.GREEN);
      g.fillRect((int)runner.getX(),(int)runner.getY(),shrink,shrink);
      g.setColor(Color.RED);
      g.drawString("AAAAARGGH",(int)x,(int)y);
      
      panel.sleep(100);
      g.setColor(Color.WHITE);
      g.drawString("AAAAARGGH",(int)x,(int)y);
      g.setColor(Color.WHITE);
      g.fillRect((int)runner.getX(),(int)runner.getY(),shrink,shrink);
    }
  }
}