package Recursion;

public class DP {

//    r N = 4 and S = {1,2,3}, th
    int count=0;

    int findMax(int[] coins, int amount, int n) {
        if (amount == 0 || n == 0) {
            count++;
            return 0;
        } else {
            if (coins[n - 1] < amount) {
                int result = coins[n - 1] + findMax(coins, amount - coins[n - 1], n - 1);
                int second = findMax(coins, amount, n - 1);
                return result > second ? result : second;
            }
            else{
                return findMax(coins, amount, n - 1);
            }
        }
    }

    public static void main(String[] args) {
        DP dp = new DP();
        System.out.println(dp.findMax(new int[] {2, 5, 3, 6}, 10, 4));
        System.out.println(dp.count);
    }
}
