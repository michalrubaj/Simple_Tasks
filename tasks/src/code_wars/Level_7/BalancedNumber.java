package code_wars.Level_7;

public class BalancedNumber {
    public static void main(String[] args) {

        System.out.println(balancedNum( 295591));
    }


    public static String balancedNum(long number) {
        String numberAsStr = String.valueOf(number);
        boolean isEven = numberAsStr.length() % 2 == 0;
        int count = isEven ? (numberAsStr.length() - 2) / 2 : (numberAsStr.length() - 1) / 2;
        int sumLeft = 0, sumRight = 0, pointer = 0;
        while(pointer < count) {
            sumLeft += Character.getNumericValue(numberAsStr.charAt(pointer));
            sumRight += Character.getNumericValue(numberAsStr.charAt(numberAsStr.length() - 1 - pointer));
            pointer++;
        }
        return sumLeft == sumRight ? "Balanced" : "Not Balanced";
    }
}

