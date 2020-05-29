package Main;

public class CarroPasseio extends Veiculo {

	private String cor;
	private String modelo;
	
	protected CarroPasseio() {
		
	}
	
	public void entrPass(String cor,String modelo) {
		
		this.cor = cor;
		this.modelo = modelo;
	
	}

	public void mostrPass() {
		System.out.println("O modelo do veículo é: " + getModelo());
		System.out.println("Sua cor é: " + getCor());
		
		
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	

}
