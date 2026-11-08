abstract class Produto
{
	private int codigo;
	private String nome;
	private float quantidade;
	private float custo;

	public Produto(int codigo, String nome, float quantidade, float custo){
		this.codigo= codigo;
		this.nome= nome;
		this.quantidade = quantidade;
		this.custo = custo;
	}
	public void setCodigo(int codigo){this.codigo=codigo;}
	public int getCodigo(){return (this.codigo);}
	public void setNome(String nome){this.nome=nome;}
	public String getNome(){return (this.nome);}
	public float getQuantidade(){return (this.quantidade);}
	public void setCusto(float custo){this.custo=custo;}
	public float getCusto(){return (this.custo);}

	public float getValorEstoque(){return(this.quantidade*this.custo);}
										 
	public void repor(float quantidade, float custo){
	 this.quantidade=this.quantidade + quantidade;
	}
	public boolean validarSaldo(float quantidade){
	return this.quantidade>=quantidade;
	}
	public void baixar (float quantidade){
	if	(this.validarSaldo(quantidade)){
	 this.quantidade=this.quantidade - quantidade;
		}else{
		System.out.println("erro saldo");
		}
	}
	public void mostrarDados(){
		System.out.println("codigo "+ this.codigo+" nome " + this.nome + 
		" quantidade " + this.quantidade + " custo " + this.custo + " valor do estoque " + getValorEstoque());
		}
}
