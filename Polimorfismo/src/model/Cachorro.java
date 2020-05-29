package model;

public class Cachorro extends Animal {
	
	
	public Cachorro(String nome, int idade) {
		super(nome, idade);
		
	}

	public void emitirSom() {
		super.emitirSom();
		System.out.println("O cachorro " + super.getNome() + " está Latindo!");
	}
	
	public void correr() {
		super.correr();
		System.out.println("O cachorro " + super.getNome() + " está Correndo!");
	}
	
	

}
