package Practise1;

public class MergeSort {

    public int[] sort(int arr[]) {
        if (arr.length == 1) {
            return arr;
        } else {
            int mid = arr.length / 2;
            int[] first = new int[mid];
            int[] second = new int[arr.length - mid];

            System.arraycopy(arr, 0, first, 0, mid);
            System.arraycopy(arr, mid, second, 0, arr.length - mid);

            first = sort(first);
            second = sort(second);
            return mergeArrays(first, second);
        }
    }

    private int[] mergeArrays(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int k = 0;

        int[] merged = new int[arr1.length + arr2.length];

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                merged[k]=arr1[i];
                i++;
            }
            else{
                merged[k]=arr2[j];
                j++;
            }
            k++;
        }
        if(i<arr1.length){
            System.arraycopy(arr1,i,merged,k,arr1.length-i);
        }
        if(j<arr2.length){
            System.arraycopy(arr2,j,merged,k,arr2.length-j);
        }
        return merged;
    }

    public static void main(String[] args) {
        int[] sort = new MergeSort().sort(new int[]{31,33, 4, 2, 5, 1, 7, 6, 8});

        for (int i : sort) {
            System.out.print(i + " ");
        }
    }
}
