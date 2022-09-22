package Concepts.MultiThreading;

public class MyCounterInterface implements Runnable {

    int counter;

    public MyCounterInterface(int counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        countMe();
    }

    public void countMe() {
        for (int i = 1; i <= 9; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("The value of i is : " + i + " and Thread No. is  : " + counter);
        }
    }


    public static void main(String[] args) throws InterruptedException {
        long l = System.currentTimeMillis();
        Thread thread1 = new Thread(new MyCounterInterface(1));
        Thread thread2 = new Thread(new MyCounterInterface(2));
        thread1.start();
        thread2.start();

        long l2 = System.currentTimeMillis();
        System.out.println("Time taken " + (l2 - l));
    }
}
