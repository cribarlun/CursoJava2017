/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploscursojava.articulos;

import java.util.ArrayList;
//import com.google.common.collect.Lists;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

/**
 *
 * @author japar
 */
public class EjemplosArticulos {

	public static void main(String[] args) {
		/*
		 * BiFunction<String, List<Article>, List<Article>> byAuthor = (name, articles)
		 * -> articles.stream() .filter(a -> a.getAuthor().equals(name))
		 * .collect(Collectors.toList());
		 * 
		 * BiFunction<String, List<Article>, List<Article>> byTag = (tag, articles) ->
		 * articles.stream() .filter(a -> a.getTags().contains(tag))
		 * .collect(Collectors.toList());
		 * 
		 * Function<List<Article>, List<Article>> sortByDate = articles ->
		 * articles.stream() .sorted((x, y) ->
		 * y.getPublished().compareTo(x.getPublished())) .collect(Collectors.toList());
		 * 
		 * Function<List<Article>, Optional<Article>> first = a ->
		 * a.stream().findFirst(); BiFunction<String, List<Article>, List<Article>>
		 * byAuthorSorted = byAuthor.andThen(sortByDate);
		 * 
		 * List<Article> articles=famousArticles();
		 * System.out.println(first.apply(articles));
		 */

		Stream.of("HOLA", "MUNDO").forEach(System.out::println);
		System.out.println("------------------------------------------");

		Stream.of("HOLA", "MUNDO").filter(s -> (s.startsWith("H"))).forEach(System.out::println);

		System.out.println("------------------------------------------");

		Stream.of("HOLA", "MUNDO").filter(s -> (s.startsWith("H"))).filter(s -> (s.length() > 5))
				.forEach(System.out::println); // Muestra las que empiezan por h y tienen una longitud mayor de 5. ES UN AND
		
		
		System.out.println("------------------------------------------");
		
		Stream.of("HOLA", "MUNDO").filter(s -> (s.startsWith("H") || s.length() > 5))
		.forEach(System.out::println); // Muestra las que empiezan por h O tienen una longitud mayor de 5. ES UN OR
		
		
		System.out.println("------------------------------------------");

		List<String> palabras= Stream.of("hola","mundo","hola", "saque bola").filter(s->(s.startsWith("h") || s.length()>=5)).collect(Collectors.toList());
		System.out.println(palabras);
		
		System.out.println("------------------------------------------");

		
		String palabras1= Stream.of("hola","mundo","hola", "saque bola").filter(s->(s.startsWith("h") || s.length()>=5)).collect(Collectors.joining("--"));
		System.out.println(palabras1);
		
		System.out.println("---------------------------------------------");
		
		List<Article> articulos= famousArticles();
		
		articulos.stream().filter(a->a.getTags().contains("Bases de Datos")).filter(a->a.getPublished().getYear()>=1950).forEach(System.out::println);
		
		articulos.stream().filter(a->a.getTags().contains("Bases de Datos") || a.getPublished().getYear()>=1950).forEach(System.out::println);
	}

	private static List<Article> famousArticles() {
		List<Article> articulos= new ArrayList<>();
		
		articulos.add(new Article(new Date(1905,01,01),
				  "Albert Einstein", "On the Electrodynamics of Moving Bodies", new ArrayList<String>()));
		articulos.add(new Article(new Date(1969,11,01),
				  "Edgar F. Codd", "A Relational Model of Data for Large Shared Data Banks", new ArrayList<String>()));
		
		articulos.add(new Article(new Date(1959,11,11), "Morris, Robert and Thompson, Ken"," Password security: a case history,", new ArrayList<String>()));
		
		  return articulos;
		 
		  
		
	}
}
