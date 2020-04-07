package code_wars.Level_7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AlternateCapitalization {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(capitalize("codewars")));
        System.out.println(Arrays.toString(capitalizeStream("codewars")));
    }

    public static String[] capitalize(String s) {
        String[] result = {"",""};
        for (int i = 0; i < s.length(); i++) {
            if(i % 2 == 0) {
                result[0] += Character.toUpperCase(s.charAt(i));
                result[1] += s.charAt(i);
            } else {
                result[0] += s.charAt(i);
                result[1] += Character.toUpperCase(s.charAt(i));
            }
        }
        return result;
    }

    public static String[] capitalizeStream(String s) {
        StringBuilder sb = new StringBuilder(s),
                      sb2 = new StringBuilder(s.toUpperCase());
        IntStream.range(0, s.length())
                .filter(  i -> (i&1)==0 )
                .forEach( i -> {
                    sb.setCharAt(i, sb2.charAt(i));
                    sb2.setCharAt(i, s.charAt(i));
                });
        return new String[] {sb.toString(), sb2.toString()};
    }


}
