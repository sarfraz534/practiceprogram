package day1;

public class CountRepetedNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int target=3;
		int count=0;
		int a[]= {1,3,4,1,5,3,2,4,3,3};
		for(int i=0;i<a.length;i++) {
			if(target==a[i])
			{
				count++;
			}
		}
		System.out.println("total count of "+target+" is  "+count);
	}

}
