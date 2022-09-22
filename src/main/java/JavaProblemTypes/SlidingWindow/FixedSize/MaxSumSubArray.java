package JavaProblemTypes.SlidingWindow.FixedSize;


//Find the sub array of size k which has the max sum from array arr of size n
// arr = [2,4,5,1,6,7,8]
//window size/sub-array size =3
// output : 21 => 6+7+8

public class MaxSumSubArray {


    public int findMaxSum(int[] arr, int k) {
        int i = 0;
        int j = 0, sum = 0;
        int max = Integer.MIN_VALUE;

        while (j < arr.length) {
            sum += arr[j];
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (max < sum) {
                    max = sum;
                }
                sum -= arr[i];
                i++;
                j++;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int[] arr = {2, 4, 51, 1, 6, 7, 8};
        MaxSumSubArray maxSumSubArray = new MaxSumSubArray();
        System.out.println(maxSumSubArray.findMaxSum(arr, 3));
    }

}
