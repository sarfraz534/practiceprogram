package programList;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="sarfraz";
		String b="ahmad";
		a=a+b; //sarfrazahmad
		// 				
		b=a.substring(0, a.length()-b.length());//sarfraz
		a=a.substring(b.length());
		System.out.println("after swap :"+a +"  and  " +b);
		
	}

}
