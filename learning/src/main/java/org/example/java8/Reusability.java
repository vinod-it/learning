package org.example.java8;

public class Reusability {
    public static void main(String[] args) {
       Demo<Integer> intObj = new Demo<>(); // creating Integer type object
       intObj.setElement(12);
        System.out.println(intObj.getElement());

        Demo<String> strObj = new Demo<>(); // creating string type object
        strObj.setElement("re-using class");
        System.out.println(strObj.getElement());

    }
}
class Demo<T>{
    /**
     * T element can be any type while creating its obj
     * so it will be re-usable while making different type of
     * objects of the class(ex. int,str)
     */
    private T element;

    public void setElement(T element){
        this.element = element;
    }

    public T getElement() {
        return element;
    }


}