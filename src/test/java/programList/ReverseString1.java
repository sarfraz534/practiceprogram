package programList;

public class ReverseString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="sarfraz";
		String s1="";
		for(int i=s.length()-1;i>0;i--)
		{
		s1=s1+s.charAt(i);
		}
		System.out.println(s1);
	}

}
