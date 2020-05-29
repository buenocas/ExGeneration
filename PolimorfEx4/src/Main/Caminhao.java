package Main;

public class Caminhao extends Veiculo{
	
	private int alturaMax;
	private int comprimento;
	private int cargaMax;

	protected Caminhao() {
		
	}
	
	public void EntrCam(int alturaMax, int comprimento, int cargaMax) {
		this.alturaMax = alturaMax;
		this.comprimento = comprimento;
		this.cargaMax = cargaMax;
		
	}
	
	public void MostrCam() {
		System.out.println("Sua Altura M�x �: " + getAlturaMax());
		System.out.println("Seu Comprimento M�x �: " + getComprimento() + "m");
		System.out.println("Sua Carga m�xima �: " + getCargaMax() + "KG");

	}

	public int getAlturaMax() {
		return alturaMax;
	}

	public void setAlturaMax(int alturaMax) {
		this.alturaMax = alturaMax;
	}

	public int getComprimento() {
		return comprimento;
	}

	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}

	public int getCargaMax() {
		return cargaMax;
	}

	public void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}
	
	

}
