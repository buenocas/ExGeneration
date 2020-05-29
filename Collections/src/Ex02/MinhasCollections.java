package Ex02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MinhasCollections {
	
public static void main(String[] args) {
	
	//Criando uma List usando Integer, que permite um único valor por vez para a minha Arraylist;
	
List<Integer> minhaLista = new ArrayList<Integer>();

	//Adicionando itens ao meu Arraylist com o método add();
minhaLista.add(1);
minhaLista.add(2);
minhaLista.add(2);

	//Utilizando o método for para percorrer a lista criada, listando os itens que foram postados.

for (Integer listaElementos : minhaLista) {
System.out.println(listaElementos);

}

System.out.println("------------------");


	//Criando um Set que não permite valores repetidos, usando Integer, para adicionar um valor único.
	//HashSet serve para fazer a verificação e não trazer duplicatas.

Set<Integer> meuSet = new HashSet<Integer>();

	//Adicionando itens ao meu HashSet com o método add();


meuSet.add(1);
meuSet.add(2);
meuSet.add(3);
meuSet.add(1);


//Dando upcast no iMeuSet e usando o comando iterator() para trazer os Integer da minha HashSet

Iterator<Integer> iMeuSet = meuSet.iterator();

// Usando o While para percorrer até o último valor e em seguida printando a lista.

while(iMeuSet.hasNext()){
System.out.println(iMeuSet.next());
}

}

}