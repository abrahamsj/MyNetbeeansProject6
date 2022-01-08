/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    
            
    
    //card constructor to create a new card object
    public Card(String cardColor, int cardVal, boolean isJack, boolean isQueen, boolean isKing, boolean isAce, SuitEnum suit ){
        color = cardColor;
        cardValue = cardVal; 
        this.isJack =isJack ; 
        this.isQueen=isQueen ;
        this.isKing=isKing;
        this.isAce=isAce;
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
}
