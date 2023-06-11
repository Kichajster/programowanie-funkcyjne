import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static Set<Set<Integer>> powerset(Set<Integer> collection) {
        if (collection.isEmpty()) {
            Set<Set<Integer>> result = Stream.<Set<Integer>>of(new HashSet<>())
                    .collect(Collectors.toSet());
            return result;
        }

        Integer first = collection.iterator().next();  // Pobieranie pierwszego elementu
        Set<Integer> rest = collection.stream().skip(1).collect(Collectors.toSet());  // Zbiór reszty elementów

        Set<Set<Integer>> subsets = powerset(rest);

        return subsets.stream()
                .flatMap(subset -> Stream.of(subset, Stream.concat(subset.stream(), Stream.of(first)).collect(Collectors.toSet())))
                .collect(Collectors.toSet());  // Zwracanie zbioru zawierającego podzbiory
    }

    public static void main(String[] args) {
        Set<Integer> input = Stream.of(1, 2, 3).collect(Collectors.toSet());

        Set<Set<Integer>> result = powerset(input);

        result.forEach(System.out::println);
    }
}
