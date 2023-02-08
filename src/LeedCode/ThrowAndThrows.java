package LeedCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowAndThrows {
    public static void main(String[] args) throws ArithmeticException, IOException {

        int i = 100, k=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int j= Integer.parseInt(br.readLine());
        k=i/j;
        System.out.println(k);

    }
}
