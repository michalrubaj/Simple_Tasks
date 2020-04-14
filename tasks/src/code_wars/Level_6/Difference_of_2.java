package code_wars.Level_6;

import java.util.Arrays;

public class Difference_of_2 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 5, 6};
        int[][] re = twosDifference(arr);
        for (int i = 0; i < re.length; i++) {
            System.out.println(Arrays.toString(re[i]));
        }
    }

    public static int[][] twosDifference(int[] array) {
        return Arrays.
                stream(array).
                sorted().
                filter(i -> Arrays.stream(array).anyMatch(j -> j == i + 2)).
                mapToObj(k -> new int[]{k, k + 2}).
                toArray(int[][]::new);
    }
}
