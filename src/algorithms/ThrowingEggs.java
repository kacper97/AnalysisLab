package algorithms;
/**
* args = {"o","o","o","b","b","b"} represents a 6 story building where eggs begin to break on 3th floor, 
* F=3. Ground floor is a[0].
*
*/
public class ThrowingEggs {
	public static void main(String[] args) {
		int n=args.length;	
		int lower = 0;
		int upper = n-1;
		
		
		while(upper-lower>1){
			int pos = (upper-lower)/2 + lower;
			if (args[pos].equals("b"))
				upper = pos;
			else
				lower=pos;	
		}
		
		System.out.println(lower);
		
				}
}
