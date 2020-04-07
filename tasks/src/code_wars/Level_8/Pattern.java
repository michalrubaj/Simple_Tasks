package code_wars.Level_8;
/*
* Task:
You have to write a function pattern which returns the following Pattern (See Pattern & Examples) upto n number of rows.

Note: Returning the pattern is not the same as Printing the pattern.
Rules/Note:
If n < 1 then it should return "" i.e. empty string.
There are no whitespaces in the pattern.
Pattern:
(n)(n-1)(n-2)...4321
(n)(n-1)(n-2)...432
(n)(n-1)(n-2)...43
(n)(n-1)(n-2)...4
...............
..............
(n)(n-1)(n-2)
(n)(n-1)
(n)
Examples:
pattern(4):

4321
432
43
4
pattern(11):

1110987654321
111098765432
11109876543
1110987654
111098765
11109876
1110987
111098
11109
1110
11
Hint: Use \n in string to jump to next line
*
* */
public class Pattern {

    public static void main(String[] args) {

        System.out.println(pattern(5));

    }

    public static String pattern(int n) {
        if(n < 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                sb.append(j);
            }
            if(i < n - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();

    }

}
