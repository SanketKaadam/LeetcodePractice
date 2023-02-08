package LeedCode;

public class MaxMinNo {
    public static void main(String[] args) {
        max(10,20,30);
    }

    static void max(int a, int b, int c){
        if (a>b && a>c){
            System.out.println("max"+a);
        } else if (b>a && b>c) {
            System.out.println("max"+ b);
        }else {
            System.out.println("max"+c);
        }
    }
}
