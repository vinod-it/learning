package org.example.DSA;


public class StringBuilders {
     /*
     * In java, Strings are immutable means if we create any string in java
     * we can not modify that string. So to work on strings we gets StringBuilder class
     * which allow us to perform some string operations
     * */
    public static void main(String ars[]){
    StringBuilder sb = new StringBuilder("cerce");
   /*
        System.out.println(sb); // cercey

       // append(): Adds a string (or any data type) to the
        // end of the current StringBuilder object.

       // insert(): Adds a string (or any data type) at a specific
        // index within the StringBuilder object.


        // to insert a new char into existing string
        sb.insert(6," Lanister"); //cercey Lanister
        System.out.println(sb);

        // to append
        sb.append("@"); //cercey Lanister @
        System.out.println(sb);

        // to delete some char from string
        sb.delete(6,17); // ending index is non-exclusive (length is 16 but we use 17 for last index )
        System.out.println(sb);

    */


        // to reverse , we can even use sb.reverse() and also we can use
        // custom way to do that just like below
        for(int i=0; i<sb.length()/2; i++){
            int first = i; // front index
            int last = sb.length()-1-i; // last index

            char first_char = sb.charAt(first); // taking the value of the first index
            char last_char = sb.charAt(last);// taking the value of last index

            sb.setCharAt(i,last_char); // setting the last char to first index
            sb.setCharAt(last,first_char); // setting the first char to last index
        }

        System.out.println(sb);
    }
}
