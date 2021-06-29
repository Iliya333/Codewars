package com.company;
import static java.util.Arrays.stream;
import static java.util.Comparator.comparing;
public class HighestScoringWord {
    public static void main(String[] args) {
        System.out.println(high("man i need a taxi up to ubud"));//taxi
        System.out.println(high("what time are we climbing" +
                " up to the volcano"));//volcano
        System.out.println(high("aa b"));//aa
        System.out.println(high("b aa"));//b
        System.out.println(high("bb d"));//bb
        System.out.println(high("aaa b"));//aaa
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(high1("man i need a taxi up to ubud"));//taxi
        System.out.println(high1("what time are we climbing" +
                " up to the volcano"));//volcano
        System.out.println(high1("aa b"));//aa
        System.out.println(high1("b aa"));//b
        System.out.println(high1("bb d"));//bb
        System.out.println(high1("aaa b"));//aa

    }

    public static String high(String s) {
        String[] cs = s.split(" ");
        int max = 0;
        String result = null;
        for (String word : cs) {
            char [] wordChars = word.toCharArray();
            int total = 0;
            for (int j = 0; j < wordChars.length; j++) {
                total = total + (int) wordChars[j]-96;
            }
            if (total > max) {
                result  = word;
                max = total;
            }

        }
        return result;
    }
    public static String high1(String s) {
        return stream(s.split(" "))
                .max(comparing(str -> str.chars().map(charr -> charr -96).sum()))
                .get();
    }
}
