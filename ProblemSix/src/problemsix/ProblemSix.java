/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problemsix;

/**
 *
 * @author wmuyoma16
 */
public class ProblemSix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int prime=0;

for (int i=1; i<=1000; i++) {
    for (int j=1; j <= i; j++) {
    /**
        * @param for loop is checking to make prime number req are met
        */
        if (i % j == 0 && i != j && j != 1) {
            break;
        }
        if (i == j)
            if ((++prime)%10 == 0)
                System.out.println(i);
            else
                System.out.print(i+" ");

}

}
    }
    
}
