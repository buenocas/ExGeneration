package model;

public class Cavalo extends Animal {
	
	public Cavalo(String nome, int idade) {
		super(nome, idade);
		
	}
	
	public void emitirSom() {
		super.emitirSom();
		System.out.println("O cavalo " + super.getNome() + " está Relinchando!");
	}
	
	public void correr() {
		super.correr();
		System.out.println("O cavalo " + super.getNome() + " está correndo muito rápido!");
	}
	

	

}
