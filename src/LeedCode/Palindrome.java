package LeedCode;

public class Palindrome {
    public static void main(String[] args){
        int n = 12321;
        int sum=0;
        int temp;
        temp = n;
        int r;

        while(n>0){
            r= n%10; //
            sum= (sum*10)+r;  //1232
            n=n/10; //
        }

        if (sum==n){
            System.out.println("palindrome");
        }else {
            System.out.println("Not palindrome");
        }

    }
}
