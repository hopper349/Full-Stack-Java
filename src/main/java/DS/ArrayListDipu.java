package DS;

public class ArrayListDipu<T> {

    private int size = 0;
    private int defaultSize = 16;
    private Object[] arr;
    private int maxSize;

    public ArrayListDipu() {
        arr = new Object[defaultSize];
        maxSize = defaultSize;
    }

    public ArrayListDipu(int customSize) {
        arr = new Object[customSize];
        maxSize=customSize;
    }

    public void add(T element) {
        if (size == maxSize)
        {
            maxSize*=2;
            Object[] arr2 = new Object[maxSize];
            System.arraycopy(arr,0,arr2,0,size);
            arr = arr2;
        }
        arr[size] = element;
        size++;
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                arr[i] = arr[i + 1];

            }
            size--;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        String str = "[";
        for (int i = 0; i < size - 1; i++) {
            str += arr[i] + ",";
        }
        str += arr[size - 1] + "]";
        return str;
    }

    public static void main(String[] args) {
        ArrayListDipu<Integer> arry = new ArrayListDipu<Integer>();
        arry.add(10);
        arry.add(11);
        arry.add(12);
        arry.add(13);
        arry.add(14);
        arry.add(15);
        arry.remove(2);
        System.out.println(arry.getSize());
        System.out.println(arry);


        ArrayListDipu<String> strArray = new ArrayListDipu<>(3);
        strArray.add("One");
        strArray.add("Two");
        strArray.add("Three");
        strArray.add("four");
        System.out.println(strArray);
    }

}



