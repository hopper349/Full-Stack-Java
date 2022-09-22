package Practise1;

public class SelectionSort {

    public int[] sort(int[] arr) {


        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] sort = new SelectionSort().sort(new int[]{21,2,4, 2, 5, 1, 7, 6, 8});

        for(int i:sort){
            System.out.print(i + " ");
        }
    }
}
