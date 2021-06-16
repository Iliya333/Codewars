package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(modifiedSum(new int[] {2, 15, 4, 3, 6, 5, 5, 12}, 3));
    }

    public static int modifiedSum(int[] array, int power) {

        return Arrays.stream(array).map(x -> (int)Math.pow(x, power)-x).sum(); 

    }
}
