package JavaProblemTypes.SlidingWindow.FixedSize;


//Print first negative integer of window of size k from array arr of size n
// input arr[]  = [-2,4,-5,1,-6,7,-8]
//sub window size=3
// output = -2,-5,-5,-6.-6

import java.util.ArrayList;
import java.util.List;


public class FirstNegative {

    public void printFirstNegativeNum(int arr[], int k) {
        int i = 0, j = 0;
        int neg = 0;
        List<Integer> list = new ArrayList<>();
        while (j < arr.length) {
            if (arr[j] < 0) {
                list.add(arr[j]);
            }
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if(!list.isEmpty()) {
                    System.out.println(list.get(0));
                    if(list.get(0) == arr[i])
                      list.remove(0);
                }
                else{
                    System.out.println(0);
                }
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {-12, 4, -51, -1, 6, -7, 8};
        FirstNegative maxSumSubArray = new FirstNegative();
        maxSumSubArray.printFirstNegativeNum(arr, 3);
    }
}
