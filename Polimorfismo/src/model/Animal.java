package model;

public abstract class Animal {
	
	private String nome;
	private int idade;

	
	protected Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;

	}
	
	protected Animal() {
		
	}
	
	protected void emitirSom() {
		System.out.println("O Animal está emitindo som...");
	
	}
	
	protected void correr() {
		System.out.println("O Animal está correndo...");
		
	}
	
	protected void escalar() {
		System.out.println("O Animal está escalando...");
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
