package com.company;



public class ReverseWords {
    public static void main(String args[]) {
        System.out.println(reverseWords("ehT kciuq nworb xof spmuj revo eht yzal .god"));
        System.out.println(reverseWords("The quick brown fox jumps over the lazy dog."));
        System.out.println(reverseWords("  "));
    }

    public static String reverseWords(final String original) {
          String[] words = original.split(" ");
          if (words.length == 0){
              return original;
          }
        StringBuilder builder = new StringBuilder();
        for (String s : words)
        {
            String rev = " ";
            for (int i = 0; i < s.length(); i++)
            {
                rev = s.charAt(i) + rev;
            }

            builder.append(rev);
        }

        return builder.toString().trim();
    }
}




