package code_wars.Level_7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        System.out.println(remove("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));
    }
    public static String remove(String s) {
        return Arrays.stream(s.split(" ")).distinct().collect(Collectors.joining(" "));
    }
}
