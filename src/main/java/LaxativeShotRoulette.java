public class LaxativeShotRoulette {
    public static double getChance(int n, int x, int a) {
        double c = 1;

        for (int i = 0; i < a; i++) {
            c *= (double) (n - x - i)/(n - i);
        }
        return Double.parseDouble(String.format("%.2f",c));
    }
}