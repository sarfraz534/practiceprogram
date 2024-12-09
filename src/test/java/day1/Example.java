package day1;

public class Example {

	public static void main(String[] args) {
		// Sarfraz Ahmad count character a in the given string
	/*	String name="Sarfraz Ahmad";
		char c='a';
		int count=0;
		for(int i=0;i<name.length();i++) {
			//if(name.charAt(i)=='a'||name.charAt(i)=='A')
			if(Character.toLowerCase(name.charAt(i))==c)
			{
				count++;
			}
		}
		System.out.println(count);

	  */
		// sum given value 12345678909112388475757575
		/*
		String num="12345678909112388475757575";
		int sum=0;
		for(char number:num.toCharArray())
		{
			sum=sum+Character.getNumericValue(number);
		}
		System.out.println(sum);
		*/
		// swap two string without using 3rd variable
		String a="Sarfraz";
		String b="Ahmad";
		a=a+b;
		System.out.println(a);
		b=a.substring(0, a.length()-b.length());
		System.out.println(b);
		a=a.substring(b.length());
		System.out.println(a);
		
		
	}
}
