class Solution {
    public int titleToNumber(String columnTitle) {
        int i=columnTitle.length()-1 , res=0;

        for(char ch : columnTitle.toCharArray()){
            res += (ch-'A'+ 1) * Math.pow(26,i);
            i--;
        }

        return res;
    }
}