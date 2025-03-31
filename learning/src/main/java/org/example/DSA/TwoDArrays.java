package org.example.DSA;

import java.util.Scanner;

public class TwoDArrays {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int newArray[][] = new int[row][col]; // syntax of 2d array

/*
                // input
        //row
        for(int i=0; i<row; i++){
            //column
            for(int j=0; j<col; j++){
                newArray[i][j] = sc.nextInt();
            }

        }


               // output
        for (int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(newArray[i][j]+" ");
            }
            System.out.println();
        }


 */

        // finding a number in 2d array (x)

        for(int i=0; i<row; i++){
            //column
            for(int j=0; j<col; j++){
                newArray[i][j] = sc.nextInt();
            }

        }

        int x = sc.nextInt();

        for (int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(newArray[i][j] ==x){
                    System.out.println("Found at " + newArray[i][j]);
                }

            }

        }
    }
}
