
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wmuyoma16
 */
public class Player {
       ArrayList<String> user = new ArrayList<>();

    private String passWord;
    private double money;
    private int playerGuess;
    private boolean player;
    /**
     * 
     * @param pass this will allow player to log in
     * @param guess  this will be the input of user's  guess
     */
    public Player(String pass, int guess){
        money=500;
        passWord=pass;
        playerGuess=guess;
        
        
    }
    /**
     * 
     * @return The value  of money  after player guess.
     */
    public double funds() {
        if(playerGuess < 7){
            money+=money;
        }
        else if(playerGuess==7){
            money-=money *4;
        }
        else{
            money-=money;
        }
           
        return money;
    }
     public String addPlayer(String player){
        for (String user1 : user) {
            
        }
           return player;
    }

}
