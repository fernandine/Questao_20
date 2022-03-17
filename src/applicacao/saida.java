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
		VideoGame ps4Usado = new VideoGame("ps4Usado", 1000, 7, "Sony", "Slim", true);
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

		americanas.getLivros();
		americanas.getVideoGames();
		americanas.calculaPatrimonio();
		
		System.out.printf("R$ %.1f de impostos sobre o livro %s.%n", l2.calculaImposto(), l2.getNome());
		System.out.printf("Livro %s não tem imposto: %n", l3.getNome());
		System.out.printf("Imposto %s%s, R$ %.1f%n",ps4Usado.getNome(), ps4.getModelo(), ps4Usado.calculaImposto());
		System.out.printf("Imposto %s%s R$ %.1f%n", ps4.getNome(),ps4.getModelo(), ps4.calculaImposto());

		System.out.println("------------------------------------------------------");

		System.out.printf("A loja %s possui estes livros para venda: %n", americanas.getNome());
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);

		System.out.println("------------------------------------------------------");

		System.out.printf("A loja americanas possui estes videogames: %n", americanas.getVideoGames());
		System.out.println(ps4);
		System.out.println(ps4Usado);
		System.out.println(xbox);

		System.out.println("-------------------------------------------------------");
		System.out.printf("O patrimônio da loja: %s é de R$ %.2f", americanas.getNome(), americanas.calculaPatrimonio() );
		
	}

}
