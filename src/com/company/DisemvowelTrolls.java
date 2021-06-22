package com.company;

import java.util.Locale;

public class DisemvowelTrolls {
    public static void main(String[] args) {
        System.out.println(disemvowel("This website is for losers LOL!"));
    }
    public static String disemvowel(String str) {
        String c [] = {"a","A", "e","E", "i","I", "o","O", "u","U"} ;
        for (int i = 0; i< c.length; i++){
            str = str.replace(c[i],"");
        }
        return str;
    }

    //либо
    // return str.replaceAll("[aAeEiIoOuU]", "");
}
