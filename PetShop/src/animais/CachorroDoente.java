package animais;

public class CachorroDoente extends Cachorro {
	private String nome;
	private String ra�a;
	private String doen�a;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRa�a() {
		return ra�a;
	}
	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
	}
	public String getDoen�a() {
		return doen�a;
	}
	public void setDoen�a(String doen�a) {
		this.doen�a = doen�a;
	}
	
	public void imprimir() {
		System.out.println("Nome do dog doente: " + nome);
		System.out.println("Ra�a doente: " + ra�a);
		System.out.println("doen�a: " + doen�a);
	}
}
