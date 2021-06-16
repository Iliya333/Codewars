package com.company;

public class OddOrEven {
    public static void main(String args[]) {
        System.out.println(oddOrEven(new int[] {2,5,34,6}));//odd
        System.out.println(oddOrEven(new int[] {3,5,34,6}));//odd
        System.out.println(oddOrEven(new int[] {4,5,34,6}));//odd
    }

    public static String oddOrEven(int[] array) {
        int sum = 0;
        for (int i : array) {
          sum= sum + i;
        }
        System.out.println(sum);
        return (sum%2 ==0) ? "even": "odd";

    }

}
