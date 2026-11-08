class ProdutoCustoAtual extends Produto 
{
  public ProdutoCustoAtual(int codigo, String nome, float quantidade, float custo){
  super(codigo,nome,quantidade,custo);
  }
  public void repor(float quantidade, float custo){
	 this.setCusto(custo);
	 super.repor(quantidade,custo);
	}	
}
