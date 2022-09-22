package Practise1;

public class BubbleSort {

    public int[] sort(int arr[]){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] sort = new BubbleSort().sort(new int[]{31,4, 2, 5, 1, 7, 6, 8});

        for(int i:sort){
            System.out.print(i + " ");
        }
    }


}
