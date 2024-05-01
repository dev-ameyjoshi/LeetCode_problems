class Solution {
    void swap(StringBuilder sb, int i , int j){
        char temp = sb.charAt(i);
        sb.replace(i,i+1,""+sb.charAt(j));
        sb.replace(j,j+1,""+temp);
    }
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder(word);
        int start = word.indexOf(ch);
        int starts = 0;
        int end = start;
        
        while(starts<end){
            swap(sb,starts,end);
            starts++;
            end--;
        }
        return sb.toString();
    }
}