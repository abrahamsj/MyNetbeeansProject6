/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    //enum for game difficulty 
    public enum GameDifficultyEnum{
                                    EASY, //75% chance to bribe dealer and chance to offer pity money(-12.5%),start with 75 dollars, one of the easy shuffle algos
                                    MEDIUM, //50 percent chance to bribe dealerand chance to offer pity money(-25%), start with 50 dollars, one of the middle shuffle algos  
                                    HARD}//25% chance to bribe dealer, start with 25 dollars, one of the hard shuffle algos (realistic)
    
    GameDifficultyEnum playerDifficulty;
    
    public void start(){
        System.out.println("Welcome to the game of BlackJack "); 
        //TODO neely take all code from bottom of this comment here and place it in the assignInfo method, this should be the last thing to do
        
        //taking and assignning name (look at Dialogue class)
        System.out.println("What is your name? "); 
        String userName;
        userName = Dialogue.INPUT.nextLine();//
        System.out.println("Your name is  " + userName); 
        
        
        //What game difficulty do you want? 
         System.out.println("What game difficulty do you want?(type number) \n"
                 + "1. Easy \n"
                 + "2. Medium \n "
                 + "3. Hard "); 
        int gameDiffChoice;
        //TODO neely turn this into a while loop, to verify that they choose an int that is 1, 2 or 3
        gameDiffChoice = Dialogue.INPUT.nextInt();//
        while (gameDiffChoice<=3){
            switch(gameDiffChoice){
                case 1: playerDifficulty = GameDifficultyEnum.EASY;
                    System.out.println("Your difficulty choice is " + playerDifficulty);
                    break;
                case 2:playerDifficulty = GameDifficultyEnum.MEDIUM;
                    System.out.println("Your difficulty choice is " + playerDifficulty);
                    break;
                case 3: playerDifficulty = GameDifficultyEnum.HARD;
                System.out.println("Your difficulty choice is " + playerDifficulty);
                     break;
                
            }
       
        
        
        //create player object, leave money amount hardcoded for now 
        Player userPlayer = new Player(userName, 999.99, playerDifficulty);
        // display "your name is name and you have money amount. You have chose this "difficulty"" 
        System.out.println("Your name is "+userName+" and the amount of money you have is $999.99.Level select is: " + playerDifficulty);
  
    }
    }
    
    //while loop to play a round?
    
    
    
    public void assignInfo(){
       System.out.println("What is your name? "); 
        String userName;
        userName = Dialogue.INPUT.nextLine();//
        System.out.println("Your name is  " + userName);  
    }
}


