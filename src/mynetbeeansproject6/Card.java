
package mynetbeeansproject6;

/**
 *
 * @author Peter 
 */


public class Card {
    
    //member variables 
    private String color; // refactor to color Enum
    private int cardValue; 
    //one solution for face cards, will refactor later
    private boolean isJack, isQueen, isKing, isAce; 
    /*
    refactored solution for face cards, create a 5 enum types for the cards
    */
    SuitEnum suit; //card shape 
    
            
    
    //card constructors to create a new card object, this one is for the face cards
    public Card(String cardColor, boolean isJack, boolean isQueen, boolean isKing, boolean isAce, SuitEnum suit ){
        color = cardColor;
        this.isJack = isJack; 
        this.isQueen = isQueen;
        this.isKing = isKing;
        this.isAce = isAce;
        this.suit = suit;
        if(isJack || isQueen || isKing )
          cardValue = 10; 
        else if (isAce){
            //leaving as 1 for now, will make special mechanic for it in the future "PlayerHand" and "DealerHand" class later 
            cardValue = 1; 
        } else {
            System.out.println("ERROR: this wasn't supposed to happen. check Card.java card constructor for face cards");
        }
        this.suit = suit;    
        
    }
    
    //card constructor for the number cards
    public Card(String cardColor, int cardValue, SuitEnum suit){
        isJack = false; 
        isQueen = false;  
        isAce = false;
        isKing = false;
        color = cardColor; 
        this.cardValue = cardValue;
        this.suit = suit;
    }
    
    
    
    // getters so other classes can interact, (also will be used for debugging)
   
    public SuitEnum getSuit(){
        return suit;
    }
    
    public boolean getIsJack(){
        return isJack;
    }
    
    public boolean getIsQueen(){
        return isQueen;
    }
    
    public boolean getIsKing(){
        return isKing;
    }
        
    public boolean getIsAce(){
        return isAce;
    }  

    public int getCardval(){
        return cardValue;
    }
    
    public String getCardColor(){
        return color;
    }
    
    
    //todo neely create a string method getCardInfo() that will display all of the specific cards info 
    //example(add the bracket as well): if number card = [This card is a red 4 of clubs.] 
    //if face card [This is a black king of spades] 
    //use the getter functions above to create it. 
    //make sure to test it, i added example code in Main.java as a guide 
    public String getCardInfo(){
        
        return "";
    }
}
