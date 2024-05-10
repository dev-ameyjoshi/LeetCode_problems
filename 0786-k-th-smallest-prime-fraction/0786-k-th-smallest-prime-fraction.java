class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        
        int n = arr.length;
        double start = 0; 
        double end = 1.0;
        
        while(start < end){
            double mid = start + (end -start)/2;
            
            double maxFraction = 0.0;
            
            int totalSmallerFractions = 0;
            int numeratorIdx = 0;
            int denIdx = 0;
            int j = 1;
            
            for(int i = 0;i<n;i++){
                while(j < n && arr[i] >= mid * arr[j]){
                    j++;
                }
                
                totalSmallerFractions += (n-j);
                
                if(j == n) break;
                
                double fraction = (double) arr[i] / arr[j];
                
                if(fraction > maxFraction){
                    numeratorIdx = i;
                    denIdx = j;
                    maxFraction = fraction;
                }
            }
            
            if(totalSmallerFractions == k){
                return new int[] {arr[numeratorIdx],arr[denIdx]};
            }else if(totalSmallerFractions>k){
                end = mid;
            }else{
                start = mid;
            }
            
        }
    return new int[]{};
            
            
            
        
        
    }
}