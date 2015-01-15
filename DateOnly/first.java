/**
 * 
 */

/**
 * @author wmuyoma16
 *
 */
public class first {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		class DataOnly{
			int i; 
			float f;
			boolean b;
			DataOnly(){
				i=0;
				f= 2.4f;
				b= false;
				
			}
		}
		DataOnly creates= new DataOnly();
		
		System.out.print(creates.f);
	}

}
