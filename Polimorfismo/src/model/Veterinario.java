package model;

public class Veterinario {
	
	Animal animal[];

	public String examinar(Animal animal1, Animal animal2, Animal animal3) {
	
		String res = "O Veterinario examinou o " + animal1.getNome() + " e ele " + animal1.emitirSom();
		String res2 = "O Veterinario examinou o " + animal2.getNome() + " e ele " + animal2.emitirSom();
		String res3 = "O Veterinario examinou o " + animal3.getNome() + " e ele " + animal3.emitirSom();
		
		return res + res2 + res3;
		
	}

}
