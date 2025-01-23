package programList;

public class DelloitCountString {

	public static void main(String[] args) {
		String s="abbcccddddd";
		int count=1;
		StringBuffer sb= new StringBuffer();
		//output a1b2c3d4
		//count similar type char
		//use for loop initial value will be 1 to compare with previous value
		for(int i=1;i<s.length();i++)
				{
			if(s.charAt(i)==s.charAt(i-1)) {
				count++;
			}else
			{
				//else append previous char with count value and for another new value count start with 1.
				sb.append(s.charAt(i-1)).append(count);
				count=1;
			}
				}
		//above for loop last value is not appended and come out of loop
		//so that externally we are appending last value.
		sb.append(s.charAt(s.length()-1)).append(count);
		System.out.println("output  "+sb);
	
	}}
