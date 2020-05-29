package Main;

import model.Cachorro;
import model.Cavalo;
import model.Preguica;
import model.Veterinario;

public class main {
	
	public static void main (String args[]) {
		
		Cachorro dog = new Cachorro("Doguinho", 2);
		
		dog.correr();
		dog.emitirSom();
		
		Cavalo horse = new Cavalo("Ponei", 4);
		horse.correr();
		horse.emitirSom();
		
		Preguica preguicin = new Preguica("Cansadah", 2);
		preguicin.escalar();
		preguicin.emitirSom();
		
		Veterinario veter = new Veterinario();
		
		veter.examinar(dog, horse, preguicin);
	
	}

}
