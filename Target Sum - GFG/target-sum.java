//{ Driver Code Starts
//Initial Template for JAVA

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            
            int[] A = new int[N];
            
            for(int i=0 ; i<N ; i++){
                A[i] = Integer.parseInt(S[i]);
            }
            int target = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.findTargetSumWays(A,N, target));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int findTargetSumWays(int[] A , int N, int target) {
        // code here
    int sum = 0;    
    
   
    for(int x : A ){
        sum+=x;
    }   
    
    if(sum<target   || (( sum-target)%2!=0)) return 0;
    int n = A.length;
    int TotalSum = ( sum-target )/2;
    
    int t[][] = new int[n+1][TotalSum+1];
    
    //DP Solution 
    

    t[0][0] = 1;
    for(int i = 1;i<n+1;i++){
        for(int j = 0;j<TotalSum + 1;j++){
            if(A[i-1] <= j){
                t[i][j] = (t[i-1][j-A[i-1]]+t[i-1][j] );
            }
            else{
                t[i][j] = t[i-1][j];
            }
        }
    }
    
    return t[n][TotalSum];
    }
};