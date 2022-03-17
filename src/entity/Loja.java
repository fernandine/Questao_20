package entity;

import java.util.ArrayList;
import java.util.List;

public class Loja {
	
	private String nome;
	private String cnpj;
	
	List<Livro> livros = new ArrayList<>();
	List<VideoGame> videoGames = new ArrayList<>();
	private double patrimonio;
	
	public Loja() {
	}

	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<VideoGame> getVideoGames() {
		return videoGames;
	}

	public void setVideoGames(List<VideoGame> videoGames) {
		this.videoGames = videoGames;
	}
	
	public double calculaPatrimonio() {
	
       for (Livro livro: livros) {
        patrimonio = livro.getPreco() * livro.getQtd();
        }
        for (VideoGame jogo: videoGames) {
          patrimonio = jogo.getPreco() * jogo.getQtd();
        }
       
		return patrimonio;
	}


}

	
