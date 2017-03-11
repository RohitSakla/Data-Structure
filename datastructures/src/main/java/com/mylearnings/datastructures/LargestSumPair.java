package com.mylearnings.datastructures;

/**
 * Created by Sakla on 3/11/2017.
 */
public class LargestSumPair {
    public static void main(String[] args) {
        int arr[] = {1,23,34,21,5,6,5,33,2,1};
        findLargestSumPair(arr);
    }

    private static void findLargestSumPair(int[] arr) {
        int max1,max2;

        if(arr[0]>arr[1]) {
            max1=arr[0];
            max2=arr[1];
        } else {
            max1=arr[1];
            max2=arr[0];
        }

        for(int i=2;i<arr.length;i++) {
            if(arr[i] > max1) {
                max2=max1;
                max1=arr[i];
            } else if(arr[i] < max1 && max2< arr[i]) {
                max2 = arr[i];
            }
        }
        System.out.println(max1 + " " + max2);
    }
}
