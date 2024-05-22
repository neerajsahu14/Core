package StreamAPI;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        // 1 blake
        Stream<Object> eStream = Stream.empty();
       eStream.forEach(e->{
        System.out.println(e);
       });
    //    2-array, object ,collection
       String name[] = { "neeraj", "uttem", "ankit", "divya" };
       Stream<String> sStream = Stream.of(name);
       sStream.forEach(e->{
        System.out.println(e);
       });
       //    3
    //    Stream<Object> streamBuilder = Stream.builder().build();
       IntStream stream = Arrays.stream(new int[] { 2, 4, 84, 3, 432 });
       stream.forEach(e->
       {
        System.out.println(e);
       });
    }
}
