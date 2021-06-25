package com.company;

public class ScalingSquaredStrings {
    public static void main(String[] args) {
        String a ="abcd\nefgh\nijkl\nmnop";
        String r = "aabbccdd\naabbccdd\naabbccdd\neeffgghh\neeffgghh\neeffgghh\niijjkkll\n"
                + "iijjkkll\niijjkkll\nmmnnoopp\nmmnnoopp\nmmnnoopp";
        System.out.println(scale("Kj\nSH", 1, 2));
        System.out.println(scale(a, 2, 3 ));
    }
    public static String scale(String s, int k, int n) {
        String res="";
        for (String retval: s.split("\n")){
            String temp="";
            for (String l: retval.split("")){
                temp+=new String(new char[k]).replace("\0", l);
            }
            res+=new String(new char[n]).replace("\0", temp+"\n");
        }
        return res.trim();
    }
}