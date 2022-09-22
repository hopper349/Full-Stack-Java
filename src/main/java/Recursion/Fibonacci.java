package Recursion;

import java.util.HashMap;

public class Fibonacci {

    static HashMap<Integer, Integer> map = new HashMap<>();
    static int c = 0;
    static int d = 0;


    static int findFibonacci(int n) {
        c++;
        if (n == 0 || n == 1) {
            return n;
        } else {

            if (!map.containsKey(n)) {
                map.put(n, findFibonacci(n - 1) + findFibonacci(n - 2));
            }
            return map.get(n);
        }
    }

    static int findFibonacci2(int n) {
        d++;
        if (n == 0 || n == 1) {
            return n;
        } else {
              return findFibonacci2(n - 1) + findFibonacci2(n - 2);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(findFibonacci(i) + ", ");
        }
        System.out.println();
        System.out.println(c);
        for (int i = 0; i < 10; i++) {
            System.out.print(findFibonacci2(i) + ", ");
        }
        System.out.println(d);

    }
}
