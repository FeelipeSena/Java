package br.edu.univas.main;

import java.util.Scanner;

// Leia quatro valores inteiros A, B, C e D. 
//A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

public class Problem1007 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A, B, C, D, diferenca;
		A = scan.nextInt();
		B = scan.nextInt();
		C = scan.nextInt();
		D = scan.nextInt();
		
		diferenca = ((A*B)- (C*D));
		
		System.out.println("DIFERENCA = " + diferenca);
	}

	
}
