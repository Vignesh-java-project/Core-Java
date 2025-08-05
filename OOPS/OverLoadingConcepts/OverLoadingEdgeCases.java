import java.util.*;
public class OverLoadingEdgeCases {
    public static void m1(float f) {
        System.out.println("Inside float arg");
    }
    public static void m1(int i) {
        System.out.println("Inside int arg");
    }

    public static void m2(Object o) {
        System.out.println("Inside Object arg");
    }
    public static void m2(String s) {
        System.out.println("Inside String arg");
    }

    public static void m3(double d) {
        System.out.println("Inside double arg");
    }
    public static void m3(double ...d1) {
        System.out.println("Inside var-arg");
    }

    public static void main(String[] args) {
        // case 1 auto promotion
        m1('a'); /* output will be Inside int arg char will auto promote to int */
        m1(1L); /* output will be Inside float arg long will auto promote to float */

        // case 2 co-varient arguments
        m2("hello"); /* exact match String so output Inside String arg */
        m2(new Object()); /* exact match Object so output Inside Object arg */
        m2(null); /* matches both Object and String but in this case always
        child will get most priority so output is Inside String arg  */

        // case 3 var-arg methode as lover loaded methode
        m3(); /* no exact match so var-arg will get chance */
        m3(10.00,1.24); /* no exact match so var-arg will get chance */
        m3(1.24); /* exact match will get more priority then var-arg methode */

    }
}