class Solution {
    public int countDigits(int num) {
        int original = num , count=0;

        while(num!=0){
            int rem = num%10;
            if(original%rem==0) count++;
            num /= 10;
        }

        return count;
    }
}