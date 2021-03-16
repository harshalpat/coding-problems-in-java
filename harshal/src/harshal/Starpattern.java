package harshal;

//   *
//  * *
// * * *
//* * * *
import java.util.Scanner;

public class Starpattern {

	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		int number = new Scanner(System.in).nextInt();
		for (int i = 0; i<number; i++) {
			
			for (int j = 1; j<number-i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}