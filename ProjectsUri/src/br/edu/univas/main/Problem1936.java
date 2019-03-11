package br.edu.univas.main;

import java.util.Scanner;

public class Problem1936 {

	public static void main(String[] args) {
		int X, N, M, NseTornaX, fatorialDeI;
		Scanner ler = new Scanner(System.in);
		N = ler.nextInt();
		NseTornaX = 0;
		X = 1; //inicio o X com 1
		M = 0; //inicio o N com 0
		for (int i = 1;;) {
			fatorialDeI = fatorialDe(i);
			if (NseTornaX == 1 && (N - fatorialDeI) == 0) {
				M = M + 1;
				break; 
			} else if ((N - (fatorialDe(i))) > 0){
				i++;
			} else {
				M = M + 1;
				i = i - 1; 
				X = (N - fatorialDe(i)); //X = (N - i!)
				N = X;
				NseTornaX = 1;
				i = 1;
			}
		}
		System.out.println(M);
 
    }
    	
	public static int fatorialDe(int num){
		int fat = 1;
		for (int i = 1; i <= num; i++)
		{
			fat = fat * i;
		}
		return fat;
	}
}


