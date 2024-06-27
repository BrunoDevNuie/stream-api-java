package functional_interface.examples;

import java.util.Arrays;
import java.util.List;

public class PredicateExampleDois {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java", "Kotlin", "Python", "Javascrpt", "C", "Go", "Ruby");

        palavras.stream()
                .filter(p -> p.length() > 5)
                .forEach(System.out::println);
    }
}
