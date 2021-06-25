package com.company;

public class FindTheMissingLetter {
    public static void main(String[] args) {
        System.out.println(findTheMissingLetter(new char[] {'a','b','c','d','f'}));
        System.out.println(findTheMissingLetter(new char[] {'O','Q','R','S'}));
    }
    public static char findTheMissingLetter(char[] array) {

        char ch = array[0];
        for (char letter : array) {
            if (letter != ch)
                break;
            ch++;
        }
        return ch;
    }
}
