package org.stream.api;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int[] arr={5,9,11,2,8,21,1};

        List<Integer> collect = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).collect(Collectors.toList());
        Integer i = collect.stream().findFirst().get();

        System.out.println(i);
        System.out.println(collect);

        String name ="GulabKumar";

        String[] s = name.split("");

        Map<String, Long> collect1 = Arrays.stream(s).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        String key = collect1.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();

        System.out.println(key);


    }

}
