package br.edu.univas.main;
import java.util.Scanner;
public class Problem1009 {

	public static void main(String[] args) {
		String vendedor;
		double salarioFixo = 0;
		double vendas = 0;
		double total = 0;
		Scanner scan = new Scanner(System.in);
		vendedor = scan.nextLine();
		salarioFixo = scan.nextDouble();
		vendas = scan.nextDouble();
		total = ((15*vendas)/100);
		System.out.printf("TOTAL = %.2f", total+salarioFixo);
	}

}
