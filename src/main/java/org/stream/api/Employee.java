package org.stream.api;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Employee {

    public static void main(String[] args) {
        int[] arr={4,9,6,3,2,2,4};

        Map<Integer, Long> collect =   Arrays.stream(arr).boxed().sorted().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));

        Integer key = collect.entrySet().stream().filter(x->x.getValue()>1).map(y->y.getKey()).findFirst().get();

        System.out.println(key);

    }
}
