package com.company;

public class Second {

    public static void main(String[] args) {
        first(66);
        recursion(66,2);
    }

   private static void first(int n){
       int k = 2;
       while (k * k <= n){
           if (n % k == 0){
               System.out.println(k);
               n = n / k;
               System.out.println('*');
           }else if (k == 2){
               k = 3;
           }else
               k = k+2;
       }
       System.out.println(n);
   }


    public static void recursion(int n, int k) {
        if (k > n / 2) {
            System.out.println(n);
            return;
        }else if (n % k == 0) {
            System.out.println(k);
            recursion(n / k, k);
        }else {
            recursion(n, ++k);
        }
    }
}
