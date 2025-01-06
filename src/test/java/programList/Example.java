package programList;

import java.util.Arrays;

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
		/*
		// swap two string without using 3rd variable
		String a="Sarfraz";
		String b="Ahmad";
		System.out.println("before swaping a and b value are "+a  +"---and---"+ b);
		a=a+b;
		
		b=a.substring(0, a.length()-b.length());
		System.out.println(b);
		a=a.substring(b.length());
		System.out.println("after swaping a and b value are "+a  +"---and---"+ b);
		*/
		// int s[]={8,0,2,4,0,1,6,0,7,6,54,5} make all 0 first 
		int s[]= {8,0,2,4,0,1,60,0,7,6,54,5};
		System.out.println(Arrays.toString(s));
		for(int i=0;i<s.length-1;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i]>s[j]) {
					//a=a+b; b=a-b; a=a-b;
					s[i]=s[i]+s[j];
					s[j]=s[i]-s[j];
					s[i]=s[i]-s[j];
				}	
			}
		}
		System.out.println(Arrays.toString(s));
		// String s[]={"dsdddj3244","djfjd6","fbfj","4h","5748fjhfjf"}  ascending order based on length of string
	}
}
