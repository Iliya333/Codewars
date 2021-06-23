package com.company;

import java.util.*;
import java.util.Locale;

public class DuplicateEncoder {
    public static void main(String[] args) {
        System.out.println(encoder("hello world"));
        System.out.println(encoder("Prespecialized"));
        System.out.println(encoder("   ()(   "));
    }

    public static String encoder(String words) {
        final StringBuilder builder = new StringBuilder();
        final Map<Character, Integer> indexMap = new HashMap<>();
        for (int index = 0; index < words.length(); index++) {
            char ch = Character.toLowerCase(words.charAt(index));
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
}
