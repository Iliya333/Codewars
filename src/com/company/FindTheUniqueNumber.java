package com.company;
import java.util.*;
public class FindTheUniqueNumber {
    public static void main(String[] args) {
        System.out.println(findUniq(new double [] {0,1,0}));
        System.out.println(findUniq(new double [] {2,1,2}));
        System.out.println(findUniq(new double [] {1, 1, 1, 2, 1, 1}));
        System.out.println(findUniq(new double [] {0,2,0,0}));
        System.out.println(findUniq(new double [] {2,2,3,2}));
        System.out.println(findUniq(new double [] {2,2,0.55,2}));

    }
    public static double findUniq(double arr[])
    {
        // Сортируем массив по возрастанию, потом ищем где нужное число либо в начале либо в конце
        Arrays.sort(arr);
        if (arr[0] == arr[1]) {
            return arr[arr.length-1];
        }
        return arr[0];
    }
}


