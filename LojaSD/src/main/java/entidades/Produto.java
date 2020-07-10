package entidades;

public abstract class Produto{
  private  String nome;
  private  int codigo;
  private  double preco;
  private  TipoProduto tipo;
    
	public Produto(String nome, int codigo, double preco, TipoProduto tipo) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public TipoProduto getTipo() {
		return tipo;
	}
	public void setTipo(TipoProduto tipo) {
		this.tipo = tipo;
	}
    
    

    /* generate getters and setters*/
}