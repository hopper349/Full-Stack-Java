package Recursion.DynamicP;

public class CoinChangeProblem {

    int[][] t = new int[4][31];

    public int coinMethod(int[] coins, int amount) {

        for (int i = 0; i < coins.length + 1; i++) {
            for (int j = 0; j < amount + 1; j++) {
                if (j == 0) {
                    t[i][j] = 0;
                } else if (i == 0) {
                    t[i][j] = -1;
                }
            }
        }

        for (int i = 0; i < coins.length + 1; i++) {
            for (int j = 0; j < amount + 1; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 1; i < coins.length + 1; i++) {
            for (int j = 1; j < amount + 1; j++) {
                if (coins[i - 1] <= amount) {
                    t[i][j] = Math.min(t[i - 1][j - coins[i - 1]], t[i - 1][j]);
                } else {
                    t[i][j] = (t[i - 1][j]);
                }
            }
        }
        return t[coins.length][amount];


//        if (n == 0 || amount==0) {
//            return 0;
//        }
//        else {
//            if (coins[n - 1] < amount) {
//                return Math.max(1 + coinMethod(coins, amount - coins[coins.length - 1],n),
//                        coinMethod(coins, amount,n-1));
//            }
//            else{
//               return coinMethod(coins, amount,n-1);
//            }
//        }
    }

    public static void main(String[] args) {
        CoinChangeProblem coinChangeProblem = new CoinChangeProblem();

        System.out.println(coinChangeProblem.coinMethod(new int[]{25, 10, 5}, 30));
    }
}
