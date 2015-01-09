/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package area;
import java.util.Scanner;


/**
 *
 * @author wmuyoma16
 */
public class Area {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     

        Scanner input= new Scanner (System.in);
        System.out.print("Please enter redius : ");
        int radius= input.nextInt();
        /**
            final double is  constant variable
        */
         final  double PI= 3.14; //PT: use java.lang.Math.PI
         /**
           Math pow  is the same  as doing  radius*=radius;
         */
         
         double area= Math.pow(radius,2) * PI;
         System.out.printf(" the area of an circle %s", area);
    }
    
}
