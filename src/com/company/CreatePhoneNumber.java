package com.company;

public class CreatePhoneNumber {
    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
        System.out.println(createPhoneNumber(new int [] {9, 2, 3, 6, 5, 5, 8, 2, 6, 7}));
            // => returns "(123) 456-7890"
        System.out.println(createPhoneNumber2(new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
        System.out.println(createPhoneNumber2(new int [] {9, 2, 3, 6, 5, 5, 8, 2, 6, 7}));
    }
    public static String createPhoneNumber(int[] numbers) {
        // колхозное решение(((
        StringBuilder sb = new StringBuilder();
        sb.append("(").append(numbers[0]).append(numbers[1])
                .append(numbers[2]).append(")").append(" ").append(numbers[3])
                .append(numbers[4]).append(numbers[5]).append("-").append(numbers[6])
                .append(numbers[7]).append(numbers[8]).append(numbers[9]);

        return sb.toString();
    }
    public static String createPhoneNumber2(int[] numbers) {
        String phoneNumber = "(xxx) xxx-xxxx";
        for (int i : numbers) {
            phoneNumber = phoneNumber.replaceFirst("x", Integer.toString(i));

        }
        return phoneNumber;
    }

}
