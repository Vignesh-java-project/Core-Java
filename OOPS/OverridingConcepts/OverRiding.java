import java.util.*;
class Parent{
    // if m1 is final then it will not be overriden
    // if m1 is private it will not be visible to child class
    public Object m1(int a){
        return a;
    }
}
class Child extends Parent{
    // same methode signature,co-varient return type is allowed and same access modifier
    public String m1(int a){
        return a+"";
    }
}
public class OverRiding {
    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println(p.m1(1)); // calls m1 in child
    }
}