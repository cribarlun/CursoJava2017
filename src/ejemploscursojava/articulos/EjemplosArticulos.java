/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploscursojava.articulos;

//import com.google.common.collect.Lists;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author japar
 */
public class EjemplosArticulos {

    public static void main(String[] args) {
/*
        BiFunction<String, List<Article>, List<Article>> byAuthor
                = (name, articles) -> articles.stream()
                        .filter(a -> a.getAuthor().equals(name))
                        .collect(Collectors.toList());

        BiFunction<String, List<Article>, List<Article>> byTag
                = (tag, articles) -> articles.stream()
                        .filter(a -> a.getTags().contains(tag))
                        .collect(Collectors.toList());

        Function<List<Article>, List<Article>> sortByDate
                = articles -> articles.stream()
                        .sorted((x, y) -> y.getPublished().compareTo(x.getPublished()))
                        .collect(Collectors.toList());

        Function<List<Article>, Optional<Article>> first = a -> a.stream().findFirst();
        BiFunction<String, List<Article>, List<Article>> byAuthorSorted = byAuthor.andThen(sortByDate);
        
        List<Article> articles=famousArticles();
        System.out.println(first.apply(articles));
*/
    }

    private static List<Article> famousArticles() {
      /*  return Lists.newArrayList(new Article(Date.valueOf("1905-01-01"), "Albert Einstein", 
                                "On the Electrodynamics of Moving Bodies", 
                                Lists.newArrayList("physics")),
                       new Article(Date.valueOf("1969-11-01"), "Edgar F. Codd", 
                               "A Relational Model of Data for Large Shared Data Banks", 
                                Lists.newArrayList("Computer Science","Databases")));*/
    	return null;
    }
}
