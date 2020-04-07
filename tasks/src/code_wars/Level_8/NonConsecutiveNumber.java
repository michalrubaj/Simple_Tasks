package code_wars.Level_8;

import java.util.stream.IntStream;


/*Your task is to find the first element of an array that is not consecutive.

By not consecutive we mean not exactly 1 larger than the previous element of the array.

E.g. If we have an array [1,2,3,4,6,7,8] then 1 then 2 then 3 then 4 are all consecutive but 6 is not, so that's the first non-consecutive number.

If the whole array is consecutive then return null2.

The array will always have at least 2 elements1 and all elements will be numbers. The numbers will also all be unique and in ascending order. The numbers could be positive or negative and the first non-consecutive could be either too!*/
public class NonConsecutiveNumber {

    public static void main(String[] args) {
        int[] xx = new int[]{-2059, -2057, -2056, -2055, -2054, -2053, -2052, -2051, -2050, -2049};
        System.out.println(find_Stream(xx));

    }

    static Integer find(final int[] array) {
        Integer result = null;
        for (int i = 1; i < array.length; i++) {
            if(array[i] - array[i-1] != 1) {
                return array[i];
            }
        }
        return result;
    }

    static Integer find_Stream(final int[] array) {
        return IntStream.range(1,array.length)
                .filter(i -> array[i] - array[i-1] != 1)
                .mapToObj(x -> new Integer(array[x]))
                .findFirst().orElse(null);
    }
}
