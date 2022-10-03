import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Stream<Integer> stream = list.stream();
        Stream<Integer> stream2 = stream.filter(i -> i == 5);
        stream2.findFirst();

        List<String> list2 = new ArrayList<>();
        list2.add("asf");
        list2.add("asf.sadf");
        list2.add("ASDsadf");
        list2.add("asf sdafas");
        list2.add("asf,kasydg");
        list2.add("asf.sdf,asdf");

        list2.stream().parallel()
                .filter(s -> !s.contains(" "))
                .filter(s -> s.toLowerCase().equals(s))
                .map(s -> s.replace(".", ""))
                .map(s -> s.replace(",", ""))
                .map(s -> s.length())
                //.collect(Collectors.toList());
                .reduce(0, (acc, d) -> acc + d)
        .forEach(System.out::println);
        ;

    }
}
