class Solution {
    public int numberOfSubstrings(String s) {
        int l = 0 , r = 0 , result = 0 , n = s.length();
        int[] map = new int[3];

        while(r<n){
            map[s.charAt(r)-'a']++;

            while(map[0]>0 && map[1]>0 && map[2]>0){
                result += n-r;
                map[s.charAt(l)-'a']--;
                l++;
            }
            r++;
        }
        return result;
    }
}