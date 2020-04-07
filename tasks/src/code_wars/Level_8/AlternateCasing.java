package code_wars.Level_8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AlternateCasing {

    public static void main(String[] args) {

        System.out.println(toAlternativeString("StringUtils.toAlternatingCase"));
    }

    public static String toAlternativeString(String string) {

//        StringBuilder sb = new StringBuilder();
//        IntStream.range(0, string.length())
//                .forEach(index -> {
//                    char characterAtIndex = string.charAt(index);
//                    if(Character.isLowerCase(characterAtIndex)) {
//                       sb.append(Character.toUpperCase(characterAtIndex));
//                    } else {
//                       sb.append(Character.toLowerCase(characterAtIndex));
//                    }
//                });
//        return sb.toString();

       return Arrays
               .stream(string.split(""))
               .map(x -> x.matches("[A-z]") ? x.toLowerCase() :  x.toUpperCase())
               .collect(Collectors.joining());
    }
}
