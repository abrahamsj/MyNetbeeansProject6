
package mynetbeeansproject6;

/**
 *
 * @author Peter 
 */
public class Player {
    private String playerName; 
    private double money; 
    private Game.GameDifficultyEnum playerDiff;
    
    public Player(String name,double amount,Game.GameDifficultyEnum playerDiff){
        playerName = name;
        money = amount;       
        this.playerDiff = playerDiff;
    }
   
    public String getName(){
        return playerName;
    }
    public double getMoney(){
        return money;
    }
    //TODO neely create a get game difficulty enum
    public Game.GameDifficultyEnum getplayerlevel(){
        return playerDiff;
    }
}
