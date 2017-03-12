package com.mylearnings.datastructures;

import java.util.Arrays;

/**
 * Created by Sakla on 3/11/2017.
 */
public class LinearKthSmallestElement {
    
    public static void main(String[] args) {
        int arr[] = {22,1,21,212,25,4,12};
        int element = findKthSmallestElement(arr,0,arr.length-1,4);
        System.out.println(element);
    }

    private static int findKthSmallestElement(int[] arr,int low,int high, int k) {
        if(k>0 && k<=high-low+1) {
            int n = high-low+1;
            int i,median[] = new int[(n+4)/5];

            for(i=0;i<n/5;i++) {
                median[i] = findMedian(arr, low + i * 5, low + i * 5 + 5);
            }
            System.out.println(Arrays.toString(median));
            System.out.println(Arrays.toString(arr) + "***********");

            if(i*5<n){
                median[i]=findMedian(arr, low + i * 5, low + i * 5 + n%5);
                i++;
            }

            int medOfMedian = (i==1) ? median[i-1] : findKthSmallestElement(median,0,i-1,i/2);

            int pos = partition(arr,low,high,medOfMedian);

            if(pos-low == k-1)
                return arr[pos];
            if(pos-low > k-1)
                return findKthSmallestElement(arr,low,pos-1,k);
            return findKthSmallestElement(arr,pos+1,high,k-pos+low-1);
        }

        return -1;
    }

    

    private static int findMedian(int arr[],int low,int high) {
        Arrays.sort(arr,low,high);
        return arr[low+(high-low-1)/2];
    }
    private static int partition(int[] arr, int low, int high, int medOfMedian) {
        int i;
        for(i=low;i<high;i++)
            if(arr[i]==medOfMedian)
                break;
        swap(arr,i,high);

        i=low;
        for(int j=low;j<=high-1;j++){
            if(arr[j] <= medOfMedian){
                swap(arr, j,i);
                i++;
            }
        }
        swap(arr,i,high);
        return i;
    }

    private static void swap(int[] arr, int ele1, int ele2) {
        int temp = arr[ele1];
        arr[ele1] = arr[ele2];
        arr[ele2] = temp;
    }
}
