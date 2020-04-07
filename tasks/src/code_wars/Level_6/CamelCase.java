package code_wars.Level_6;

import java.util.Arrays;

public class CamelCase {
    public static void main(String[] args) {
        System.out.println(toCamelCaseStream("the-stealth-warrior"));
    }
    static String toCamelCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '_' && s.charAt(i) != '-') {
                if(i != 0 && (s. charAt(i-1) == '_' || s.charAt(i-1) == '-')) {
                    sb.append(Character.toUpperCase(s.charAt(i)));
                } else {
                    sb.append(s.charAt(i));
                }
            }

        }
        return sb.toString();
    }


    static String toCamelCaseStream(String str) {
        String[] words = str.split("[-_]");
        return Arrays.stream(words, 1, words.length)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .reduce(words[0],String::concat);
    }
}
