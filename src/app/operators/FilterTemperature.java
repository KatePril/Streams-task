package app.operators;

import java.util.List;
import java.util.stream.Stream;

public class FilterTemperature {

    public Stream<Integer> filterTemperature(List<Integer> temperatures) {
        return temperatures.stream().filter(temperature -> temperature >= 10 && temperature <= 13);
    }
}
