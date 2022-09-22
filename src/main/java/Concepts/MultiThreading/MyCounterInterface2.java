package Concepts.MultiThreading;

public class MyCounterInterface2{

    int counter;

    public MyCounterInterface2(int counter) {
        this.counter = counter;
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
        //below method is using Thread Class
        long l = System.currentTimeMillis();

        Thread thread1 = new Thread(() -> {
            new MyCounterInterface2(1).countMe();
        });


        thread1.start();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                new MyCounterInterface2(2).countMe();
            }
        });

        thread.start();

        long l2 = System.currentTimeMillis();
        System.out.println("Time taken " + (l2 - l));
    }
}
