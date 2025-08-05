import java.util.*;
public class StaticControlFlow {
    static int x=10;
    static {
        m1();
        System.out.println("Inside static block 1");
    }
    public static void main(String[] args) {
        System.out.println("In main");
    }
    static void m1(){
        System.out.println(y);
        System.out.println("Inside m1");
    }
    static {
        System.out.println("Inside static block 2");
    }
    static int y=20;

}
/*
    step 1: identification of static variable
    x=0 [riwo]
    y=0 [riwo]
    step 2 : execution from top to bottom
    x=10 [r&w]
    m1()-> 0
    Inside m1
    Inside static block 1
    Inside static block 2
    y=20 [r&w]
    step 3: execution of main
    In main
 */