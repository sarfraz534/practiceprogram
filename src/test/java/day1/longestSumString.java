package day1;

public class longestSumString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="123456789876999954323674558765434567876543";
	int sum=0;
	for(char c1:s.toCharArray()) {
		int n=Character.getNumericValue(c1);
		sum=sum+n;
	}
	System.out.println(sum);
	}

}
