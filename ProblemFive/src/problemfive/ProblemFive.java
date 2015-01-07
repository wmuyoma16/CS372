/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problemfive;

/**
 *
 * @author wmuyoma16
 */
import java.util.Random;
public class ProblemFive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Random firstNum= new Random();
        Random secondNum= new Random();
        for( int i=0; i < 25; i++){
            /**
             * I am using random number ranger of 0-9
             * this make the output a bit neat
             */
            int firstR= firstNum.nextInt(10);
            int secondR= secondNum.nextInt(10);
            if(firstR < secondR)
                System.out.println( firstR +" < "+ secondR);
            else if(firstR == secondR)
                  System.out.println( firstR +" < "+ secondR);
            else
                System.out.println( firstR +" > "+ secondR);
        }
    }
    
}
