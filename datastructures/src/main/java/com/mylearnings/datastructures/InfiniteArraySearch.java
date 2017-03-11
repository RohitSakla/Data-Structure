package com.mylearnings.datastructures;

/**
 * Created by Sakla on 3/11/2017.
 */
public class InfiniteArraySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,11,22,33,43,54,66,68,70,81,88,90,100,101};
        int ans = findPos(arr,22);
        if(ans == -1)
            System.out.println("Element not Found");
        else
            System.out.println("Element found at Position " + ans);
    }

    private static int findPos(int[] arr,int key) {
        int low =0,high =1;
        int val = arr[0];

        while(val < key) {
            System.out.println(low + " " + high);
            low = high;
            high = ((high * 2)>arr.length-1)?arr.length-1:(high*2);
            val = arr[high];
        }
        return binarySearch(arr,low,high,key);
    }

    private static int binarySearch(int[] arr, int low, int high, int key) {

        if(low>high)
            return -1;

        int mid = (low + high)/2;

        if(arr[mid] == key)
            return mid;

        if(arr[mid] > key)
            return binarySearch(arr,low,mid-1,key);
        else
            return binarySearch(arr,mid+1,high,key);
    }



}
