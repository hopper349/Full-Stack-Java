package Algo;

public class BubbleSort {

    public int[] sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {5,2,3,1,8,7,2,34,22,99,12};
        int[] sort = new BubbleSort().sort(arr);

        for (int i = 0; i < sort.length; i++) {
            System.out.print(sort[i] + " ");
        }
    }

}
