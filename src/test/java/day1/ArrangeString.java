package day1;

import java.util.Arrays;

public class ArrangeString {

	public static void main(String[] args) {
		// TODO arrange string and keep highest first
		String arr[]={"abc","abcdef","1","abc123hshj","12"};
		
		for(int x=0;x<arr.length;x++)
		{
			for(int y=x+1;y<arr.length;y++) {
				if(arr[x].length()<arr[y].length())
				{
					//a=a+b
					arr[x]=arr[x]+arr[y]; //abc abcdef
					//b=a-b
					arr[y]=arr[x].substring(0,arr[x].length()-arr[y].length()); //abc
					//a=a-b
					arr[x]=arr[x].substring(arr[y].length()); // abcdef
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
