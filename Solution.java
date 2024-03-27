import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[][] mat = {{1, 1}, {9, 9}, {1, 1}};
        System.out.println(findMostFrequentPrime(mat));
    }

    public static int findMostFrequentPrime(int[][] mat) {
        int[] dx = {1, 1, 0, -1, -1, -1, 0, 1};
        int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

        Set<Integer> primes = new HashSet<>();
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        Map<Integer, Integer> countMap = new HashMap<>();
        int maxCount = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                for (int k = 0; k < 8; k++) {
                    int x = i + dx[k];
                    int y = j + dy[k];
                    if (isValid(x, y, mat.length, mat[0].length)) {
                        int num = mat[x][y] * 10 + mat[i][j];
                        if (primes.contains(num)) {
                            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
                            maxCount = Math.max(maxCount, countMap.get(num));
                        }
                    }
                }
            }
        }

        List<Integer> mostFrequentPrimes = new ArrayList<>();
        for (int num : countMap.keySet()) {
            if (countMap.get(num) == maxCount) {
                mostFrequentPrimes.add(num);
            }
        }

        Collections.sort(mostFrequentPrimes);
        return mostFrequentPrimes.get(0);
    }

    private static boolean isValid(int x, int y, int rows, int cols) {
        return x >= 0 && x < rows && y >= 0 && y < cols;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
