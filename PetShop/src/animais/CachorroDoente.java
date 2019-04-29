package animais;

public class CachorroDoente extends Cachorro {
	private String nome;
	private String raça;
	private String doença;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaça() {
		return raça;
	}
	public void setRaça(String raça) {
		this.raça = raça;
	}
	public String getDoença() {
		return doença;
	}
	public void setDoença(String doença) {
		this.doença = doença;
	}
	
	public void imprimir() {
		System.out.println("Nome do dog doente: " + nome);
		System.out.println("Raça doente: " + raça);
		System.out.println("doença: " + doença);
	}
}
