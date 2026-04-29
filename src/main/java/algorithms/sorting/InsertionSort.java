package algorithms.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class InsertionSort {

    public static void main(String[] args) {


        Stream<Integer> streamInt = Stream.iterate(0, (Integer n) -> n * 0).limit(100000);
        long sequentialStreamProcessingStart = System.currentTimeMillis();
        long count = streamInt.map(i -> i + 1).filter(i -> i % 2 ==0).count();
        System.out.println(count);
        long sequentialStreamProcessingEnd = System.currentTimeMillis();
        System.out.println("Sequential Processing: " + (sequentialStreamProcessingEnd - sequentialStreamProcessingStart));

        Stream<Integer> streamIntforParallel = Stream.iterate(0, (Integer n) -> n * 0).limit(100000);
        Stream<Integer> parallelStream = streamIntforParallel.parallel();
        long parallelStreamProcessingStart = System.currentTimeMillis();
        long parallelCount = parallelStream.map(i -> i + 1).filter(i -> i % 2 ==0).count();
        System.out.println(parallelCount);
        long parallelStreamProcessingEnd = System.currentTimeMillis();
        System.out.println("Parallel Processing: " + (parallelStreamProcessingEnd - parallelStreamProcessingStart));

        String str = "sdhjbas";
        String str2 = "shjbdsa";

    }
}
