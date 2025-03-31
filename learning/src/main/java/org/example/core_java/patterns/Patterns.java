package org.example.core_java.patterns;

public class Patterns {

    public static void main(String args[]){

        /*
        * To print any of shape , we use nested loops
        *
        *
        * Note := Print() method does not creates any new line so if
        * we want to print 2 different items in same line we can use
        * the print() method  which is the most useful while printing shapes
        *  but in println() it creates a new line and next item will go the next line only
        *
        * */

        //Square shape
        for(int i=1; i<=4; i++){ // first loop for vertical movement

            for(int j=1; j<=4; j++){ // for Horizontal printing of * by using print() not println()
                System.out.print("*  ");
            }
            System.out.println(); // to move next line
        }


        // Rectangle shape

        for(int i=1; i<=4; i++) { // first loop for vertical movement

            for (int j = 1; j <= 6; j++) { // for Horizontal printing of * by using print() not println()
                System.out.print("*  ");
            }
            System.out.println(); // to move next line
        }


        // holo square
        for (int i=1; i<=4; i++){
            for(int j=1; j<=4; j++){
                if(i==1 || i==4 || j==1 || j==4 ){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                System.out.println();
            }
        }

        // half-Triangle shape
        /*
                *
                *  *
                *  *  *
                *  *  *  *
                *  *  *  *  *
        * */
        for(int i=1; i<=5; i++) { // first loop for vertical movement

            for (int j = 1; j<=i; j++) { // printing * as per value of i and i goes till 5
                 System.out.print("*  ");
            }
            System.out.println(); // to move next line
        }

//
//        // Reverse-half-Triangle shape
//            *  *  *  *  *
//            *  *  *  *
//            *  *  *
//            *  *
//            *
        for(int i=1; i<=5; i++) { // first loop for vertical movement

            for (int j =5-i; j>0; j--) { // decreasing * as per i's value (5-i) till 0
                System.out.print("*  ");
            }
            System.out.println(); // to move next line
        }


        // half-Triangle opposite shape
/*            *
             **
            ***
           ****
          *****
 */
        for(int i=1; i<=5; i++) { // first loop for vertical movement
            for(int j=1; j<=5-i; j++){ //printing the spaces for the next loop stars
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++) { // printing * after the required spaces
                 System.out.print("*");
            }
            System.out.println(); // to move next line
        }



        // full triangle (similar to the previous shape)
        /*
                *
               * *
              * * *
             * * * *
            * * * * *

         */
        for(int i=1; i<=5; i++) { // first loop for vertical movement
            for(int j=1; j<=5-i; j++){ //printing the spaces for the next loop stars
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++) { // printing * as per value of i and i goes till 5
                System.out.print(" *");  // printing * after the required spaces
            }
            System.out.println(); // to move next line
        }




          // butterfly shape

        for(int i=1; i<=5; i++) { // first loop for vertical movement

            for (int j = 1; j<=i; j++) { // printing * as per value of i and i goes till 5
                 System.out.print("*");
            }
            for(int j=1; j<=5-i; j++){ //printing the spaces for the next loop stars
                System.out.print("  "); // double space to match the pattern
            }
            for (int j = 1; j<=i; j++) { // printing * after the required spaces
                System.out.print("*");
            }
            System.out.println(); // to move next line
        }



        for(int i=1; i<=5; i++) { // first loop for vertical movement

            for (int j =5-i; j>0; j--) { // decreasing * as per i's value (5-i) till 0
                System.out.print("*");
            }
            for(int j=1; j<=i; j++){ //printing the spaces for the next loop stars
                System.out.print("  "); // double space
            }
            for (int j =5-i; j>0; j--) { // printing * after the required spaces
                System.out.print("*");
            }
            System.out.println(); // to move next line
        }


    }
}
