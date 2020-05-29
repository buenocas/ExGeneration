package Ex03;

import java.util.ArrayList;

public class TestandoListas {

	public static void main (String[] args) {
		
		//Atribuindo valor as Strings
		
		String aula1 = "Modelando a classe Aula";
		String aula2 = "Conhecendo mais de listas";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		//Criando a ArrayList do tipo String.
		
		ArrayList <String> aulas = new ArrayList<>();
		
		//Adicionando os valores da ArrayList;
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		//Printando a Lista e o tamanho da Arraylist.
		
		System.out.println(aulas);
		System.out.println(aulas.size());
		
		// cuidado! &lt;= faz sentido aqui?
		
		//R: Faz, ele está usando um For percorrer e  para printar as aulas nas posições i, usando o tamanho da array.
		
		for (int i = 0; i < aulas.size(); i++) {
		System.out.println("Aula: " + aulas.get(i));
		}
	}

}
