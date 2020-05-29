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
		
		case (1) : System.out.println("Esse telefone � um celular");
					this.tipoTelefone = tipoTelefone;
		break;
		
		case (2) : System.out.println("Esse telefone � um fixo");
				this.tipoTelefone = tipoTelefone;
		break;
		
		case (3) : System.out.println("Esse telefone � p�blico");
					this.tipoTelefone = tipoTelefone;
		break;
		
		default:
			System.out.println("Isso n�o � um telefone");
			break;
		}
		}else {
			System.out.println("Op��o inv�lida");
		}
		
		
	}

	
	
	
	
}

