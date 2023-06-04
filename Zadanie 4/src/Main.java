import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static Set<Set<Integer>> powerset(Set<Integer> collection) {
        Set<Set<Integer>> result = new HashSet<>();

        if (collection.isEmpty()) {
            result.add(new HashSet<>());  // Pusty zbiór
            return result;
        }

        Integer first = collection.iterator().next();  // Pobieranie pierwszego elementu
        Set<Integer> rest = new HashSet<>(collection);  // Zbiór reszty elementów
        rest.remove(first);  // Usuwanie pierwszego elementu z reszty elementów

        Set<Set<Integer>> subsets = powerset(rest);

        result.addAll(subsets);  // Dodawanie podzbiorów bez pierwszego elementu

        for (Set<Integer> subset : subsets) {
            Set<Integer> newSubset = new HashSet<>(subset);
            newSubset.add(first);
            result.add(newSubset);  // Dodawanie podzbiorów z pierwszym elementem
        }

        return result;
    }

    public static void main(String[] args) {
        Set<Integer> input = new HashSet<>();
        input.add(1);
        input.add(2);
        input.add(3);

        Set<Set<Integer>> result = powerset(input);

        List<Set<Integer>> sortedResult = new ArrayList<>(result);
        sortedResult.sort((a, b) -> {
            if (a.size() == b.size()) {
                return Integer.compare(a.hashCode(), b.hashCode());  // Porównujemy hashe podzbiorów
            } else {
                return Integer.compare(a.size(), b.size());  // Porównujemy rozmiary podzbiorów
            }
        });

        for (Set<Integer> subset : sortedResult) {
            System.out.println(subset);
        }
    }
}
