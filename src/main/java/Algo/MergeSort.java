package Algo;

public class MergeSort {


    public int[] sort(int[] arr) {

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

            return mergeArray(first, second);
        }

    }

    public int[] mergeArray(int[] a, int[] b) {
        int[] merge = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                merge[k] = a[i];
                i++;
            } else {
                merge[k] = b[j];
                j++;
            }
            k++;
        }
        if (i < a.length) {
            System.arraycopy(a, i, merge, k, a.length - i);
        } else if (j < b.length) {
            System.arraycopy(b, j, merge, k, b.length - j);
        }
        return merge;
    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int arr[] = {5, 2, 3, 1, 8, 7, 2, 34, 22, 39, 12};

        int sort[] = mergeSort.sort(arr);

        for (int i = 0; i < sort.length; i++) {
            System.out.print(sort[i] + " ");
        }

    }
}