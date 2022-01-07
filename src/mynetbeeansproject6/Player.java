/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mynetbeeansproject6;

/**
 *
 * @author Peter Laptop
 */
public class Player {
    private String playerName; 
    private double money; 
    //TODO neely, create constructor AND getter AND Setter for these variables 
    public Player(String name,double amount){
        playerName = name;
        money = amount;       
    }
   
    public String getName(){
        return playerName;
    }
    public double getMoney(){
        return money;
    }
}
