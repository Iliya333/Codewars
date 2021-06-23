package com.company;

import java.math.BigInteger;

public class BitCounting {
    public static void main(String[] args) {
        System.out.println(countBits1(1234));
        System.out.println(countBits1(4));
        System.out.println(countBits1(7));
        System.out.println(countBits1(9));
        System.out.println(countBits1(10));
        System.out.println("method 2");
        System.out.println(countBits2(1234));
        System.out.println(countBits2(4));
        System.out.println(countBits2(7));
        System.out.println(countBits2(9));
        System.out.println(countBits2(10));
        System.out.println("method 3");
        System.out.println(countBits3(1234));
        System.out.println(countBits3(4));
        System.out.println(countBits3(7));
        System.out.println(countBits3(9));
        System.out.println(countBits3(10));

    }

    public static int countBits1(int n) {
        String i = Integer.toBinaryString(n);
        //System.out.println(i);
        int result = 0;
        for (int index = 0; index < i.length(); index++) {
            if (i.charAt(index) == '1') {
                result++;
            }
        }
        return result;
    }
    public static int countBits2(int n) {
        return Integer.bitCount(n);
    }
    public static int countBits3(int n ) {
        return (int) Integer.toBinaryString(n).chars()
                .filter(c -> c=='1')
                .count();
    }
}
