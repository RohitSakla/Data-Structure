package com.mylearnings.datastructures;

/**
 * Created by Sakla on 3/11/2017.
 */
public class NearestSmallerElement {
    public static void main(String[] args) {
        int arr[] = {4,3,5,1,2,5,6,2,4,1,100,2,1,1};
        printLeftSmaller(arr);
    }

    private static void printLeftSmaller(int[] arr) {
        System.out.println("Nearest for First is _");
        for(int i=1;i<arr.length;i++) {
            for(int j=i-1;j>=0;j--) {
                if(arr[j]<arr[i]) {
                    System.out.println("Nearest element on Left Hand Side to " + arr[i] + " is " + arr[j]);
                    break;
                }
            }
        }
    }
}
