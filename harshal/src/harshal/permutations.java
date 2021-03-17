package harshal;

import java.util.Scanner;

public class permutations {

	public static void main(String[] args) {
		
		System.out.print("Enter a string:");
		String str = new Scanner(System.in).nextLine();
		int size = str.length();
		permutation(str, 0, size-1);
	}
	
	public static void permutation(String target, int start, int end ) {
		if(start == end) System.out.println(target);
		else {
			for (int i = start; i<=end; i++) {
				target = swap(target, start, i);
				permutation(target, start+1, end);
				target = swap(target, start, i);
			}
		}
		
	}

	public static String swap(String s, int i, int j) {
		char temp;
		char[] ch = s.toCharArray();
		temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;	
		String str = new String(ch);
		return str;
		
	}
	

}

