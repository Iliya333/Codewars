package com.company;

public class PersistentBugger {
    public static void main(String[] args) {
        System.out.println(persistence(39));//3
        System.out.println(persistence(4));//0
        System.out.println(persistence(25));//2
        System.out.println(persistence(999));//4
    }

    public static int persistence(long n) {
        if (n < 10)
            return 0;
            long i = 1;
            for (long l = n; n != 0; n /= 10) {
                i *= (n % 10);
            }

        return persistence(i)+1;
        }

    }

