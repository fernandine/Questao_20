package entity;

public abstract class Produto {
	
	private String nome;
	private double preco;
	private int qtd;
	
	public Produto() {
	}

	public Produto(String nome, double preco, int qtd) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	
	public int getQtd() {
		return qtd;
	}

	
	}
