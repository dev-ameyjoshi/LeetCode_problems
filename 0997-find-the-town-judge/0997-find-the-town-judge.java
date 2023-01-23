class Solution {
    public int findJudge(int n, int[][] trust) {
        //base case
        if(trust.length == 0 && n == 1)
            return 1;
        // to set the limit for count and then to decrement trust count on the first person and then decrement              the count for the second person
        int []count = new int[n+1];
        for(int[] person : trust){
            count[person[0]]--;
            count[person[1]]++;
        }
        //To check if the person is the judge else to return the index as -1 as no judge is present.
        for(int person = 0; person<count.length;person++){
            if(count[person] == n-1) return person;
        }
        
        return -1;
        
    }
}