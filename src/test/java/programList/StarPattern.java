package programList;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* output
		*   
		* * 
		* * * 
		* * * * 
		* * * * *
*/
		int row=5;
		for(int i=0;i<row;i++) {
			for(int j=0;j<=i;j++) {
			System.out.print("*");
		}
			System.out.println();
		}
		
		
	}

}
