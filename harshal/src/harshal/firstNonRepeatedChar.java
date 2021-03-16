package harshal;

import java.util.Scanner;

public class firstNonRepeatedChar {

	public static void main(String[] args) {
		
		System.out.print("Enter a string: ");
		String s = new Scanner(System.in).nextLine();
		int alpha[] = new int[26];
		
		char ch[] = s.toCharArray();
		for (int i=0; i<s.length();i++) {
			
			int n = 'a' - i;
			alpha[n]++;
		}
		for(int element: alpha){
			System.out.println(element);
		}

	}

}
