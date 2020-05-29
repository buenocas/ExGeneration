package Ex03;

public class Aula {
	
	//Atribuindo variaveis privadas
	
	private String titulo;
	private int tempo;
	
	//Iniciando o método Construtor com parametros
	
	public Aula(String titulo, int tempo) {
		
	//Usando o this para associar o valor recebido a variavel criada.
		
	this.titulo = titulo;
	this.tempo = tempo;
	}
	
	//Pegando o valor da variavel titulo e retornando ela.
	
	public String getTitulo() {
	return titulo;
	}
	
	//Pegando o valor da variável tempo e retornando ela.
	public int getTempo() {
	return tempo;

	}

}
