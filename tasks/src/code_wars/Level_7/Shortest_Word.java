package code_wars.Level_7;

import java.util.Arrays;

public class Shortest_Word {
    public static void main(String[] args) {
        System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));
    }
    public static int findShort(String s) {
        return Arrays.stream(s.split(" "))
                .mapToInt(String::length)
                .min().getAsInt();
    }
}
