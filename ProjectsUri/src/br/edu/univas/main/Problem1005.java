package br.edu.univas.main;

import java.util.Scanner;

public class Problem1005 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	     double a = scan.nextDouble();
	     double b = scan.nextDouble();
	     double x = a*3.5;
	     double y = b*7.5;
	     double z = (x+y)/11;

	        System.out.printf("MEDIA = %.5f%n", z);
	        scan.close();
	}

}
