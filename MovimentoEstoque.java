class MovimentoEstoque 
{
	public static void main(String[] args)throws Exception 
	{
		ProdutoCustoAtual pca = new ProdutoCustoAtual(1, "Feijao", 60, 1.50f);
		ProdutoCustoMedio pcm = new ProdutoCustoMedio(2, "Tomate", 120, 2.50f);

		System.out.println("Valor Inciais");
		pca.mostrarDados();
		pcm.mostrarDados();

		System.out.println("Repor(100,1.60) e (100,2.60)");
		pca.repor(100, 1.60f);
		pcm.repor(100, 2.60f);
		pca.mostrarDados();
		pcm.mostrarDados();
		
		System.out.println("Baixar 30 e 50");
		pca.baixar(30);
		pcm.baixar(50);
		pca.mostrarDados();
		pcm.mostrarDados();
		System.out.println("Baixar 300");
		pcm.baixar(300);
	}
}
