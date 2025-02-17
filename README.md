# learning
Following best practices for java
1) Naming conventions 
   * classes and interface - PascalCase
   Ex. class Employee{};
   * Methods and Variables - camelCase
   Ex. void setSalary(){};
       private int interest;
   * Constants - UPPER_CASE_WITH_UNDERSCORE
   Ex. private final static int BONUS_RATE = 5;

2) Modular code (Single Responsibility)
    * Each class and methods should have one responsibility
    Ex. Employee class define the salary, on other hand Bonus class calculates the bonus

3) Meaningful comments(Explain why, Not what)
    * Pass required comments

4) Use final, static and private Properly
    * Ex. protected double salary;
    * private final static int BONUS_RATE

5) Use java collection efficiently
    * use of Generics
     Ex. ArrayList<String> newArray = new ArrayList<>();
6) Optimize loops & use streams where possible
    Ex. ArrayList<String> newArray = new ArrayList<>();
      newArray.stream().forEach(System.out::println);
7) 


     