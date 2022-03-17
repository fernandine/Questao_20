package applicacao;

import java.util.ArrayList;
import java.util.List;

import entity.Livro;
import entity.Loja;
import entity.VideoGame;

public class saida {

	public static void main(String[] args) {

		Livro l1 = new Livro("Harry Potter", 40, 50, "J.K.Rowling", "fantasia", 300);
		Livro l2 = new Livro("Senhor dos Aneis", 60, 30, "J.R.Tolkien", "fantasia", 500);
		Livro l3 = new Livro("Java poo", 20, 50, "GFT", "educativo", 500);

		VideoGame ps4 = new VideoGame("ps4", 1800, 100, "Sony", "Slim", false);
		VideoGame ps4Usado = new VideoGame("ps4Usado", 1000, 10, "Sony", "Slim", true);
		VideoGame xbox = new VideoGame("xbox", 1500, 500, "Microsoft", "One", false);

		List<Livro> livros = new ArrayList<>();
		livros.add(l1);
		livros.add(l2);
		livros.add(l3);

		List<VideoGame> games = new ArrayList<>();
		games.add(ps4);
		games.add(ps4Usado);
		games.add(xbox);

		Loja americanas = new Loja("Americanas", "1234", livros, games);

		l2.calculaImposto();
		l3.calculaImposto();

		ps4Usado.calculaImposto();
		ps4.calculaImposto();

		americanas.listaLivros();
		americanas.listaVideoGames();
		americanas.calculaPatrimonio();
		
		

		System.out.println("R$ %.1f de impostos sobre o livro Senhor dos Anéis.", imposto);
		System.out.printf("Livro educativo não tem imposto: Java Poo");
		System.out.printf("Imposto PS4 SLIM usado, R$ %.1f", ps4Usado);
		System.out.printf("Imposto PS4 SLIM R$ %.1f", ps4);

		System.out.println("--------------------------------------");

		System.out.println("A loja americanas possui estes livros para venda:");
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		System.out.println(l3.toString());

		System.out.println("---------------------------------------");

		System.out.println("A loja americanas possui estes videogames:");
		System.out.println(ps4.toString());
		System.out.println(ps4Usado.toString());
		System.out.println(xbox.toString());

		System.out.println("-----------------------------------------");
		System.out.println("O patrimonio da loja: Americanas é de R$ %.1f", calculaPatrimonio);
	}

}
