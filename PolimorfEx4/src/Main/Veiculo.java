package Main;

public abstract class Veiculo {
	
	private int peso;
	private int velMax;
	private double preco;
	
	protected Veiculo(){
		
	}


	protected void EntrVeic(int peso, int velMax, double preco) {
		this.peso = peso;
		this.velMax = velMax;
		this.preco = preco;
		
		
	}
	
	protected void MostrVeic() {
		
		System.out.println("Seu peso �: " + getPeso() + " KG");
		System.out.println("Seu pre�o � R$: " + getPreco());
		System.out.println("Sua velocidade m�xima �: " + getVelMax() + "KM/H");
		
	}


	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}


	public int getVelMax() {
		return velMax;
	}


	public void setVelMax(int velMax) {
		this.velMax = velMax;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
