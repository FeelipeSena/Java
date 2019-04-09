package br.edu.univas.main;

import java.util.Scanner;

public class Problem1008 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero, horas;
		float salarioHoras, salary;
		numero = scan.nextInt();
		horas = scan.nextInt();
		salarioHoras = scan.nextFloat();
		
		
		salary = salarioHoras * horas;
		
		System.out.println("NUMBER  = " + numero);
		System.out.print("SALARY  = U$ " + salary);
	}

}
