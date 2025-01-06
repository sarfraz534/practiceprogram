package programList;

import java.util.Arrays;

public class MoeAllZeroFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={0,1,2,3,4,0,5,0,6,};

//		// move all the 0 to the left side
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>=a[j]) {
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
			}
		}
		System.out.println(Arrays.toString(a));
//		int b[]=new int[a.length];
//		int position=0;
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]==0)
//			{
//				b[position]=a[i];
//			position++;	
//			}
//		}		
//		for(int i=0;i<a.length;i++)
//		{
//			if(!(a[i]==0))
//			{
//				b[position]=a[i];
//				position++;
//			}
//		}
//		System.out.println(Arrays.toString(b));
		


}}
