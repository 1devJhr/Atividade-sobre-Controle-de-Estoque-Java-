class ProdutoCustoMedio extends Produto{

  public ProdutoCustoMedio(int codigo, String nome, float quantidade, float custo){
  super(codigo,nome,quantidade,custo);
  }
  public void repor(float quantidade, float custo){
	float custoMedio = ((super.getQuantidade()* super.getCusto()) + (quantidade * custo))/(super.getQuantidade()+ quantidade);
	 this.setCusto(custoMedio);
	 super.repor(quantidade,custo);
	}
	
}
