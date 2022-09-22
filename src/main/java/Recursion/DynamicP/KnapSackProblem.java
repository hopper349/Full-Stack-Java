package Recursion.DynamicP;


//wt [1,2,3,4]
//val[4,5,6,8]
//cap 8
// find max profit


import java.util.Arrays;

public class KnapSackProblem {

    public KnapSackProblem() {
        for (int i = 0; i < t.length; i++) {
            Arrays.fill(t[i], -1);
        }
    }

    //recursive approach
    public int maxProfit(int val[], int[] wt, int cap, int n) {
        if (cap == 0 || n == 0)
            return 0;
        else {
            if (wt[n - 1] <= cap) {
                return Math.max(val[n - 1] + maxProfit(val, wt, cap - wt[n - 1], n - 1),
                        maxProfit(val, wt, cap, n - 1));
            } else {
                return maxProfit(val, wt, cap, n - 1);
            }
        }
    }

    //dynamic programming approach
    int t[][] = new int[5][9];

    public int maxProfit1(int val[], int[] wt, int cap, int n) {
        if (cap == 0 || n == 0)
            return 0;
        else {
            if (t[n][cap] != -1) {
                return t[n][cap];
            } else {
                if (wt[n - 1] <= cap) {
                    return t[n][cap] = Math.max(val[n - 1] + maxProfit(val, wt, cap - wt[n - 1], n - 1),
                            maxProfit(val, wt, cap, n - 1));
                } else {
                    return t[n][cap] = maxProfit(val, wt, cap, n - 1);
                }
            }
        }
    }

    //top-down approach
/*    int m[][] = new int[5][9];

    public int maxProfit2(int[] val, int[] wt, int cap) {
        for (int i = 0; i < wt.length + 1; i++) {
            for (int j = 0; j < cap + 1; j++) {
                if (i == 0 || j == 0) {
                    m[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < wt.length + 1; i++) {
            for (int j = 1; j < cap + 1; j++) {

                if (wt[i - 1] <= j) {
                    m[i][j] = Math.max(val[i - 1] + m[i-1][j-wt[i-1]], m[i-1][j]);
                } else {
                    m[i][j] = m[i-1][j];
                }
            }
        }
        return m[wt.length][cap];
    }*/


    public int maxProfit2(int[] val, int[] wt, int cap) {
        int m[][] = new int[wt.length + 1][cap + 1];

        class inner {

            public int calProfit(int[] val, int[] wt, int cap) {
                for (int i = 0; i < wt.length + 1; i++) {
                    for (int j = 0; j < cap + 1; j++) {
                        if (i == 0 || j == 0) {
                            m[i][j] = 0;
                        }
                    }
                }
                for (int i = 1; i < wt.length + 1; i++) {
                    for (int j = 1; j < cap + 1; j++) {
                        if (wt[i - 1] <= j) {
                            m[i][j] = Math.max(val[i - 1] + m[i - 1][j - wt[i - 1]], m[i - 1][j]);
                        } else {
                            m[i][j] = m[i - 1][j];
                        }
                    }
                }
                return m[wt.length][cap];
            }
        }
        return new inner().calProfit(val,wt,cap);
    }


    public static void main(String[] args) {
        KnapSackProblem knapSackProblem = new KnapSackProblem();

        System.out.println(knapSackProblem.maxProfit(new int[]{4, 5, 6, 8}, new int[]{1, 2, 3, 4}, 8, 4));
        System.out.println(knapSackProblem.maxProfit1(new int[]{4, 5, 6, 8}, new int[]{1, 2, 3, 4}, 8, 4));
        System.out.println(knapSackProblem.maxProfit2(new int[]{4, 5, 6, 8}, new int[]{1, 2, 3, 4}, 11));

    }

}
