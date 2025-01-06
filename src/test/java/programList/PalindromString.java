package programList;

public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Sarsa";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println("after reverse "+ rev);
		if(s.equalsIgnoreCase(rev))
		{
			System.out.println(rev+" is palindrom");
		}
		else {
			System.out.println(rev+" is not palindrom");
		}
	}

}
