package com.galesnjak.api;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * lambda
 */
public class LambdaTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("maven","gradle","ant");

        //old
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        list = Arrays.asList("gradle","maven","ant");
        //new
        Collections.sort(list,String::compareTo);

        for (String string : list) {
            System.out.println(string);
        }
    }
}
