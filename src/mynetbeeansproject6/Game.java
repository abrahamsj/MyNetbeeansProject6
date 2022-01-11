
package mynetbeeansproject6;

/**
 *
 * @author Peter Laptop
 * @author neely
 */

/*
    Game class: where most of the game logic will take place, might seperate further into a "dialogue" class
*/
public class Game {
     String userName;
     double startingAmt = -999999.9999999;
     Player userPlayer;
    //enum for game difficulty 
    public enum GameDifficultyEnum{
                                    EASY, //75% chance to bribe dealer and chance to offer pity money(-12.5%),start with 75 dollars, one of the easy shuffle algos
                                    MEDIUM, //50 percent chance to bribe dealerand chance to offer pity money(-25%), start with 50 dollars, one of the middle shuffle algos  
                                    HARD}//25% chance to bribe dealer, start with 25 dollars, one of the hard shuffle algos (realistic)
    
    GameDifficultyEnum playerDifficulty;
    
    //Starting method for the game. will determine name and select difficulty level
    public void start(){
        
        System.out.println("Welcome to the game of BlackJack "); 
        //taking and assignning name (check Dialogue class)
        System.out.println("What is your name? "); 
       
        userName = Dialogue.INPUT.nextLine();//
       
         System.out.println("What game difficulty do you want?(type number) \n"
                 + "1. Easy \n"
                 + "2. Medium \n "
                 + "3. Hard "); 
        int gameDiffChoice;
        
        
       
        gameDiffChoice = Dialogue.INPUT.nextInt();//
        while (gameDiffChoice>3 || gameDiffChoice<=0){
           System.out.println("What game difficulty do you want?(type number) \n"
                 + "1. Easy \n"
                 + "2. Medium \n"
                 + "3. Hard ");
           gameDiffChoice = Dialogue.INPUT.nextInt();
        }
        
         switch(gameDiffChoice){
                case 1: 
                    playerDifficulty = GameDifficultyEnum.EASY;   
                    startingAmt = 75.0;
                    break;
                case 2:
                    playerDifficulty = GameDifficultyEnum.MEDIUM;    
                      startingAmt = 50.0;
                     
                    break;
                case 3: 
                    playerDifficulty = GameDifficultyEnum.HARD;
                      startingAmt = 25.0;
                     break;   
                default: 
                    System.out.println("ERROR, this is not supposed to happen: Check Game.java Code");
                    break;
            }
        
         userPlayer = new Player(userName, startingAmt, playerDifficulty);
   
        System.out.println("Your name is "+ userPlayer.getName()+ " and the amount of money you have is $"+ userPlayer.getMoney() +". Level select is: " + userPlayer.getplayerlevel() + "\nTIME TO PLAY!");
    }
    
    //a round of blackjack game method -> refactor to place into seperate methods as well
    
    public void roundOfBlackjack(){
        //planning logic, reminder that there will be lots of ddialogue based on percentage of money, bet amount, bribe amount etc... this will slightly help keeping the game interesting 
        
        //BETTING / TIPPING METHOD (while person has money available, if not go to end game mode)
        //dealer greet dialogue "so why are we here my friend? "
        //two options, begin betting("lets get right into it") or "tip" (tip dialogue based on amount (only 2 ranges for now)) tip will also affect shuffle algo 
        //2 ranges for betting ("wow thats a lot of money" "are you sure you're supposed to be here? Im sure you might be too broke to gamble!")
        
        //begin BLACK JACK GAME METHOD with bet parameter
        //cardInfo method for player you have [3] [4] dealer shows [4] (other card is hidden)
        //options are hit, stand, double down(bet parameter, if they have enough to double down) 3 different methods 
        
      
    }
    
    
}


