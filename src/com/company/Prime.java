package com.company;

public class Prime {
    public static void main(String[] args) {
        System.out.println(  isPrime(2));
        System.out.println(  isPrimeOfNumber(2));
//        double d =Math.sqrt(6);
//        System.out.println(d);
//        System.out.println(75 % 2 );
    }


    public static boolean isPrime(int num) {
     boolean prime = true;
     for (int i = 3; i <= Math.sqrt(num); i+=2 ) {
         if (num % i == 0) {
             prime = false;
             break;
         }
     }
     return (num % 2 != 0 && prime && num >2) || num ==2;
}

public static boolean isPrimeOfNumber(int num) {
        return  num > 1 && java.math.BigInteger.valueOf(num).isProbablePrime(20);
}
}
