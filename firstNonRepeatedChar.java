package harshal;

import java.util.Scanner;

public class firstNonRepeatedChar {

	public static void main(String[] args) {
		
		System.out.print("Enter a string: ");
		String s = new Scanner(System.in).nextLine();
		int alpha[] = new int[26];
		
		char ch[] = s.toCharArray();
		for (int i=0; i<s.length();i++) {
			
			int n = s.charAt(i) - 'a';
			alpha[n]++;
		}
		for(int element = 0; element<26; element++){
			//System.out.println(element);
			
			if( alpha[element] >1) {
				System.out.println("character "+ element);
			}
		}

	}

}
