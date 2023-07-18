package app.operators;

import java.util.List;
import java.util.stream.Stream;

public class FilterStrings {

    public Stream<String> filterLetter(List<String> names, String letter) {
        return names.stream().filter(name -> name.startsWith(letter));
    }
}
