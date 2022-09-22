package Concepts.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThread {
    int counter;

    public MultiThread(int counter) {
        this.counter = counter;
    }

    public void countMe() {
        for (int i = 1; i <= 2; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("The value of i is : " + i + " and Thread No. is  : " + counter);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 1; i < 5; i++) {
            int finalI = i;
            Runnable worker = () -> {
                new MultiThread(finalI).countMe();
            };
            Thread.sleep(1000);
            executor.execute(worker);
        }
        executor.shutdown();


    }
}
