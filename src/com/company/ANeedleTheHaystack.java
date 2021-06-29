package com.company;

import java.util.Arrays;

public class ANeedleTheHaystack {
    public static void main(String[] args) {
        Object[] haystack1 = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
        Object[] haystack2 = {"283497238987234", "a dog", "a cat", "some random junk", "a piece of hay", "needle", "something somebody lost a while ago"};
        Object[] haystack3 = {1,2,3,4,5,6,7,8,8,7,5,4,3,4,5,6,67,5,5,3,3,4,2,34,234,23,4,234,324,324,"needle",1,2,3,4,5,5,6,5,4,32,3,45,54};
        System.out.println(  findNeedle(haystack1));
        System.out.println(findNeedle(haystack2));
        System.out.println(findNeedle(haystack3));
        System.out.println();
        System.out.println();
        System.out.println(  findNeedle2(haystack1));
        System.out.println(findNeedle2(haystack2));
        System.out.println(findNeedle2(haystack3));
    }
    public static String findNeedle(Object[] haystack) {
        String needle = "needle";
        int j = 0;
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == needle) {
                j = i;
            }
        }
        return "found the needle at position " + j;

    }

    public static String findNeedle2(Object[] haystack) {
        return String.format("found the needle at position %d", Arrays.asList(haystack).indexOf("needle"));
    }
}