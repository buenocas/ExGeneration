package Main;

public class Main {
	
	public static void main (String args[]) {
		
		CarroPasseio carpass = new CarroPasseio();
		
		carpass.entrPass("Roxo", "Onibus");
		carpass.EntrVeic(10000, 140, 200000);
		carpass.MostrVeic();
		carpass.mostrPass();
		
		Caminhao camin = new Caminhao();
		
		camin.EntrVeic(400000, 200, 4000000);
		camin.EntrCam(2, 14, 9000);
		camin.MostrCam();
		camin.MostrVeic();
	

	}
		
	

}
