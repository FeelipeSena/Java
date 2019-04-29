package controladores;

import animais.Cachorro;
import animais.CachorroDoente;
import animais.Gatos;

public class StartApp {

	public static void main(String[] args) {
		Cachorro cao = new Cachorro();
		CachorroDoente cao2 = new CachorroDoente();
		cao.setNome("nenem");
		cao.setRaça("n tem");
		cao.imprimir();
		
	}

}
