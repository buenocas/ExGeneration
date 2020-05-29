package Main;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main (String args[]) {

		
		 List <Telefone> minhaLista = new ArrayList<Telefone>();
		 
		 Telefone tel1 = new Telefone("991999199", 1);
		 Telefone tel2 = new Telefone("31992293",2);
		 Telefone tel3 = new Telefone("32333322",3);
		 
		 minhaLista.add(tel1);
		 minhaLista.add(tel2);
		 minhaLista.add(tel3);
		 
		 System.out.println(minhaLista);
		 
		 for(Telefone list : minhaLista) {
			 
			 System.out.println(list.getNrTelefone());
		 }
		}
}
