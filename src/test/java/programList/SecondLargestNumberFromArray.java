package programList;

import java.util.Arrays;

public class SecondLargestNumberFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[]= {1,0,5,6,4,6,5,3,8,10,12,7,13};
		for(int i=0;i<num.length;i++) {
			for(int j=1+i;j<num.length;j++) {
				if(num[i]>num[j]) {
					num[i]=num[i]+num[j];
					num[j]=num[i]-num[j];
					num[i]=num[i]-num[j];
				}
			}	
		}
		System.out.println(Arrays.toString(num));
		System.out.println("2nd highestest number is "+ num[num.length-2]);
	}

}
