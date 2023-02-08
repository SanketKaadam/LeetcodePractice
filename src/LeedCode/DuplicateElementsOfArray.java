package LeedCode;

import java.util.ArrayList;

public class DuplicateElementsOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,7,8,8,3};
        findDuplicates(arr, arr.length);

        Integer a= 10;
        Double b=20.2;
    }

    static void findDuplicates(
            int arr[], int len)
    {

        // initialize ifPresent as false
        boolean ifPresent = false;

        // ArrayList to store the output
        ArrayList<Integer> al = new ArrayList<Integer>();

        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j]) {
                    // checking if element is
                    // present in the ArrayList
                    // or not if present then break
                    if (al.contains(arr[i])) {
                        break;
                    }

                    // if element is not present in the
                    // ArrayList then add it to ArrayList
                    // and make ifPresent at true
                    else {
                        al.add(arr[i]);
                        ifPresent = true;
                    }
                }
            }
        }

        // if duplicates is present
        // then print ArrayList
        if (ifPresent == true) {

            System.out.print(al + " ");
        }
        else {
            System.out.print(
                    "No duplicates present in arrays");
        }
    }

}
