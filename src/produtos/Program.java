package produtos;

import java.awt.print.Printable;

public class Program {
	
	//Neste programa estamos tentando encontrar o menor preço numa lista de carros, inciando o código de maneira simples e aumentando a complexidade de resolução a cada dia e commit.

	public static void main(String[] args) {
		
		Produto produtos[] = { 
				new Produto("Lamborghini", 1000000),
				new Produto("Jipe", 46000),
				new Produto("Brasilia", 16000),
				new Produto("Smart", 460000),
				new Produto("Fusca", 17000),
				null,
				null,
				null,
				null,
				null
		};
		
		
		int maisBarato = buscaMenor(produtos, 0, 4);
		System.out.println(maisBarato);
		System.out.print("O carro " + produtos[maisBarato].getNome() + "é o mais barato e custa " + produtos[maisBarato].getPreco());
		

	}
	
	public static int buscaMenor(Produto[] produtos,int inicio, int termino) {
		int maisBarato = inicio;
//		int termino = produtos.length - 1;
		for(int atual = inicio; atual <= termino; atual++) {
			if(produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
				maisBarato = atual;
			}
		}
		return maisBarato;
	}

}
