package produtos;

public class TestaOrdenacao {

	public static void main(String[] args) {
		Produto produtos[] = {
				new Produto("Lamborghini", 1000000),
				new Produto("Jipe", 46000),
				new Produto("Brasilia", 16000),
				new Produto("Smart", 460000),
				new Produto("Fusca", 17000)
		};
		
		for(int atual = 0; atual < produtos.length; atual++) {
			int menor = buscaMenor(produtos, atual, produtos.length - 1);
				Produto produtoAtual = produtos[atual];
				Produto produtoMenor = produtos[menor];
				produtos[atual] = produtoMenor;
				produtos[menor] = produtoAtual;
		}
		ordena(produtos, produtos.length);
		for(Produto produto : produtos) {
			System.out.println(produto.getNome() + " custa " + produto.getPreco());
		}

	}
	
	private static int buscaMenor(Produto[] produtos, int inicio, int termino) {
		int maisBarato = inicio;
			for(int atual = inicio; atual <= termino; atual++){
				if(produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {

					maisBarato = atual;
				}
		}
			return maisBarato;
	}
	
	private static void ordena(Produto[] produtos, int quaqntidadeDeElementos) {
		for(int atual = 0; atual < produtos.length - 1; atual++) {
			
			System.out.println("Estou na casinha " + atual);
			int menor = buscaMenor(produtos, atual, quaqntidadeDeElementos - 1);
			
			System.out.println("Trocando " + atual + " com o " + menor);
			
			Produto produtoAtual = produtos[atual];
			Produto produtoMenor = produtos[menor];
			
			System.out.println("Trocando "+ produtoAtual.getNome() + " " + produtoMenor.getNome());
			produtos[atual] = produtoMenor;
			produtos[menor] = produtoAtual;	
			
		}
	}

}
