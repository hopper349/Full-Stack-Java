package Recursion;

public class Reverse {

    static String rever(String word){

        if(word.length()<=1){
            return word;
        }
        else{
            return word.charAt(word.length()-1) + (word.substring(0,word.length()-1));
        }
    }

    public static void main(String[] args) {
        System.out.println(rever("dipanshu"));
    }
}
