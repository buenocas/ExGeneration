package Main;

public class Telefone {
	
	 private String nrTelefone;
	 private int tipoTelefone;
	 
	 Telefone(String nrTelefone, int tipoTelefone){
		 this.nrTelefone = nrTelefone;
		 this.tipoTelefone = tipoTelefone;
		 
	 }
	 
	 public String toString() {
		 return this.nrTelefone;
	 }
	 
	 public String getNrTelefone() {
		return nrTelefone;
	}

	public void setNrTelefone(String nrTelefone) {
		this.nrTelefone = nrTelefone;
	}

	public int getTipoTelefone() {
		return tipoTelefone;
	}

	public void setTipoTelefone(int tipoTelefone) {
		
		if(tipoTelefone > 3) {
		
		switch(tipoTelefone) {
		
		case (1) : System.out.println("Esse telefone é um celular");
					this.tipoTelefone = tipoTelefone;
		break;
		
		case (2) : System.out.println("Esse telefone é um fixo");
				this.tipoTelefone = tipoTelefone;
		break;
		
		case (3) : System.out.println("Esse telefone é público");
					this.tipoTelefone = tipoTelefone;
		break;
		
		default:
			System.out.println("Isso não é um telefone");
			break;
		}
		}else {
			System.out.println("Opção inválida");
		}
		
		
	}

	
	
	
	
}

