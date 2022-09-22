package DS;

import java.util.ArrayList;

public class StackGen<T> {

    ArrayList<T> arrayList = new ArrayList<>();
    private int size = 0;

    public void push(T element) {
        arrayList.add(element);
        size++;
    }

    public void pop() {
        if(size>0) {
            arrayList.remove(size - 1);
            size--;
        }
        else {
            throw new IndexOutOfBoundsException();
        }
    }

    public int getSize() {
        return size;
    }

    public T peek(){
        return arrayList.get(size-1);
    }

    @Override
    public String toString(){
        String str="[";
        for(int i=0;i<arrayList.size()-1;i++){
            str+=arrayList.get(i)+",";
        }
        str+=arrayList.get(size-1)+"]";
        return str;
    }


    public static void main(String[] args) {
        StackGen<Integer> integerStackGen = new StackGen<>();
        integerStackGen.push(10);
        integerStackGen.push(11);
        integerStackGen.push(12);
        System.out.println(integerStackGen.peek());
        System.out.println(integerStackGen);
        integerStackGen.pop();
        System.out.println(integerStackGen.peek());
        System.out.println(integerStackGen);
        integerStackGen.pop();
        System.out.println(integerStackGen.peek());
        integerStackGen.pop();
        System.out.println(integerStackGen.getSize());
        System.out.println(integerStackGen.peek());
        integerStackGen.pop();

    }
}
