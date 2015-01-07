/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problemoneandtwo;

/**
 *
 * @author wmuyoma16
 */
public class ProblemOneandTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      class DataOnly {
			int i;
			float f;
			boolean b;
			void show() {
                            System.out.println(i);
                            System.out.println(f);
                            System.out.println(b);	
			}
		}	
		DataOnly data = new DataOnly();
		data.i = 47;
		data.f = 1.1f;
		data.b = false;		
		data.show();

    }
    
}
