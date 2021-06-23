package com.company;

import java.util.*;
import java.util.Locale;
import java.util.stream.Collectors;

public class DuplicateEncoder {
    public static void main(String[] args) {
        System.out.println("method Encoder 1");
        System.out.println(encoder("hello world"));
        System.out.println(encoder("Prespecialized"));
        System.out.println(encoder("   ()(   "));
        System.out.println("method Encoder 2");
        System.out.println(encoder2("hello world"));
        System.out.println(encoder2("Prespecialized"));
        System.out.println(encoder2("   ()(   "));
        System.out.println("method Encoder 3");
        System.out.println(encoder3("hello world"));
        System.out.println(encoder3("Prespecialized"));
        System.out.println(encoder3("   ()(   "));
    }

    public static String encoder(String word) {
        final StringBuilder builder = new StringBuilder();
        final Map<Character, Integer> indexMap = new HashMap<>();
        for (int index = 0; index < word.length(); index++) {
            char ch = Character.toLowerCase(word.charAt(index));
            if(indexMap.containsKey(ch)) {
                int previous = indexMap.get(ch);
                builder.replace(previous, previous+1, ")");
                builder.append(')');
            }else {
                indexMap.put(ch, index);
                builder.append('(');
            }
        }
        return builder.toString();
    }

    public static String encoder2(String word) {
        word = word.toLowerCase(Locale.ROOT);
        String result = "";
        for (int index = 0; index<word.length(); ++index) {
            char ch = word.charAt(index);
            result += word.lastIndexOf(ch) == word.indexOf(ch)? "(":")";
        }
        return result;
    }

    public static String encoder3(String word) {
        return word.toLowerCase(Locale.ROOT)
                .chars()
                .mapToObj(i -> String.valueOf((char)i))
                .map(i -> word.toLowerCase().indexOf(i) == word.toLowerCase().lastIndexOf(i) ? "(" : ")")
                .collect(Collectors.joining());
    }

}
