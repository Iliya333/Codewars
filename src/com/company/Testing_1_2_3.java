package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Testing_1_2_3 {
    public static void main(String[] args) {
        System.out.println(number(Arrays.asList("a", "b", "c")));
        System.out.println(number(Arrays.asList("", "", "", "", "")));
    }

    public static List<String> number(List<String> lines ) {
        ArrayList<String> result = new ArrayList<>();
        int i = 0;
        for (String s : lines) {
            result.add(++i + ": " + s);
        }
        return result;
    }
}
