package programList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDublicateFromString {

	static StringBuffer removeduplicate(String str) {
		char c[]=str.toCharArray();
		Set<Character> set= new HashSet<>();
		StringBuffer withoutduplicate= new StringBuffer();
		for(char c1:c) {
			set.add(c1);
			}
		for(Character c2:set) {
			withoutduplicate.append(c2);
		}
		
		return withoutduplicate;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="banana";
		System.out.println(removeduplicate(s));
		
		
	}

}
