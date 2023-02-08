package DSABootcampQuestions;

import java.util.Scanner;

  public class EvenOddNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any No : ");
        int n = input.nextInt();
        if(n%2==0){
            System.out.println("No is Even");
        }else {
            System.out.println("No is Odd");
        }

    }
}
