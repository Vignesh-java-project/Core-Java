import java.util.*;
public class OverLoading {
    public static void m1(int a){
        System.out.println("In int methode");
    }
    public static void m1(float a){
        System.out.println("In Float methode");
    }
    public static void main(String[] args) {
        OverLoading.m1(1);
        OverLoading.m1(1.1f);
    }
}
