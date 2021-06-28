package com.company;

public class RemoveStringSpaces {
    public static void main(String [ ] args) {
        System.out.println(noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
    }

    static String noSpace(final String x) {
        return x.replaceAll(" ", "");
    }
}
