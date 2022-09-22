package Concepts.MultiThreading;

public class MyCounter extends Thread {

    int counter;

    public MyCounter(int counter) {
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
        MyCounter counter1 = new MyCounter(1);
        counter1.start(); //run method will be called by JVM
        System.out.println("***************************************");
        MyCounter counter2 = new MyCounter(2);
        counter2.start();//run method will be called by JVM
        Thread.sleep(1200);
        long l2 = System.currentTimeMillis();
        System.out.println("Time taken " + (l2 - l));
    }
}
