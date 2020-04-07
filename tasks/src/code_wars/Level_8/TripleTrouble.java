package code_wars.Level_8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TripleTrouble {
    public static void main(String[] args) {
        System.out.println(tripleTrouble("aa","bb","cc"));
    }
    public static String tripleTrouble(String one, String two, String three) {
      return IntStream.range(0, one.length()).mapToObj(x -> "" + one.charAt(x) + two.charAt(x) + three.charAt(x)).collect(Collectors.joining());
    }
}
