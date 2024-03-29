package entity;

import service.Imposto;

public class VideoGame extends Produto implements Imposto {

	private String marca;
	private String modelo;
	private boolean isUsado;

	public VideoGame() {
	}

	public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtd);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isUsado() {
		return isUsado;
	}

	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}

	@Override
	public String toString() {
		return modelo + " pre�o: " + getPreco() + " quantidade: " + getQtd() + " em estoque";
	}

	@Override
	public double calculaImposto() {
		double imposto = 0;
		if(isUsado) {
			imposto = this.getPreco() * 0.25;
		} else {
		imposto = this.getPreco() * 0.45;
	}
		return imposto;
}
}