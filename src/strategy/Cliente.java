package strategy;

//classe cliente possui dois atributos nome do tipo string e telefone do tipo int
public class Cliente {
	private String nome;
	private int telefone;
	
	//Metodo construtor cliente  
	public Cliente(String nome, int telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	
    // Metodos get e set para nome e telefone
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int gettelefone() {
		return telefone;
	}

	public void settelefone(int telefone) {
		this.telefone = telefone;
	}

}
