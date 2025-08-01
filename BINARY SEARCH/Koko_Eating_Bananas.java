// play with answer here..

class Solution {
    public boolean isValid(int[] piles , int k ,int h){
        long totalHours = 0;

        for(int i=0; i<piles.length; i++){
            int hours = (piles[i]+k-1)/k;
            totalHours += hours;
        }

        return totalHours<=h;
    }

    public int maxPile(int[] piles){
        int result = Integer.MIN_VALUE;

        for(int pile : piles){
            if(pile>result) result = pile;
        }

        return result;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1 , high = maxPile(piles);

        while(low<=high){
            int mid = (low+high)/2;

            if(isValid(piles,mid,h)){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
}