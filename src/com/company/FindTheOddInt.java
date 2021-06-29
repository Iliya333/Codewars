package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Function;
import static java.util.stream.Collectors.*;

import static java.util.stream.Collectors.counting;

public class FindTheOddInt {
    public static void main(String[] args) {
        System.out.println(findIt(new int [] {20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));//5
        System.out.println(findIt(new int [] {1,1,2,-2,5,2,4,4,-1,-2,5}));//-1
        System.out.println(findIt(new int [] {20,1,1,2,2,3,3,5,5,4,20,4,5}));//5
        System.out.println(findIt(new int [] {10}));//10
        System.out.println(findIt(new int [] {1,1,1,1,1,1,10,1,1,1,1}));//10
        System.out.println(findIt(new int [] {5,4,3,2,1,5,4,3,2,10,10}));//1
        System.out.println();
        System.out.println();
        System.out.println(findId2(new int [] {20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));//5
        System.out.println(findId2(new int [] {1,1,2,-2,5,2,4,4,-1,-2,5}));//-1
        System.out.println(findId2(new int [] {20,1,1,2,2,3,3,5,5,4,20,4,5}));//5
        System.out.println(findId2(new int [] {10}));//10
        System.out.println(findId2(new int [] {1,1,1,1,1,1,10,1,1,1,1}));//10
        System.out.println(findId2(new int [] {5,4,3,2,1,5,4,3,2,10,10}));//1
    }

    public static int findIt(int [] a) {
       Set<Integer> set = new HashSet<>();
       for (int i : a) {
           if (set.contains(i)) {
               set.remove(i);
           }else set.add(i);
       }
        Iterator<Integer> it  = set.iterator();
       return it.next();
    }

    public static int findId2(int [] a) {
       int xor = 0;
       for (int j: a) {
           xor = xor^j;
       }
       return xor;

    }



}
