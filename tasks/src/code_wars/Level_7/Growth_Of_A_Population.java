package code_wars.Level_7;

public class Growth_Of_A_Population {

    public static void main(String[] args) {

        System.out.println(nbYear(1500, 5, 100, 5000));
    }

    public static int nbYear(int p0, double percent, int aug, int p) {
        int year = 1;
        double p1 = percent / 100;
        int currentP = (int) (p0 + (p0 * p1)) + aug;
        while (p > currentP) {
            currentP +=  (currentP * p1) + aug;
            year++;
        }
        return year;
    }
}
