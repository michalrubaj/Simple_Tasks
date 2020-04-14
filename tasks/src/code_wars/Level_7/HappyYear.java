package code_wars.Level_7;

import java.util.stream.Collectors;

public class HappyYear {
    public static void main(String[] args) {
        System.out.println(nextHappyYear(7712));

    }
    public static int nextHappyYear(int year) {

        String newYear = "";

        while(newYear.length() != 4) {
            newYear = (year + "").chars().distinct().mapToObj(x -> x - 48 + "").collect(Collectors.joining());
            year++;
        }
        return Integer.valueOf(newYear);
    }
}
