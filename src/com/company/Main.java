package com.company;

public class Main {

    private static int result = 0;

    public static void main(String[] args) {
        System.out.println(reverse(123456));
    }


    public static int reverse(int x){
            result += x % 10;
            x /= 10;
            if(x != 0){
                result *= 10;
            }
            if(x!=0){
                reverse(x);
            }
            return result;
    }



}
