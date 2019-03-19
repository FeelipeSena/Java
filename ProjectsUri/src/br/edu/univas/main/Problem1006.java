package br.edu.univas.main;

import java.util.Scanner;

public class Problem1006 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	     double a = scan.nextDouble();
	     double b = scan.nextDouble();
	     double c = scan.nextDouble();
	     double x = a*2;
	     double y = b*3;
	     double z = c*5;
	     double media = (x+y+z)/10;

	        System.out.printf("MEDIA = " + media);
	        scan.close();
	}
}
