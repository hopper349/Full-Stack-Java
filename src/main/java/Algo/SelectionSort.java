package Algo;

public class SelectionSort {

    public int[] sort(int[] arr) {

        for (int i = 0; i < arr.length - 2; i++) {
            int min = i;

            for (int j = i+1; j < arr.length; j++) {
                if(arr[min]>arr[j]){
                    min =j;
                }
            }
            int temp = arr[i];
            arr[i]= arr[min];
            arr[min]=temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {5,2,3,1,8,7,2,34,22,12};
        int[] sort = new SelectionSort().sort(arr);

        for (int i = 0; i < sort.length; i++) {
            System.out.print(sort[i] + " ");
        }
    }

}
