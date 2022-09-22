package Concepts.Generics;

import java.util.ArrayList;
import java.util.List;

public class GenMethod {

    /**
     * This method can print a list of any datatype
     * @param data data
     * @param <E> Element
     */
    public <E> void printList(List<E> data) {
        for (E ele : data) {
            System.out.println(ele);
        }
    }

    /**
     * This method can print a list of any datatype
     * @param data data
     * @param <T> Element
     */
    public <T> void printArray(T[] data) {
        for (T ele : data) {
            System.out.println(ele);
        }
    }


    /**
     * This method can print a list of any datatype
     * @param data data
     * @param <N> Element
     */
    public <N> void printAr(N[] data) {
        for (N ele : data) {
            System.out.println(ele);
        }
    }


    public static void main(String[] args) {
        GenMethod genMethod = new GenMethod();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        genMethod.printList(list);
        System.out.println("***********************************");
        List<String> str = new ArrayList<>();
        str.add("one");
        str.add("two");
        str.add("three");
        str.add("four");
        genMethod.printList(str);
        System.out.println("***********************************");

        Integer[] arr ={10,20,30,40};
        genMethod.printArray(arr);

        System.out.println("***********************************");

        Integer[] arr1 ={11,21,31,41};
        genMethod.printAr(arr1);
    }
}
