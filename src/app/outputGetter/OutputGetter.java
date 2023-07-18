package app.outputGetter;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class OutputGetter {

    public void getStreamOutput(Stream<String> names) {
        AtomicInteger count = new AtomicInteger(1);
        names.forEach(name -> System.out.println(count.getAndIncrement() + ") " + name));
    }

    public void getInitDataMsg() {
        System.out.println("Initial data:");
    }

    public void getFilteredDataMsg() {
        System.out.println("Filtered data:");
    }
}
