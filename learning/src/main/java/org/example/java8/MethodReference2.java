package org.example.java8;



interface Parse{
    String parse(String str);
}
class StringParse{
    public static String convert(String s){
        if(s.length()<=3){
            s = s.toUpperCase();
        }else{
            s = s.toLowerCase();
        }
        return s;
    }
}
class MyPrinter{
    public void print(String s,Parse p){
        s = p.parse(s);
        System.out.println(s);
    }
}
public class MethodReference2 {
    public static void main(String[] args) {
        String str = "Vin";
        MyPrinter mp = new MyPrinter();
        //  mp.print(s, new Parse(){
        //     public String parse(String s){
        //         return StringParse.convert(s);
        //     };
        //  });

        //          OR



        mp.print(str,(s)->StringParse.convert(s));
    }
}