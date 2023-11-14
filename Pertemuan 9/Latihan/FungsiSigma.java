public class FungsiSigma {
    public static int evaluateEquation(int n, int x) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += x + (2 * i);
        }
        return sum;
        }

    public static void main(String[] args) {
        int n = 10;
        int x = 5;
        int result = evaluateEquation(n, x);
        System.out.println("Hasil evaluasi persamaan: " + result);
        }
}

