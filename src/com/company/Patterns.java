package com.company;

public class Patterns {
    public static void main(String[] args) {
        pattern7(5);
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4a(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = 0;
            if (row > n) {
                totalColsInRow = 2 * n - row;
            } else {
                totalColsInRow = row;
            }
            //int totalColsInRow = row > n ? 2 * n - row: row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int row = 1; row <=n; row++) {
            int space = n-row;
            for (int s=1; s<=space; s++){
                System.out.print(" ");
            }
            for (int col=1; col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        int a, b;

        // 1st loop
        for (a = 0; a < n; a++) {

            // nested 2nd loop
            for (b = 2 * (n - a); b >= 0; b--) {
                // printing spaces
                System.out.print(" ");
            }

            // nested 3rd loop
            for (b = 0; b <= a; b++) {
                // printing stars
                System.out.print("* ");
            }

            // end-line
            System.out.println();
        }
    }

    static void pattern7(int n){
        for (int row=n; row<=n; row--){
           int space = n-row;
           for (int s=1; s<=space; s++){
               System.out.print(" ");
           }
           for (int col=1; col<=row; col++){
               System.out.print("* ");
           }
            System.out.println();
        }
    }
}

