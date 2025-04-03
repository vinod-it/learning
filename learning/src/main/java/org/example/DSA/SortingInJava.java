package org.example.DSA;

import java.sql.Array;

public class SortingInJava {

    public static void main(String rag[]){

       // Bubble sort
        /*
        * Takes the largest and puts at the end of the array
        *
        * Time complexity = O(n^2)
        * */
        int[] arr = {6,3,9,2,4};

        for(int i=0; i<arr.length-1; i++){
          for(int j=0; j < arr.length-i-1; j++) {
              if (arr[j] > arr[j + 1]) {
                  int temp = arr[j];
                  arr[j] = arr[j + 1];
                  arr[j + 1] = temp;
              }
          }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        // Selection sort
        /*
         * swapping happens only one time , we put the smallest at the begging
         *
         *  Time complexity = O(n^2)
         */

        for(int i=0; i< arr.length-1; i++){
            int smallest = i;
            for(int j=i+1; j< arr.length-1; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // Insertion sort
        /**
         *
         */
        for(int i=0; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;

            while(j >=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            // placement
            arr[j+1] = current;
        }


        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
