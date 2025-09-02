// Optimal

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxLen = 0 , l=0;

        for(int r=0; r<s.length(); r++){
            char c = s.charAt(r);

            while(set.contains(c)){
                set.remove(s.charAt(l));
                l++;
            }
            
            set.add(c);

            maxLen = Math.max(set.size(),maxLen);
            
        }

        return maxLen;

    } 
}