package com.company;

public class RegexValidatePinCode {
    public static void main(String[] args) {
        System.out.println(validatePin("1234"));
        System.out.println(validatePin("0000"));
        System.out.println(validatePin("1111"));
        System.out.println(validatePin("123456"));
        System.out.println(validatePin("a98765"));
        System.out.println(validatePin("1"));
        System.out.println(validatePin("12345"));
        System.out.println();
        System.out.println();
        System.out.println(validatePin2("1234"));
        System.out.println(validatePin2("0000"));
        System.out.println(validatePin2("1111"));
        System.out.println(validatePin2("123456"));
        System.out.println(validatePin2("a98765"));
        System.out.println(validatePin2("1"));
        System.out.println(validatePin2("12345"));

    }
    public static boolean validatePin(String pin) {
        if(pin.length()== 4 || pin.length()== 6) {
            for (char c : pin.toCharArray())
            {
                if (!Character.isDigit(c)) return false;
            }
            return true;
        } else {
            return false;
    }
}
    public static boolean validatePin2(String pin) {
        return pin.matches("\\d{4}|\\d{6}");
    }
}
