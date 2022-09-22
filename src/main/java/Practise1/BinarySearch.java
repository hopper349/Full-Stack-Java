package Practise1;

public class BinarySearch {

    public boolean search(int[] arr, int lower,int upper,int key){
        if(lower>upper){
            return false;
        }
        else {
            int mid = (upper + lower) / 2;

            if (arr[mid] == key) {
                return true;
            } else if (arr[mid] < key) {
              return   search(arr, mid + 1, upper, key);
            } else if(arr[mid] > key) {
                return search(arr, lower, mid - 1, key);
            }
            return false;
        }
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int arr[] = {1,2,3,4,5,6,7,8};
        System.out.println(binarySearch.search(arr, 0, arr.length - 1, 18));

    }
}
