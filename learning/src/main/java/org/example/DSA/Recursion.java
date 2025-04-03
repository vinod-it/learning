package org.example.DSA;

public class Recursion {
           // sum of n natural numbers
//        public static void print(int i,int n,int sum){
//            if(i==n){
//                sum = sum +i;
//                System.out.println(sum);
//                return ;
//            }
//            sum = sum +i;
//            print(i+1,n,sum);
//            System.out.println(i);
//        }


         public static int findFacto(int n){
             if(n==1 || n==0){
                 return 1;
             }
             int fact_nm1 = findFacto(n-1);
             int fact_n = n * fact_nm1;
             System.out.println(n-1);
             return fact_n;
         }

    /**
     *
     * Recursion => when a method calls itself is called Recursion
     *
     * Recursion and Iteration deals in a same way
     *
     */

    public static void main(String[] args) {

          //  print(1,5,0);  // printing the sum of first n natural number
         int n=5;
        System.out.println(findFacto(n));



        }

}
