package com.company;

import static java.lang.Math.abs;

public class ReturnNegative {
    public static void main(String[] args) {
        System.out.println(makeNegative(2));
        System.out.println(makeNegative(-135));
        System.out.println(makeNegative(9));
        System.out.println(makeNegative(-9));
        System.out.println(makeNegative(-9));
    }
    public static int makeNegative(final int x) {
        return (x < 0) ? x : -x;
    }
}
