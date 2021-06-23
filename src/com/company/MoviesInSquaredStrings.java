package com.company;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MoviesInSquaredStrings {
    public static void main(String args[]) {

    }
    public static String vertMirror(String strng){
        String words [] = strng.split("\n");
        List<String> list = Arrays.stream(words).map(a -> new StringBuilder(a).reverse().toString()).collect(Collectors.toList());
        return String.join("\n", list);

    }

    public static String horMirror(String strng){
        String words1 [] = strng.split("\n");
        Collections.reverse(Arrays.asList(words1));
        return String.join("\n", words1);

    }

    public static String oper(Function<String , String>operator, String s){
        return operator.apply(s);


    }
}
