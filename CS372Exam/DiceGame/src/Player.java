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
    private String passCode;
    private int compGuess;
    private  double money;
    private int guess;
    public Player(){
        money= 500;
    }
    /** 
     * 
     * @param pass  set pass
     */
    public void setpassCode(String pass){
        passCode= pass;
    }
    /**
     * 
     * @return  return the pass
     */
    public String getPassCode(){
        return passCode;
    }
    public double calculateFund(){
        if( guess < 7 && compGuess < 7){
            money+=money;
           }
        else if(guess > 7 && compGuess > 7)
            money-=money;
        else
            money*=4;
        
        return money;
    }
}
