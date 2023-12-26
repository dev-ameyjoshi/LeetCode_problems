//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            int n = Integer.parseInt(read.readLine());
            String str = read.readLine().strip();
            Solution ob = new Solution();
            long ans = ob.minDeletions(str, n); 
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int minDeletions(String str, int n)
    {
        // code here
        // Initialization 
        String p = new StringBuilder(str).reverse().toString();
        int u = p.length();
        int s = str.length();
        int t[][] = new int [n+1][u+1];
        
        //Top down LPS 
        
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=u;j++){
                if(str.charAt(i-1) == p.charAt(j-1)){
                    t[i][j] = 1+t[i-1][j-1];
                }else{
                    t[i][j] = Math.max(t[i][j-1],t[i-1][j]);
                }
            }
        }
        
        return (n-t[n][u]);
    }
} 