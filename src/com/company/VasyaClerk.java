package com.company;

public class VasyaClerk {
    public static void main(String args[]) {

        System.out.println( Tickets(new int[] {25, 25, 50}));
        System.out.println( Tickets(new int[] {25, 100}));

    }
    public static final int PRICE = 25;
    public static String Tickets(int[] peopleInLine) {

        int a = 0;
        int b = 0;

        for(int i :peopleInLine) {
            if (i == PRICE) {
                a++;
            }else if (i == 50) {
                a--;
                if (a < 0 ) {
                    return "NO";
                }
                b++;
            }else if (i == 100) {
                if (b == 0) {
                    a-=3;
                }else {
                    a--;
                    b--;
                }
                if (a < 0 || b < 0 ) {
                    return "NO";
                }
            }
        }
        return "YES";
}
}
