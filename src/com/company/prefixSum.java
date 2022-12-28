package com.company;
import java.io.*;

public class prefixSum {
    static void fillPrefixSum(int arr[],int n,int prefixSumNew[]){
        prefixSumNew[0] = arr[0];
        for (int i = 1;i<n;++i) {
            prefixSumNew[i] = prefixSumNew[i-1] + arr[i];

        }
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        int n = arr.length;
        int prefixSumNew[] = new int[n];


        fillPrefixSum(arr,n,prefixSumNew);
        for (int i = 0;i<n;i++) {
            System.out.print(prefixSumNew[i] + " ");
            System.out.println("");
        }
    }
}
