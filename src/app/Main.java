package app;

import app.operators.FilterStrings;
import app.outputGetter.OutputGetter;
import app.providers.DataProvider;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        executeTaskOne();
    }

    private static void executeTaskOne() {
        List<String> names = DataProvider.getNames();
        OutputGetter.getInitDataMsg();
        OutputGetter.getStreamOutput(names.stream());

        Stream<String> filteredNames = FilterStrings.filterLetter(names, "M");
        OutputGetter.getFilteredDataMsg();
        OutputGetter.getStreamOutput(filteredNames);
    }


}
