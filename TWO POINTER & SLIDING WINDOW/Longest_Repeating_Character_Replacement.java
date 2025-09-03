class Solution {
    public int characterReplacement(String s, int k) {

        int maxLen = 0 , left = 0 , maxCount = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        for(int right=0; right<s.length(); right++){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);

            maxCount = Math.max(maxCount , map.get(s.charAt(right)));

            if((right-left+1)-maxCount > k){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
            }

            maxLen = Math.max(maxLen , right-left+1);
        }

        return maxLen;
    }
}