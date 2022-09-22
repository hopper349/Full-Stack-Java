package JavaProblemTypes.SlidingWindow.FixedSize;


//        Input 1:
//        A = [1, 3, -1, -3, 5, 3, 6, 7]
//        B = 3
//        Output 1:
//        C = [3, 3, 5, 5, 6, 7]

public class MaxOfSubArray {

    public int[] findMaxArray(int[] arr, int k) {

        int i = 0;
        int j = 0;
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        int result[];
        if(arr.length<k){
            result = new int[1];
        }
        else {
            result = new int[arr.length - k + 1];
        }
        int counter = 0;

        while (j < arr.length) {

            if (max < arr[j]) {
                smax = max;
                max = arr[j];
            } else if (smax < arr[j] && arr[j] < max) {
                smax = arr[j];
            }

            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                result[counter] = max;
                if (max == arr[i]) {
                    max = smax;
                }
                i++;
                j++;
                counter++;
            }

        }

        if(arr.length<k){
             result[0]=max;
        }
        return result;

    }

    public static void main(String[] args) {
        MaxOfSubArray maxOfSubArray = new MaxOfSubArray();
        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};

        int a[] = maxOfSubArray.findMaxArray(arr, 9);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }

}
