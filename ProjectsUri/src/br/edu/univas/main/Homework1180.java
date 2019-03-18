package br.edu.univas.main;

import java.util.Scanner;

public class Homework1180 {

	public static void main(String[] args) {
		int n, temp, lower = 99, cont = 0;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		int vet[] = new int[n];
		boolean firstLoop = false;
		
		for(int i = 0; i < n; i++) {
			vet[i] = input.nextInt(); // inicializacao do array
		}
		
		for(int j = 0; j < n; j++) { // verifica o menor
			 temp = vet[j];
	            if (firstLoop == false) {
	                lower = temp;
	                firstLoop = true;
	            } if (temp < lower) {
	                 lower = temp;
	                 cont = j;
	             }
			
		}
		System.out.println("Menor valor: " + lower);
		System.out.println("Posicao: " + cont);
	}
}
