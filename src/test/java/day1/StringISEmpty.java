package day1;

public class StringISEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		// 1. sum of longest number
		String s="123456789876999954323674558765434567876543";
		int sum=0;
		for(char c:s.toCharArray())
		{
			int number=Character.getNumericValue(c);
			sum= sum+number;
		}
		System.out.println(sum);
*/
		// String name="Sarfraz Ahmad" I want to count alphabet from string;
		String name="Sarfraz Ahmad";
		int count=0;
		String[] fname=name.split(" ");
		
		for(char c:fname[0].toCharArray())
		{
			count++;
		}
		for(char c:fname[1].toCharArray())
		{
			count++;
		}
		System.out.println(count);
}

}
