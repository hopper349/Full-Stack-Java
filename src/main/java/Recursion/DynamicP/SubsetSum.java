package Recursion.DynamicP;

//Input:  set[] = {3, 34, 4, 12, 5, 2}, sum = 9
//        Output: True
//        There is a subset (4, 5) with sum 9.

public class SubsetSum {

    boolean[][] t = new boolean[3][5];

    public boolean isSubsetPresent1(int[] arr, int sum, int n) {
        if (sum == 0) {
            return true;
        } else if (n == 0) {
            return false;
        } else {
            if (arr[n - 1] <= sum){
                return isSubsetPresent1(arr,sum-arr[n-1],n-1) || isSubsetPresent1(arr,sum,n-1);
            }
            else {
                return isSubsetPresent1(arr,sum,n-1);
            }
        }
    }


    //topdown
    public boolean isSubsetPresent(int[] arr, int sum) {

        for (int i = 0; i < arr.length + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (j == 0) {
                    t[i][j] = true;
                } else if (i == 0) {
                    t[i][j] = false;
                }
            }
        }

        for (int i = 1; i < arr.length + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {

                if (arr[i - 1] <= j) {
                    t[i][j] = (t[i - 1][j - arr[i - 1]]) || (t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[arr.length][sum];
    }

    public static void main(String[] args) {
        SubsetSum subsetSum = new SubsetSum();

        System.out.println(subsetSum.isSubsetPresent(new int[]{1, 2}, 3));
        System.out.println(subsetSum.isSubsetPresent1(new int[]{1, 2,4,5}, 23,4));

    }
}
