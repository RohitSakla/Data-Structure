package com.mylearnings.datastructures;

/**
 * Created by Sakla on 3/11/2017.
 */
public class SearchOne {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,4,4,5,6,6};
        search(arr,0,arr.length-1);
    }

    private static void search(int[] arr, int low, int high) {
        if(low>high)
            return;
        if(low==high)
            System.out.println("The element that appears only once is "+arr[low]);

        int mid = (low + high)/2;

        if(mid % 2 ==0)
            if(arr[mid] == arr[mid +1])
                search(arr,mid+2,high);
            else
                search(arr,low,mid-1);
        else
            if(arr[mid] == arr[mid - 1])
                search(arr,mid-2,high);
            else
                search(arr,low,mid-1);
    }

}
