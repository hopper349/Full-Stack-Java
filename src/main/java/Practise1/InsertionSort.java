package Practise1;

public class InsertionSort {

    public int[] sort(int arr[]){

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] sort = new InsertionSort().sort(new int[]{21,2,4, 2, 5, 1, 7, 6, 8});

        for(int i:sort){
            System.out.print(i + " ");
        }
    }
}
