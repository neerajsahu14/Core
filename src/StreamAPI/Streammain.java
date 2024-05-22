package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streammain {
    public static void main(String[] args) {
        // Q) create a list and filtter all even numbers from list
        List<Integer> list1 = List.of(2, 34, 6, 19, 7, 5, 9, 0, 91);
        System.out.println(list1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list1.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
        // OR
        Stream<Integer> stream1 = list1.stream();
        List<Integer> newlist = stream1.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newlist);
        list1.stream().filter(i -> i > 10).forEach(System.out::println);
      
          }    
    
}
