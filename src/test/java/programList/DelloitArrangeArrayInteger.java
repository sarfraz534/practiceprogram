package programList;

import java.util.Arrays;

public class DelloitArrangeArrayInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,0,0,0,1,1,1,1};

//use for loop based on length to compare one other 

for(int i=0;i<a.length;i++) {
	for(int j=i+1;j<a.length;j++) {
		if(a[i]<a[j]) { //swap value if 1st value is less than 2nd value
			a[i]=a[i]+a[j];
			a[j]=a[i]-a[j];
			a[i]=a[i]-a[j];
			
		}
	}
	
	
}
System.out.println(Arrays.toString(a));
	}

}
