package TD4;

import java.math.BigInteger;

public class Complexite {
    public static void main(String[] args) {
        int somme = 10000;
        int[] pieces = { 1, 2, 5, 10, 20, 50, 100, 200 };
        BigInteger[] possibilites = new BigInteger[somme + 1];
        for (int i = 0; i < possibilites.length; i++) {
            possibilites[i] = BigInteger.valueOf(0);
        }
        possibilites[0] = BigInteger.valueOf(1);
        for (int p : pieces) {
            for (int i = p; i < somme + 1; i++) {
                possibilites[i] = possibilites[i].add(possibilites[i - p]);
            }
        }
        System.out.println(possibilites[somme]);
        int[][] memo = new int[pieces.length][somme];
        for (int i = 0; i < pieces.length; i++) {
            for (int j = 0; j < somme; j++) {
                memo[i][j] = -1;
            }
        }
        // System.out.println(combinationCount(pieces, somme, 0, memo));
    }

    public static int combinationCount(int[] coins, int amount, int index, int[][] memo) {
        if (index == coins.length - 1) {
            if (amount % coins[index] == 0) {
                return 1;
            } else {
                return 0;
            }
        }
        if (memo[index][amount] < 0) {
            int nbOfCombinations = 0;
            for (int i = 0; i * coins[index] <= amount; i++) {
                nbOfCombinations += combinationCount(coins, amount - i * coins[index], i + 1, memo);
            }
            memo[index][amount] = nbOfCombinations;
        }
        return memo[index][amount];
    }

}
