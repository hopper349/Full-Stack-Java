package Algo;

public class InsertionSort {
    public int[] sort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int key = arr[i];

            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    //    {2,5,3,1,8,7,2,34,22,12}3
//    {2,_,5,1,8,7,2,34,22,12}
    public static void main(String[] args) {
        int arr[] = {5, 2, 3, 1, 8, 7, 2, 34, 22, 39, 12};
        int[] sort = new InsertionSort().sort(arr);

        for (int i = 0; i < sort.length; i++) {
            System.out.print(sort[i] + " ");
        }
    }


}
