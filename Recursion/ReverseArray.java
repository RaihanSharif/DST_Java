package Recursion;

import java.util.Arrays;

public class ReverseArray {

    public static void recursiveReverse(int[] arr, int i, int j) {
        if (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            recursiveReverse(arr, i + 1, j - 1);
        }        
    }

    public static void main(String args[]) {
        int[] myArr = {5, 4, 3, 2, 0};
        System.out.println(Arrays.toString(myArr));
        ReverseArray.recursiveReverse(myArr, 0, myArr.length-1);
        System.out.println(Arrays.toString(myArr));
    }
}