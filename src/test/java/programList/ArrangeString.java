package programList;

import java.util.Arrays;

public class ArrangeString {

	public static void main(String[] args) {
		// TODO arrange string and keep highest first
		String arr[]={"abc","abcdef","1","abc123hshj","12"};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].length()>arr[j].length()) {
					//swipe  a=a+b; b=a-b;a=a-b;
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i].substring(i,arr[i].length()-arr[j].length());
					arr[i]=arr[i].substring(arr[j].length());
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
