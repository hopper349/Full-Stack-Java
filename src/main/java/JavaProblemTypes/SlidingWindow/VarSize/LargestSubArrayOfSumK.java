package JavaProblemTypes.SlidingWindow.VarSize;


//input
//arr[] = [4,1,1,2,3,1,2,2,1,1,1,3,5]
//sum=5
//find the length of the largest sub array whose sum is 5
//output : 4  [2,1,1,1]
//other sub arrays : [4,1] , [1,1,1,2], [2,3] , [1,1,3], [5]

public class LargestSubArrayOfSumK {

    //will only work in case of positive elements in the array
    public int findLargestSubArray(int arr[], int sum) {

        int i = 0;
        int j = 0;
        int s = 0;
        int max = Integer.MIN_VALUE;

        while (j < arr.length) {
            s += arr[j];

            if (s < sum) {
                j++;
            } else if (s == sum) {
                if (j - i + 1 > max) {
                    max = j - i + 1;
                }
                j++;
            } else {
                while (s > sum) {
                    s -= arr[i];
                    i++;
                }
                j++;
            }
        }
        return max;
    }

    public int bruteForce(int arr[], int sum) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int s = 0;
            for (int j = i; j < arr.length; j++) {
                s += arr[j];
                if (s == sum) {
                    if (j - i + 1 > max) {
                        max = j - i + 1;
                    }
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        LargestSubArrayOfSumK l = new LargestSubArrayOfSumK();
        System.out.println(l.findLargestSubArray(new int[]{4, 1, 1, 1, 1, 1, 2, 3, 1, 2, 2, 1, 1, 1, 3, 5}, 5));
        System.out.println(l.bruteForce(new int[]{4, 1, -1, 1, 1, 2, -3, 1, 2, 2, 1, 1, 1, 3, 5}, 5));

    }

}
