package Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class saparate {

	public static void main(String[] args) throws ArithmeticException {
		System.out.println(1);
		
	try {
		System.out.println(2/0);
		try {
		System.out.println(7/5);}	
			
			catch(ArithmeticException i) {
				
			}
			finally {
				System.out.println("inner finally");
			}
			
		}
	
	
	finally {
		
		System.out.println("excepion is handled");
	}
	
	
	}
	
}
	
	