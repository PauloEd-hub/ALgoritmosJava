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
				new Produto("Fusca", 17000)
		};
		
		
		int maisBarato = buscaMenor(produtos);
		System.out.println(maisBarato);
		System.out.print("O carro " + produtos[maisBarato].getNome() + "é o mais barato e custa " + produtos[maisBarato].getPreco());
		

	}
	
	public static int buscaMenor(Produto[] produtos) {
		int maisBarato = 0;
		for(int atual = 0; atual <= 4; atual++) {
			if(produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
				maisBarato = atual;
			}
		}
		return maisBarato;
	}

}
