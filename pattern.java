package harshal;

import java.util.Scanner;

//for number = 5
//*
//**
//***
//****
//*****

public class pattern {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int number = new Scanner(System.in).nextInt();
		for (int i = 0; i<number; i++) {
			for(int j = 0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println("\n");
		}
	}
}
