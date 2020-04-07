package code_wars.Level_7;

import java.util.Arrays;

public class DivisibilityBy7 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(seven(1603)));
    }
    public static long[] seven(long m) {
        int count = 0;
        while (m >= 100) {
            int lastDigit = (int) m % 10;
            m /= 10;
            m = m - 2 * lastDigit;
            count++;
        }

        return new long[] {m,count};
    }
}
