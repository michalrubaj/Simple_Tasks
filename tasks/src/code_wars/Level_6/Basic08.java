package code_wars.Level_6;

public class Basic08 {

    public static final Integer ONE = 1;

    public static void main(String[] args) {
        System.out.println(nextHigher(127));
    }

    public static int nextHigher(int n) {

        String binaryRep = Integer.toBinaryString(n);

        int howManyOnesInit = counter(binaryRep, ONE);
        int howManyOnesCompare = 0;
        int result = n;

        while(howManyOnesInit != howManyOnesCompare) {
            result++;
            String nextBinary = Integer.toBinaryString(result);
            howManyOnesCompare = counter(nextBinary, ONE);
        }
        return result;
    }

    private static Integer counter(String binary, int which) {
        return (int) binary.chars().map(x -> x - 48).filter(x -> x == which).count();
    }
}
