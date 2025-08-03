class Solution {
    public int findHigh(int[] bloomDay){
        int res = Integer.MIN_VALUE;

        for(int day : bloomDay){
            if(res<day) res = day;
        }

        return res;
    }

    public boolean isValid(int[] bloomDay, int m, int k , int ans){
        int count = 0 , bouqets = 0;

        for(int day : bloomDay){
            if(day<=ans){
                count++;
            }
            else{
                bouqets += count/k;
                count = 0;
            }
        }
        bouqets += count/k;

        return bouqets>=m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int low = 1 , high = findHigh(bloomDay) , res = -1;

        while(low<=high){
            int mid = (low + high)/2;

            if(isValid(bloomDay,m,k,mid)){
                res = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return res;
    }
}