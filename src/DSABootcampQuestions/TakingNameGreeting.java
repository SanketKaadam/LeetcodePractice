package DSABootcampQuestions;

import java.util.Scanner;

public class TakingNameGreeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Name ");
        String name = input.nextLine();
        System.out.println("Hello, "+ name +" Have a nice day!");
    }
}
