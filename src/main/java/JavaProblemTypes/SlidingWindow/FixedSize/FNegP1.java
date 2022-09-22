package JavaProblemTypes.SlidingWindow.FixedSize;

import java.util.ArrayList;
import java.util.List;

// input arr[]  = [-2,4,-5,1,-6,7,-8]
//sub window size=3
// output = -2,-5,-5,-6.-6
public class FNegP1 {

    public void printFirstNegativeNum(int arr[], int k) {
        int i = 0;
        int j = 0;

        List<Integer> list = new ArrayList<>();

        while (j < arr.length) {
            if (arr[j] < 0 ) {
             list.add(arr[j]);
            }

            if (j - i + 1 < k) {
                j++;
            }
            else if (j - i + 1 == k) {
                if(!list.isEmpty()) {
                    System.out.println(list.get(0));
                }
                else{
                    System.out.println(0);
                }
                if(arr[i] == list.get(0)){
                    list.remove(0);
                }
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {-12, 4, -51, -1, 6, -7, 8};
        FNegP1 maxSumSubArray = new FNegP1();
        maxSumSubArray.printFirstNegativeNum(arr, 3);
    }
}
