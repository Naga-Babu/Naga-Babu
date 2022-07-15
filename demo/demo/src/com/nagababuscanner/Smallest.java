package com.nagababuscanner;

import java.util.Scanner;

public class Smallest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input the first number: ");
		double x = in.nextDouble();
		System.out.print("Input the Second number: ");
		double y = in.nextDouble();
		System.out.print("Input the third number");
		double z = in.nextDouble();
		System.out.print("The smallest value is" + smallest(x, y, z)+"\n");
	}

	private static double smallest(double x, double y, double z) {
		// TODO Auto-generated method stub
		return Math.min(Math.min(x,y),z);
	}

}
