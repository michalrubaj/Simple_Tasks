package code_wars.Level_7;

import java.util.stream.Collectors;

public class HappyYear {
    public static void main(String[] args) {
        System.out.println(nextHappyYear(2120));

    }
    public static String nextHappyYear(int year) {

       return (year+"").chars().distinct().mapToObj(x -> x - 48 + "").collect(Collectors.joining());


    }
}
