package DSABootcampQuestions;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any No : ");
        int n = input.nextInt();
        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.println(n1);
        System.out.println(n2);

        for (int i = 2;i < n; ++i){
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
    }
}
