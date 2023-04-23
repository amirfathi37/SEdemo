   import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import sun.security.krb5.KrbException;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
 /*       List<Integer> list = new ArrayList<>();
        Stream<Integer> stream = list.stream();
        System.out.println(stream.count());

        int[] intArray = new int[]{1, 2, 3, 4};
        Arrays.stream(intArray).forEach(value -> System.out.println(value));

        Stream<Double> generate = Stream.generate(() -> Math.random());
//        generate.forEach(aDouble -> System.out.println(aDouble));


        Stream.iterate(10, integer -> integer + 10)
                .limit(10)
                .forEach(integer -> System.out.println(integer));
*/
        List<Movie> movies = new ArrayList<>();


        movies.add(new Movie("a", 9));
        movies.add(new Movie("b", 88));
        movies.add(new Movie("c", 65));


        /*movies.stream().filter(movie -> movie.getLikes() > 10)
                .limit(10)
                .forEach
                        (movie -> System.out.println(movie.getTitle() + " " + movie.getLikes()));
        movies.stream().map(movie -> movie.getTitle()).forEach(s -> System.out.println(s.toUpperCase()));
        movies.stream().map(movie -> movie.getLikes()).forEach(s -> System.out.println(s));

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list2.add(3);
        list2.add(4);

        Stream<List<Integer>> listStream = Stream.of(list1, list2);
        listStream.
                flatMap(integers -> integers.stream())
                .forEach(integers -> System.out.println(integers));
        System.out.println("==============================");
        movies.stream().skip(2).forEach(movie -> System.out.println(movie.getTitle()));
        System.out.println("==============================");
        movies.stream().sorted((o1, o2) -> {
            if (o1.getLikes() > o2.getLikes())
                return 1;
            else if (o1.getLikes() < o2.getLikes())
                return -1;
            return 0;

        }).forEach(movie -> System.out.println(movie.getTitle()));


        movies.stream().sorted(Comparator.comparing(Movie::getLikes).reversed())
                .forEach(movie -> {
                    System.out.println(movie.getTitle());
                });
        System.out.println("*********************");
        movies.stream().map(movie -> movie.getTitle())
                .distinct()
                .forEach(System.out::println);
        */
        /*movies.stream()
                .filter((movie) -> movie.getLikes() > 10)
                .peek(movie -> System.out.println(movie.getTitle() + "***" + movie.getLikes()))
                .map(Movie::getTitle)
                .peek(System.out::println)
                .forEach(s -> System.out.println(""));

        Optional<Integer> reduce = movies.stream()
                .map(Movie::getLikes)
                .reduce( Integer::sum );

        Optional<String> concat = movies.stream()
                .map(movie -> movie.getTitle())
                .reduce((s, s2) -> {
                    return s + s2;
                });

        System.out.println(concat.get());*/
        DoubleSummaryStatistics map = (DoubleSummaryStatistics) movies.stream()
                .filter(movie -> movie.getLikes() > 10)
//                .collect(Collectors.toList())
//                .collect(Collectors.toSet())
//                .collect(Collectors.summingInt(Movie::getLikes))
//                .collect(Collectors.joining(", "));
                .collect(Collectors.summarizingDouble(Movie::getLikes));

//                .collect(Collectors.toMap(Movie::getTitle, Movie::getLikes));
        System.out.println(map);
        String s = "select to_char(ci.occurrence_date, 'DD/MM/YYYY', 'nls_calendar=persian') occurance_date,\n" +
                "       dbpk_pub_address.Get_String_Address(ci.fk_occurrence_address_id) occurance_place,\n" +
                "       pnt.news_type_title description,\n" +
                "       rownum RowNumber\n" +
                "  from tbl_pub_dossier d, tbl_pub_crime_info ci, tbl_psr_news_type pnt\n" +
                " where d.pk_dossier_id = ci.fk_dossier_id\n" +
                "   and ci.fk_crime_type_id = pnt.pk_news_type_id\n" +
                "   and ci.is_primary_news_subject = 1\n" +
                "   and d.pk_dossier_id = ";

    }
}
