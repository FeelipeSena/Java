package br.edu.univas.main;

import java.util.Scanner;

public class Problem1002 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    double a = scan.nextDouble();
	    double b = 3.14159 * Math.pow(a, 2);

	    System.out.printf("A=%.4f%n" , b);
	    scan.close();
	}
}
