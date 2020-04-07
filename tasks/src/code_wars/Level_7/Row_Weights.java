package code_wars.Level_7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Row_Weights {
    public static void main(String[] args) {
        int[] x = {13, 27, 49};
        System.out.println(Arrays.toString(rowWeights(x)));
    }
    public static int[] rowWeights (final int[] weights) {
        int[] result = {0, 0};
        IntStream.range(0, weights.length).forEach(i -> result[i % 2] += weights[i]);
        return result;
    }
}
