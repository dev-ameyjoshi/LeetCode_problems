package com.company;

//Geeks for Geeks Problem to find next greater element.
//Solution to the question is as follows :
//Used Double ended queue.
//Method only solves the problem,use the main method to call the method and pass custom input.

import java.util.*;
public class next_greater_element {

    public static long[] nextLargerElement(long[] arr, int n)
    {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        long[] res = new long[arr.length];
        for(int i = 0;i<n;i++){
            while(!stack.isEmpty() && arr[stack.peek()]<arr[i] ){
                res[stack.peek()] = arr[i];
                stack.pop();
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            res[stack.pop()] = -1;

        }
        return res;
    }

}
