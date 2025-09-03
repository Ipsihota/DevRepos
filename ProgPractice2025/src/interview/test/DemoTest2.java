package interview.test;

public class DemoTest2 {
    public static void main(String[] args) {
        Child obj = new Child();
    }
    }


    class Parent {

    Parent(){}
        Parent (String s){
            System.out.println("Parent Class Param  "+s);
        }
    }

    class Child extends Parent {

        Child (){
            this("Constructor");
            System.out.println("Child Class Default Constructor");
        }

        Child (String s){
            System.out.println("Child Class Param "+s);
        }
}