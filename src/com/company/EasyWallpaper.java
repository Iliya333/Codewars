package com.company;
import java.util.*;
import java.util.stream.Collectors;

public class EasyWallpaper {


    public static void main(String[] args) {

        System.out.println( wallpaper(4, 3.5, 3)); // десять
        System.out.println( wallpaper(6.3, 4.5, 3.29)); //шустнадцать
        System.out.println( wallpaper(6.3, 5.8, 3.13)); // семнадцать
        System.out.println( wallpaper(0.0, 3.5, 3.0)); // ноль
        System.out.println( wallpaper(10.0, 3.5, 3.0)); // ноль
        System.out.println( wallpaper(4.5, 3.5, 3)); // ноль


    }
    enum Numbers {
        zero(0), one(1), two(2), three(3),four(4),five(5),
        six(6),seven(7),eight(8),nine(9),ten(10),eleven(11),
        twelve(12),thirteen(13),fourteen(14),fifteen(15),
        sixteen(16),seventeen(17),eighteen(18),nineteen(19),twenty(20);
        private int value;
        Numbers (int value) {
            this.value =value;
        }
        public int getValue() {
            return value;
        }
        public  static List<Numbers> getReverseNumber() {
            return Arrays.stream(values()).
                    sorted(Comparator.comparing((Numbers x) -> x.value).reversed())
                    .collect(Collectors.toList());
        }
    }


    public static String wallpaper(double l, double w, double h) {
        if (l <= 0 | w<=0 | h <=0) {
        return String.valueOf(Numbers.zero);
    }
    double value2 = Math.ceil ((l * h * 2 + w * h * 2) * 1.15 / 5.2);
        System.out.println(value2);
        List<Numbers> numbers  = Numbers.getReverseNumber();
        int f = 0;
        StringBuilder sb = new StringBuilder();

        while ((value2 >0)  && (f < numbers.size())){
            Numbers currentString = numbers.get(f);
            if (currentString.getValue() <= value2) {
                sb.append(currentString.name());
                value2 -= currentString.getValue();
            } else {
                f++;
            }

    }
        return sb.toString();
}
}
