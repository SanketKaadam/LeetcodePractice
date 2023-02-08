package LeedCode;
import java.util.Arrays;

public class ConcatenationArray {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    public static int[] getConcatenation(int[] nums) {
        int j;
        int[] arr = new int[2*nums.length];
        for (int i=0; i< nums.length; i++){
            arr[i]=nums[i];
            arr[i+nums.length]=arr[i];
        }
        return arr;
    }
}
