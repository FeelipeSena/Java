package main;

public class ClientePessoaFisica {

	public class ClientePessoaFisica extends Cliente {

			private int cpf;
			
			public int getCpf() {
				return cpf;
			}

			public void setCpf(int cpf) {
				this.cpf = cpf;
			}
			
			@Override
			public String toString() {
				return super.toString() +
						"\nCPF: " + cpf;
			}
	}
	
}


