package com.company;

import java.util.ArrayList;
//Gfg Solution for Sub-array with given sum.
//T(n) = O(n)
public class subArrGivenSum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        int i,sum=0,count=0;
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        for(i = 0;i<n;i++){
            if(s == 0)
                break;
            sum+=arr[i];
            while(sum>s){
                sum-=arr[count];
                count++;
            }
            if(sum==s){
                indexes.add(0,count+1);
                indexes.add(1,i+1);
                return indexes;
            }
        }
        indexes.add(0,-1);
        return indexes;




    }
}

