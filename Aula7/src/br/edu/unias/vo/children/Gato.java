package br.edu.unias.vo.children;

import br.edu.unvas.vo.Animal;

public class Gato extends Animal {

	public String miar() {
		String miado = "";
		
		for (int i = 0; i < getPeso(); i++) {
			miado += "Miau";
		}
		
		return miado;
	}
	
	@Override
	public String toString() {
		String result = super.toString() +
				"\n" + miar();
		return result;
	}
	
}
