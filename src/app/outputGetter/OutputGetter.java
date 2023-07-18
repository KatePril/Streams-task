package app.outputGetter;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public final class OutputGetter {

    public static void getStreamOutput(Stream<String> names) {
        AtomicInteger count = new AtomicInteger(1);
        names.forEach(name -> System.out.println(count.getAndIncrement() + ") " + name));
    }

    public static void getInitDataMsg() {
        System.out.println("Initial data:");
    }

    public static void getFilteredDataMsg() {
        System.out.println("Filtered data:");
    }
}
