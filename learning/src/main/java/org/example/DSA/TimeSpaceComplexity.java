package org.example.DSA;

import java.util.Scanner;

public class TimeSpaceComplexity {

      /*
      *  Time complexity => It is an relation between input size and running time
      *
      *  Some common complexities-
      *   O(1): Constant time
      *   O(log n): Logarithmic time
      *   O(n): Linear time
      *   O(n log n): Linearithmic time
      *   O(n^2): Quadratic time
      *   O(2^n): Exponential time
      *   O(n!) : Factorial time
      * */

    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

     int n = sc.nextInt();

     // Time complexity - O(1) constant
        System.out.println("hello"); // just one unit of work

     // time complexity - O(n)
       for(int i=0; i<n; i++){ // if n = 1 then time taken would be 1 unit and so on
        System.out.println("hello world");// so time complexity = O(n) (big o of n) as
                                         // it has proportional relation (time equally increasing with n)
       }

     // Time complexity - O(n^2)
       for(int i=1; i<n; i++){// on every value of i , j working n times.
           for(int j=1; j<n; j++){
               System.out.println("hello"); // so, it is n x n = n^2
           }
       }



       /*
       * Space complexity measures the amount of memory space required by an algorithm
       *  as a function of the input size
       *
       *  Some common complexities-
        *   O(1): Constant time
        *   O(n): Linear time
        *   O(n^2): Quadratic time
       * */

    }

    // space complexity - O(1)
     int sum(int a,int b){
        int result = a + b; // stores one variable
        return result;
    }


    // space complexity - O(n) linear
    int[] arr(int[] newArr){
        int[] copy = new int[newArr.length]; // Space grows proportionally to users input
        for (int i = 0; i < newArr.length; i++) {
            copy[i] = newArr[i];
        }
        return copy;
    }
}

