class Solution {
    public int lengthOfLastWord(String s) {
        String x = s.trim();
        int l = 0;
        for(int i=0; i<x.length(); i++){
            if(x.charAt(i) == ' ')
                l = 0;
            else 
                l += 1;
        }
        return l;
    }
}
