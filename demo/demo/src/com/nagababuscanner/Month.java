package com.nagababuscanner;

import java.util.Scanner;

public class Month {
	public static void main(String[] args) {
		int n;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter month number:");
		n=input.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("january has 31 days");
		break;

		case 2:
			System.out.println("February has 28 days");
		break;

		case 3:
			System.out.println("march has 31 days");
		break;

		case 4:
			System.out.println("Aprial has 30 days");
		break;

		case 5:
			System.out.println("may has 31 days");
		break;

		case 6:
			System.out.println("june has 30 days");
		break;

		case 7:
			System.out.println("july has 31 days");
		break;

		case 8:
			System.out.println("august has 31 days");
		break;

		case 9:
			System.out.println("September has 30 days");
		break;

		case 10:
			System.out.println("October has 31 days");
		break;

		case 11:
			System.out.println("November has 31 days");
		break;

		case 12:
			System.out.println("December has 31 days");
		break;
		}
	}

}
