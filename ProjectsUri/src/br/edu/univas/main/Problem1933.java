package br.edu.univas.main;

import java.util.Scanner;

public class Problem1933 {

	public static void main(String[] args) {
		int nun1, nun2, maior;
		Scanner ler = new Scanner(System.in);
		nun1 = ler.nextInt();
		nun2 = ler.nextInt();
		
		if(nun1>nun2) {
			maior = nun1;
		}else if(nun1==nun2) {
			maior = nun1;
		}else {
			maior = nun2;
		}
		System.out.println(maior);

	}

}
