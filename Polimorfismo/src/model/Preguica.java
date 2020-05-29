package model;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);
		
	}

	public void emitirSom() {
		super.emitirSom();
		System.out.println("A pregui�a " + super.getNome() + " n�o faz barulho!");
	}
	
	public void escalar() {
		super.escalar();
		System.out.println("A pregui�a " + super.getNome() + " est� escalando lentamente");
	}

	



}
