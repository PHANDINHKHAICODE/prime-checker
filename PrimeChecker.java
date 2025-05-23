public class PrimeChecker {
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 20;
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i + " là số nguyên tố.");
            }
        }
    }
}

