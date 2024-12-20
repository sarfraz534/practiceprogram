package day1;

public class CountAlphabetFromString {

	public static void main(String[] args) {
		// count how many time a alphabet get

		String name="Sarfraz Ahmad";
		int count=0;
		char b[]=name.toCharArray();
		for(char alpha:b)
		{
			if(alpha=='a'||alpha=='A')
			count++;
		}
		System.out.println(count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		for(char c:name.toCharArray()) {
//			if(c=='a')
//			{
//				count++;
//			}
//		}
//		System.out.println(count);
	}

}
