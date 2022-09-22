package Recursion;

public class CountDown {

    static int printCountDown(int n){
        System.out.print(n+", ");
        if(n==0){
            return 0;
        }
        else{
            return printCountDown(n-1);
        }
    }

    public static void main(String[] args) {
        printCountDown(10);
    }
}
