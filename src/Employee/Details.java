package Employee;

import java.util.Scanner;

public class Details {
public static void main(String[] args) {
	
	Scanner s= new Scanner(System.in);
	 int l = s.nextInt();
	
	 int ne[]=new int[l];
	 
	 
	
	for (int i = 0; i < ne.length; i++) {
		for (int j = i+1; j < ne.length; j++) {
			
			int temp=0;
			
			if (ne[i]>ne[j]) {
				
				temp=ne[j];
				
				ne[j]=ne[i];
				
				ne[i]=temp;
			}	
		}
		
	
		
	}
	
	for (int i = 0; i < ne.length; i++) {
		System.out.println(ne[i]);

	}

}
}
